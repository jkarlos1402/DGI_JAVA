package com.sgi.managed.beans.banco;

import com.sgi.dao.RelsolbcoDAO;
import com.sgi.pojos.Catcobertura;
import com.sgi.pojos.Catregion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.primefaces.model.DualListModel;

@ManagedBean(name = "hoja2Estudio")
@ViewScoped
public class Hoja2Estudio implements Serializable{
    private List<Catcobertura> catalogoCobertura;
    
    private DualListModel regiones;
    
    @ManagedProperty("#{estudioSocioEconomico}")
    private Solicitud solicitud;

    public Hoja2Estudio() {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        catalogoCobertura = (List<Catcobertura>)servletContext.getAttribute("catalogo_coberturas");
        
        List<Catregion> catalogoRegiones = (List<Catregion>)servletContext.getAttribute("catalogo_regiones");
        List<Catregion> regionesSelected = new ArrayList<>();
        regiones = new DualListModel(catalogoRegiones, regionesSelected);
    }

    public DualListModel getRegiones() {
        return regiones;
    }

    public void setRegiones(DualListModel regiones) {
        this.regiones = regiones;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public List<Catcobertura> getCatalogoCobertura() {
        return catalogoCobertura;
    }

    public void setCatalogoCobertura(List<Catcobertura> catalogoCobertura) {
        this.catalogoCobertura = catalogoCobertura;
    }
    
    public void listenerEvent(){}
    
    public void saveHoja2Bco(){
        RelsolbcoDAO relsolbcoDAO = new RelsolbcoDAO();
        solicitud.getBancoProyecto().getIdSol().getRegiones().clear();
        if(regiones.getTarget() != null){
            for (Catregion region : (List<Catregion>)regiones.getTarget()) {
                solicitud.getBancoProyecto().getIdSol().getRegiones().add(region);
            }
        }
        Integer noBancoProyecto = relsolbcoDAO.saveBancoProyecto(solicitud.getBancoProyecto());
        
        FacesContext context = FacesContext.getCurrentInstance();
        if (noBancoProyecto != -1) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informaci\u00f3n guardada", "No. de Banco de Proyectos: " + noBancoProyecto));            
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Ocurri\u00f3 un error", ""));
        }
    }
    
}
