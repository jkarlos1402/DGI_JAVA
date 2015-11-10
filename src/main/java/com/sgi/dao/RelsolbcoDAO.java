package com.sgi.dao;

import com.sgi.pojos.Relsolbco;
import com.sgi.pojos.Relsolfte;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RelsolbcoDAO {

    public static final int EDO_CREADO = 1;
    public static final int EDO_EDICION = 2;
    public static final int EDO_ENVIO = 3;
    public static final int EDO_INGRESO = 4;
    public static final int EDO_REVISION = 5;
    public static final int EDO_ACEPTADO = 6;

    public Integer saveBancoProyecto(Relsolbco relsolbco) {
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        boolean bndCorrecto = true;
        try {
            session.beginTransaction();            
            for (Relsolfte rel : relsolbco.getIdSol().getRelsolfteList()) {
                rel.setIdSol(relsolbco.getIdSol());
            }            
            session.saveOrUpdate(relsolbco);            
            session.getTransaction().commit();
        } catch (HibernateException exception) {
            System.out.println("exception: " + exception.getMessage());
            if (session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
            bndCorrecto = false;
        } finally {
            session.close();
        }
        if (bndCorrecto) {
            return relsolbco.getIdBco();
        } else {
            return -1;
        }
    }

    public Relsolbco getBancoProyecto(int idBco) {
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Relsolbco banco = (Relsolbco) session.get(Relsolbco.class, idBco);
        session.close();
        return banco;
    }
}
