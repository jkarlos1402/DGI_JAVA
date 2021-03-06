package com.sgi.dao;

import com.sgi.pojos.Catacuerdo;
import com.sgi.pojos.Catejercicio;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CatacuerdoDAO {

    public List<Catacuerdo> getAcuerdosFederales() {
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("FROM Catacuerdo Acuerdo WHERE Acuerdo.idTipAcu = 4 ORDER BY Acuerdo.cveAcu ASC");
        List<Catacuerdo> acuerdos = query.list();
        session.close();
        return acuerdos;
    }

    public List<Catacuerdo> getAcuerdosEstatales() {
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Query query = session.createQuery("FROM Catacuerdo Acuerdo WHERE Acuerdo.idTipAcu = 1 OR Acuerdo.idTipAcu = 2 ORDER BY Acuerdo.cveAcu ASC");
        List<Catacuerdo> acuerdos = query.list();
        session.close();
        return acuerdos;
    }
}
