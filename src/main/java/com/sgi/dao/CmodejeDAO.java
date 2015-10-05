package com.sgi.dao;

import com.sgi.pojos.Cmodeje;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CmodejeDAO {
    public List<Cmodeje> getModosEjecucion(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("FROM Cmodeje");
        List<Cmodeje> modosEjecucion = query.list();
        session.close();
        return modosEjecucion;
    }
}
