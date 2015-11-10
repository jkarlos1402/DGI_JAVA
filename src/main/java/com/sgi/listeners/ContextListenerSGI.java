package com.sgi.listeners;

import com.sgi.dao.CatacuerdoDAO;
import com.sgi.dao.CatbeneficiarioDAO;
import com.sgi.dao.CatcoberturaDAO;
import com.sgi.dao.CatejercicioDAO;
import com.sgi.dao.Catfte2015DAO;
import com.sgi.dao.CatgposocDAO;
import com.sgi.dao.CatmetaDAO;
import com.sgi.dao.CatregionDAO;
import com.sgi.dao.CmodejeDAO;
import com.sgi.dao.CtipObrDAO;
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
        
        CatgposocDAO catgposocDAO = new CatgposocDAO();
        sc.setAttribute("catalogo_grupos_sociales", catgposocDAO.getGruposSociales());
        
        CatmetaDAO catmetaDAO = new CatmetaDAO();
        sc.setAttribute("catalogo_metas", catmetaDAO.getMetas());
        
        CatbeneficiarioDAO catbeneficiarioDAO = new CatbeneficiarioDAO();
        sc.setAttribute("catalogo_beneficiarios", catbeneficiarioDAO.getBeneficiarios());
        
        CatcoberturaDAO catcoberturaDAO = new CatcoberturaDAO();
        sc.setAttribute("catalogo_coberturas", catcoberturaDAO.getCoberturas());
        
        CatregionDAO catregionDAO = new CatregionDAO();
        sc.setAttribute("catalogo_regiones", catregionDAO.getRegiones());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}
