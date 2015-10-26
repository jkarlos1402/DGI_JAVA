package com.sgi.dao;

import com.sgi.pojos.Psolicitud;
import com.sgi.pojos.Relsolfte;
import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PsolicitudDAO {

    public Integer savePsolicitud(Psolicitud psolicitud) {
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        boolean bndCorrecto = true;
        try {
            session.beginTransaction();
            for (Relsolfte rel : psolicitud.getRelsolfteList()) {
                rel.setIdSol(psolicitud);
            }
            session.saveOrUpdate(psolicitud);
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
            return psolicitud.getIdSol();
        } else {
            return -1;
        }
    }
}
