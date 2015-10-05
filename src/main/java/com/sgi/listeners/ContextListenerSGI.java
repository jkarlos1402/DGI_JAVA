package com.sgi.listeners;

import com.sgi.dao.CatacuerdoDAO;
import com.sgi.dao.CatejercicioDAO;
import com.sgi.dao.Catfte2015DAO;
import com.sgi.dao.CmodejeDAO;
import com.sgi.dao.CtipObrDAO;
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
        sc.setAttribute("catalogo_acuerdos_estatales", catacuerdoDAO.getAcuerdosEstatales());
        
        CmodejeDAO cmodejeDAO = new CmodejeDAO();
        sc.setAttribute("catalogo_modo_ejecucion", cmodejeDAO.getModosEjecucion());
        
        CtipObrDAO ctipObrDAO = new CtipObrDAO();
        sc.setAttribute("catalogo_tipo_obra", ctipObrDAO.getCatalogoTipObr());
        
        Catfte2015DAO catfte2015DAO = new Catfte2015DAO();
        sc.setAttribute("catalogo_fuentes_federales", catfte2015DAO.getFuentesFederales());
        sc.setAttribute("catalogo_fuentes_estatales", catfte2015DAO.getFuentesEstatales());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}
