package com.sgi.dao;

import com.sgi.pojos.Ctiploc;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CtiplocDAO {
    public List<Ctiploc> getTipoLocalidades(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("from Ctiploc");
        List<Ctiploc> tiposLocalidad = query.list();
        session.close();
        return tiposLocalidad;
    }
}
