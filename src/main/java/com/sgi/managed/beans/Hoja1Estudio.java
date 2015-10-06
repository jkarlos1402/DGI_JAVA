package com.sgi.managed.beans;

import com.sgi.pojos.Catacuerdo;
import com.sgi.pojos.Catejercicio;
import com.sgi.pojos.Catsector;
import com.sgi.pojos.Catue;
import com.sgi.pojos.Cmodeje;
import com.sgi.pojos.Ctipobr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.primefaces.event.FlowEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;

@ManagedBean(name = "hoja1Estudio")
@ViewScoped
public class Hoja1Estudio implements Serializable {

    private Short noBanco;
    private Catejercicio ejercicioSelected;
    private List<Catejercicio> catalogoEjericios;
    private int vidaUtil;
    private String nombreObra;
    private Catue unidadEjecutora;
    private Catsector sector;
    private String justificacion;
    private Cmodeje modoSelected;
    private List<Cmodeje> catalogoModEje;
    private Ctipobr tipoObraSelected;
    private List<Ctipobr> catalogoTipoObr;
    

    //para control UI
    private boolean skip;
    private DualListModel<Catacuerdo> accionesFederales;
    private DualListModel<Catacuerdo> accionesEstatales;

    public Hoja1Estudio() {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        catalogoEjericios = (List<Catejercicio>)servletContext.getAttribute("catalogo_ejercicio");
        
        List<Catacuerdo> acuerdosFederales = (List<Catacuerdo>)servletContext.getAttribute("catalogo_acuerdos_federales");
        List<Catacuerdo> acuerdosFederalesSelected = new ArrayList<>();        
        accionesFederales = new DualListModel<>(acuerdosFederales, acuerdosFederalesSelected);
        
        List<Catacuerdo> acuerdosEstatales = (List<Catacuerdo>)servletContext.getAttribute("catalogo_acuerdos_estatales");
        List<Catacuerdo> acuerdosEstatalesSelected = new ArrayList<>();        
        accionesEstatales = new DualListModel<>(acuerdosEstatales, acuerdosEstatalesSelected);
        
        catalogoModEje = (List<Cmodeje>)servletContext.getAttribute("catalogo_modo_ejecucion");
        
        catalogoTipoObr = (List<Ctipobr>)servletContext.getAttribute("catalogo_tipo_obra");
    }

    public Ctipobr getTipoObraSelected() {
        return tipoObraSelected;
    }

    public void setTipoObraSelected(Ctipobr tipoObraSelected) {
        this.tipoObraSelected = tipoObraSelected;
    }

    public List<Ctipobr> getCatalogoTipoObr() {
        return catalogoTipoObr;
    }

    public void setCatalogoTipoObr(List<Ctipobr> catalogoTipoObr) {
        this.catalogoTipoObr = catalogoTipoObr;
    }

    public Cmodeje getModoSelected() {
        return modoSelected;
    }

    public void setModoSelected(Cmodeje modoSeleccionado) {
        this.modoSelected = modoSeleccionado;
    }

    public List<Cmodeje> getCatalogoModEje() {
        return catalogoModEje;
    }

    public void setCatalogoModEje(List<Cmodeje> catalogoModEje) {
        this.catalogoModEje = catalogoModEje;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public DualListModel<Catacuerdo> getAccionesEstatales() {
        return accionesEstatales;
    }

    public void setAccionesEstatales(DualListModel<Catacuerdo> accionesEstatales) {
        this.accionesEstatales = accionesEstatales;
    }

    public DualListModel<Catacuerdo> getAccionesFederales() {
        return accionesFederales;
    }

    public void setAccionesFederales(DualListModel<Catacuerdo> accionesFederales) {
        this.accionesFederales = accionesFederales;
    }

    public Short getNoBanco() {
        return noBanco;
    }

    public void setNoBanco(Short noBanco) {
        this.noBanco = noBanco;
    }

    public Catejercicio getEjercicioSelected() {
        return ejercicioSelected;
    }

    public void setEjercicioSelected(Catejercicio ejercicioSelected) {
        this.ejercicioSelected = ejercicioSelected;
    }

    public List<Catejercicio> getCatalogoEjericios() {
        return catalogoEjericios;
    }

    public void setCatalogoEjericios(List<Catejercicio> catalogoEjericios) {
        this.catalogoEjericios = catalogoEjericios;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public Catue getUnidadEjecutora() {
        return unidadEjecutora;
    }

    public void setUnidadEjecutora(Catue unidadEjecutora) {
        this.unidadEjecutora = unidadEjecutora;
    }

    public Catsector getSector() {
        return sector;
    }

    public void setSector(Catsector sector) {
        this.sector = sector;
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String onFlowProcess(FlowEvent event) {
        if (skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        } else {
            return event.getNewStep();
        }
    }
    
    public void onSelect(SelectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Elemento seleccionado", event.getObject().toString()));        
    }
    
    public void onTransfer(TransferEvent event){
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Elemento(s) transferido(s)", event.getItems().size()+""));        
    }
     
    public void onUnselect(UnselectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Unselected", event.getObject().toString()));
    }

}
