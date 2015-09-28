package com.sgi.listeners;

import com.sgi.dao.CatejercicioDAO;
import com.sgi.pojos.Catejercicio;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListenerSGI implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        CatejercicioDAO catejercicioDAO = new CatejercicioDAO();
        ServletContext sc = sce.getServletContext();
        sc.setAttribute("catalogo_ejercicio", catejercicioDAO.getCatEjercicio());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}
