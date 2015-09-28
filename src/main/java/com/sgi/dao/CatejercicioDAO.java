package com.sgi.dao;

import com.sgi.pojos.Catejercicio;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CatejercicioDAO {

    public List<Catejercicio> getCatEjercicio() {
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("from Catejercicio");
        List<Catejercicio> ejercicios = query.list();
        session.close();
        return ejercicios;
    }
}
