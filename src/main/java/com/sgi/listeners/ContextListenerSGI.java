package com.sgi.listeners;

import com.sgi.dao.CatacuerdoDAO;
import com.sgi.dao.CatejercicioDAO;
import com.sgi.pojos.Catejercicio;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListenerSGI implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        
        CatejercicioDAO catejercicioDAO = new CatejercicioDAO();        
        sc.setAttribute("catalogo_ejercicio", catejercicioDAO.getCatEjercicio());
        
        CatacuerdoDAO catacuerdoDAO = new CatacuerdoDAO();
        sc.setAttribute("catalogo_acuerdos_federales", catacuerdoDAO.getAcuerdosFederales());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}
