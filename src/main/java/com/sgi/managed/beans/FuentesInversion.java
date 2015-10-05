package com.sgi.managed.beans;

import com.sgi.pojos.Catejercicio;
import com.sgi.pojos.Catfte2015;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.primefaces.event.RowEditEvent;

@ManagedBean(name = "fuentesInversion")
@ViewScoped
public class FuentesInversion {
    private List<Catfte2015> fuentesFederalesSelected;
    private List<Catfte2015> fuentesEstatalesSelected;    
    private List<Catfte2015> fuentesFederales;
    private List<Catfte2015> fuentesEstatales;    

    public FuentesInversion() {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        fuentesFederales = (List<Catfte2015>)servletContext.getAttribute("catalogo_fuentes_federales");
        fuentesEstatales = (List<Catfte2015>)servletContext.getAttribute("catalogo_fuentes_estatales");
        fuentesEstatalesSelected = new ArrayList<>();
        fuentesFederalesSelected = new ArrayList<>();
    }

    public List<Catfte2015> getFuentesFederalesSelected() {
        return fuentesFederalesSelected;
    }

    public void setFuentesFederalesSelected(List<Catfte2015> fuentesFederalesSelected) {
        this.fuentesFederalesSelected = fuentesFederalesSelected;
    }

    public List<Catfte2015> getFuentesEstatalesSelected() {
        return fuentesEstatalesSelected;
    }

    public void setFuentesEstatalesSelected(List<Catfte2015> fuentesEstatalesSelected) {
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
        //FacesMessage msg = new FacesMessage("Fuente editada", ((Car) event.getObject()).getId());
        //FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        //FacesMessage msg = new FacesMessage("Edit Cancelled", ((Car) event.getObject()).getId());
        //FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
