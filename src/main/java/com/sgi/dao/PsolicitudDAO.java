package com.sgi.dao;

import com.sgi.pojos.Psolicitud;
import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PsolicitudDAO {

    public boolean savePsolicitud(Psolicitud psolicitud) {
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        try {
            session.beginTransaction();
            session.saveOrUpdate(psolicitud);
            session.getTransaction().commit();
        } catch (HibernateException exception) {
            System.out.println("exception: "+ exception.getMessage());
            if(session.getTransaction().isActive()){
                session.getTransaction().rollback();
            }
            session.close();
            return false;
        }
        session.close();
        return true;
    }
}
