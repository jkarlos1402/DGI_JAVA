package com.sgi.managed.beans;

import com.sgi.pojos.Catfte2015;
import com.sgi.pojos.Dsolfte;
import com.sgi.pojos.Psolicitud;
import com.sgi.pojos.Relsolfte;
import java.io.Serializable;
;
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
public class FuentesInversion implements Serializable {

    private List<Relsolfte> fuentesFederalesSelected;
    private List<Relsolfte> fuentesEstatalesSelected;
    private List<Catfte2015> fuentesFederales;
    private List<Catfte2015> fuentesEstatales;
    private Relsolfte relFteFed;
    private Relsolfte relFteFedSelected;
    private Relsolfte relFteFedVacia;
    private Relsolfte relFteEst;
    private Relsolfte relFteEstSelected;
    private Relsolfte relFteEstVacia;
    private double montoInversion;
    private double montoFinalInversion;
    
    private String nombreFteMun;
    private double montoFteMun;
    
    public FuentesInversion() {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        fuentesFederales = (List<Catfte2015>) servletContext.getAttribute("catalogo_fuentes_federales");
        fuentesEstatales = (List<Catfte2015>) servletContext.getAttribute("catalogo_fuentes_estatales");
        fuentesEstatalesSelected = new ArrayList<>();
        fuentesFederalesSelected = new ArrayList<>();
        relFteFed = new Relsolfte();
        relFteFed.setDsolfte(new Dsolfte());
        relFteFed.setIdSol(new Psolicitud());
        relFteFed.setIdFte(new Catfte2015());

        relFteFedVacia = new Relsolfte();
        relFteFedVacia.setDsolfte(new Dsolfte());
        relFteFedVacia.setIdSol(new Psolicitud());
        relFteFedVacia.setIdFte(new Catfte2015());

        relFteFedSelected = new Relsolfte();
        relFteFedSelected.setDsolfte(new Dsolfte());
        relFteFedSelected.setIdSol(new Psolicitud());
        relFteFedSelected.setIdFte(new Catfte2015());

        relFteEst = new Relsolfte();
        relFteEst.setDsolfte(new Dsolfte());
        relFteEst.setIdSol(new Psolicitud());
        relFteEst.setIdFte(new Catfte2015());

        relFteEstVacia = new Relsolfte();
        relFteEstVacia.setDsolfte(new Dsolfte());
        relFteEstVacia.setIdSol(new Psolicitud());
        relFteEstVacia.setIdFte(new Catfte2015());

        relFteEstSelected = new Relsolfte();
        relFteEstSelected.setDsolfte(new Dsolfte());
        relFteEstSelected.setIdSol(new Psolicitud());
        relFteEstSelected.setIdFte(new Catfte2015());
    }

    public double getMontoFinalInversion() {
        return montoFinalInversion;
    }

    public void setMontoFinalInversion(double montoFinalInversion) {
        this.montoFinalInversion = montoFinalInversion;
    }

    public String getNombreFteMun() {
        return nombreFteMun;
    }

    public void setNombreFteMun(String nombreFteMun) {
        this.nombreFteMun = nombreFteMun;
    }

    public double getMontoFteMun() {
        return montoFteMun;
    }

    public void setMontoFteMun(double montoFteMun) {
        this.montoFteMun = montoFteMun;
    }

    public Relsolfte getRelFteEst() {
        return relFteEst;
    }

    public void setRelFteEst(Relsolfte relFteEst) {
        this.relFteEst = relFteEst;
    }

    public Relsolfte getRelFteEstSelected() {
        return relFteEstSelected;
    }

    public void setRelFteEstSelected(Relsolfte relFteEstSelected) {
        this.relFteEstSelected = relFteEstSelected;
    }

    public Relsolfte getRelFteEstVacia() {
        return relFteEstVacia;
    }

    public void setRelFteEstVacia(Relsolfte relFteEstVacia) {
        this.relFteEstVacia = relFteEstVacia;
    }

    public Relsolfte getRelFteFed() {
        return relFteFed;
    }

    public void setRelFteFed(Relsolfte relFteFed) {
        this.relFteFed = relFteFed;
    }

    public Relsolfte getRelFteFedVacia() {
        return relFteFedVacia;
    }

    public void setRelFteFedVacia(Relsolfte relFteFedVacia) {
        this.relFteFedVacia = relFteFedVacia;
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
        obtieneTotalDeInversion();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fuente editada", ((Relsolfte) event.getObject()).getIdFte().getDscFte()));
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edici\u00f3n cancelada", ((Relsolfte) event.getObject()).getIdFte().getDscFte());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void addRelFteFed() {
        fuentesFederalesSelected.add(relFteFed);
        boolean aceptado = true;
        obtieneTotalDeInversion();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fuente agregada", relFteFed.getIdFte().getDscFte()));

        relFteFed = new Relsolfte();
        relFteFed.setDsolfte(new Dsolfte());
        relFteFed.setIdSol(new Psolicitud());
        relFteFed.setIdFte(new Catfte2015());

        RequestContext reqContext = RequestContext.getCurrentInstance();
        reqContext.addCallbackParam("aceptado", aceptado);
        reqContext.addCallbackParam("tipo", "federal");
    }

    public void deleteRelFteFed() {
        fuentesFederalesSelected.remove(relFteFedSelected);
        obtieneTotalDeInversion();

        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fuente eliminada", relFteFedSelected.getIdFte().getDscFte()));

        relFteFedSelected = null;
    }

    public void addRelFteEst() {
        fuentesEstatalesSelected.add(relFteEst);
        boolean aceptado = true;
        obtieneTotalDeInversion();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fuente agregada", relFteEst.getIdFte().getDscFte()));

        relFteEst = new Relsolfte();
        relFteEst.setDsolfte(new Dsolfte());
        relFteEst.setIdSol(new Psolicitud());
        relFteEst.setIdFte(new Catfte2015());

        RequestContext reqContext = RequestContext.getCurrentInstance();
        reqContext.addCallbackParam("aceptado", aceptado);
        reqContext.addCallbackParam("tipo", "estatal");
    }

    public void deleteRelFteEst() {
        fuentesEstatalesSelected.remove(relFteEstSelected);
        obtieneTotalDeInversion();
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fuente eliminada", relFteEstSelected.getIdFte().getDscFte()));

        relFteEstSelected = null;
    }

    public void obtieneTotalDeInversion() {
        double montoTotal = 0.00;        
        for (Relsolfte fuentesFederalesSelected1 : fuentesFederalesSelected) {
            montoTotal += fuentesFederalesSelected1.getDsolfte().getMonto().doubleValue();
        }

        for (Relsolfte fuentesEstatalesSelected1 : fuentesEstatalesSelected) {
            montoTotal += fuentesEstatalesSelected1.getDsolfte().getMonto().doubleValue();
        }
        montoFinalInversion = montoTotal;
        
        montoTotal += montoFteMun;
        
        montoInversion = montoTotal;
    }
}
