package com.sgi.dao;

import com.sgi.pojos.Catgposoc;
import com.sgi.pojos.Catmeta;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CatmetaDAO {
    public List<Catmeta> getMetas(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("FROM Catmeta");
        List<Catmeta> metas = query.list();
        session.close();
        return metas;
    }
}
