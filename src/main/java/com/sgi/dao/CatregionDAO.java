package com.sgi.dao;

import com.sgi.pojos.Catregion;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CatregionDAO {
    public List<Catregion> getRegiones(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("from Catregion");
        List<Catregion> regiones = query.list();
        session.close();
        return regiones;
    }
}
