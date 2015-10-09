package com.sgi.dao;

import com.sgi.pojos.Catgposoc;
import com.sgi.pojos.Cmodeje;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CatgposocDAO {
    public List<Catgposoc> getGruposSociales(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("FROM Catgposoc");
        List<Catgposoc> gruposSociales = query.list();
        session.close();
        return gruposSociales;
    }
}
