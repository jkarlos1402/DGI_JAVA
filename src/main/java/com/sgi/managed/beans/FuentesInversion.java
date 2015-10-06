package com.sgi.managed.beans;

import com.sgi.pojos.Catfte2015;
import com.sgi.pojos.Dsolfte;
import com.sgi.pojos.Psolicitud;
import com.sgi.pojos.Relsolfte;
import java.io.Serializable;;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.RowEditEvent;

@ManagedBean(name = "fuentesInversion")
@ViewScoped
public class FuentesInversion implements Serializable{
    private List<Relsolfte> fuentesFederalesSelected;
    private List<Relsolfte> fuentesEstatalesSelected;    
    private List<Catfte2015> fuentesFederales;
    private List<Catfte2015> fuentesEstatales;   
    private Relsolfte relFteFed;
    private Relsolfte relFteFedSelected;
    private double montoInversion;

    public Relsolfte getRelFteFed() {
        return relFteFed;
    }

    public void setRelFteFed(Relsolfte relFteFed) {
        this.relFteFed = relFteFed;
    }

    public FuentesInversion() {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        fuentesFederales = (List<Catfte2015>)servletContext.getAttribute("catalogo_fuentes_federales");
        fuentesEstatales = (List<Catfte2015>)servletContext.getAttribute("catalogo_fuentes_estatales");
        fuentesEstatalesSelected = new ArrayList<>();
        fuentesFederalesSelected = new ArrayList<>();
        relFteFed = new Relsolfte();
        relFteFed.setDsolfte(new Dsolfte());
        relFteFed.setIdSol(new Psolicitud());
        relFteFed.setIdFte(new Catfte2015());
    }

    public Relsolfte getRelFteFedSelected() {
        return relFteFedSelected;
    }

    public void setRelFteFedSelected(Relsolfte relFteFedSelected) {
        this.relFteFedSelected = relFteFedSelected;
    }

    public double getMontoInversion() {
        return montoInversion;
    }

    public void setMontoInversion(double montoInversion) {
        this.montoInversion = montoInversion;
    }

    public List<Relsolfte> getFuentesFederalesSelected() {
        return fuentesFederalesSelected;
    }

    public void setFuentesFederalesSelected(List<Relsolfte> fuentesFederalesSelected) {
        this.fuentesFederalesSelected = fuentesFederalesSelected;
    }

    public List<Relsolfte> getFuentesEstatalesSelected() {
        return fuentesEstatalesSelected;
    }

    public void setFuentesEstatalesSelected(List<Relsolfte> fuentesEstatalesSelected) {
        this.fuentesEstatalesSelected = fuentesEstatalesSelected;
    }

    public List<Catfte2015> getFuentesFederales() {
        return fuentesFederales;
    }

    public void setFuentesFederales(List<Catfte2015> fuentesFederales) {
        this.fuentesFederales = fuentesFederales;
    }

    public List<Catfte2015> getFuentesEstatales() {
        return fuentesEstatales;
    }

    public void setFuentesEstatales(List<Catfte2015> fuentesEstatales) {
        this.fuentesEstatales = fuentesEstatales;
    }
    
    public void onRowEdit(RowEditEvent event) {                
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fuente editada", ((Relsolfte) event.getObject()).getIdFte().getDscFte()));
    }
     
    public void onRowCancel(RowEditEvent event) {        
        FacesMessage msg = new FacesMessage("Edici\u00f3n cancelada", ((Relsolfte) event.getObject()).getIdFte().getDscFte());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void addRelFte(){        
        fuentesFederalesSelected.add(relFteFed);
        relFteFed = new Relsolfte();
        relFteFed.setDsolfte(new Dsolfte());
        relFteFed.setIdSol(new Psolicitud());
        relFteFed.setIdFte(new Catfte2015());
        double montoTotalFteFed = 0.00;
        boolean aceptado = true;
        for (Relsolfte fuentesFederalesSelected1 : fuentesFederalesSelected) {
            montoTotalFteFed += fuentesFederalesSelected1.getDsolfte().getMonto().doubleValue();
        }
        montoInversion = montoTotalFteFed;
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fuente agregada", relFteFed.getIdFte().getDscFte()));
        RequestContext reqContext = RequestContext.getCurrentInstance();
        reqContext.addCallbackParam("aceptado", aceptado);
    }
    
    public void deleteRelFte(){
        System.out.println("entro al evento de eliminar");
        fuentesFederalesSelected.remove(relFteFedSelected);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fuente eliminada", relFteFedSelected.getIdFte().getDscFte()));
        relFteFedSelected = null;     
    }
}
