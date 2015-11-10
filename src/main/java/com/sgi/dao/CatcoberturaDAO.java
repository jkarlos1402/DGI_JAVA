package com.sgi.dao;

import com.sgi.pojos.Catcobertura;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CatcoberturaDAO {
    public List<Catcobertura> getCoberturas(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("from Catcobertura");
        List<Catcobertura> coberturas = query.list();
        session.close();
        return coberturas;
    }
    
}
