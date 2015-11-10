package com.sgi.dao;

import com.sgi.pojos.Catmunicipio;
import com.sgi.pojos.Catregion;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CatmunicipioDAO {
    public List<Catmunicipio> getRegiones(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("from Catmunicipio");
        List<Catmunicipio> municipios = query.list();
        session.close();
        return municipios;
    }
}
