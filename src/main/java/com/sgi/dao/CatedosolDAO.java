package com.sgi.dao;

import com.sgi.pojos.Catedosol;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CatedosolDAO {
    public static final int EDO_CREADO = 1;
    public static final int EDO_EDICION = 2;
    public static final int EDO_ENVIO = 3;
    public static final int EDO_INGRESO = 4;
    public static final int EDO_REVISION = 5;
    public static final int EDO_ACEPTADO = 6;
    public static final int EDO_CANCELADO = 7;
    public static final int EDO_EN_PROCESO = 8;
    public static final int EDO_REGISTRADO = 9;
    public static final int EDO_ANALIZADO = 10;
    
    public Catedosol getEdoSol(int edo){
        SessionFactory factory = null;
        Session session = null;
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
        Catedosol estado = (Catedosol)session.get(Catedosol.class, edo);  
        session.close();
        return estado;
    }
}
