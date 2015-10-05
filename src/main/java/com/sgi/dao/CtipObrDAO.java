package com.sgi.dao;

import com.sgi.pojos.Ctipobr;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CtipObrDAO {
    public List<Ctipobr> getCatalogoTipObr(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("FROM Ctipobr");
        List<Ctipobr> tiposObra = query.list();
        session.close();
        return tiposObra;
    }
    
}
