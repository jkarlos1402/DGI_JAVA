package com.sgi.dao;

import com.sgi.pojos.Catfte2015;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Catfte2015DAO {
   public List<Catfte2015> getFuentesFederales(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("FROM Catfte2015 WHERE Catfte2015.TipoFte = 'F'");
        List<Catfte2015> fuentesFederales = query.list();
        session.close();
        return fuentesFederales;
    } 
   
   public List<Catfte2015> getFuentesEstatales(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("FROM Catfte2015 WHERE Catfte2015.TipoFte = 'E'");
        List<Catfte2015> fuentesEstatales = query.list();
        session.close();
        return fuentesEstatales;
    }
}
