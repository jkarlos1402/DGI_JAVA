package com.sgi.dao;

import com.sgi.pojos.Catbeneficiario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CatbeneficiarioDAO {
    public List<Catbeneficiario> getBeneficiarios(){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("from Catbeneficiario");
        List<Catbeneficiario> beneficiarios = query.list();
        session.close();
        return beneficiarios;
    }
}
