package com.sgi.managed.beans.banco;

import com.sgi.dao.RelsolbcoDAO;
import com.sgi.pojos.Catcobertura;
import com.sgi.pojos.Catmunicipio;
import com.sgi.pojos.Catregion;
import com.sgi.pojos.Ctiploc;
import com.sgi.pojos.Movbco;
import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.primefaces.model.DualListModel;
import org.primefaces.model.map.Circle;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.LatLngBounds;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Rectangle;

@ManagedBean(name = "hoja2Estudio")
@ViewScoped
public class Hoja2Estudio implements Serializable {

    private List<Catcobertura> catalogoCobertura;
    private List<Ctiploc> catalogoTiposLoc;

    private DualListModel regiones;
    private DualListModel municipios;

    @ManagedProperty("#{estudioSocioEconomico}")
    private Solicitud solicitud;

    private MapModel rectangleModel;

    public Hoja2Estudio() {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        catalogoCobertura = (List<Catcobertura>) servletContext.getAttribute("catalogo_coberturas");

        List<Catregion> catalogoRegiones = new ArrayList<>();
        for (Catregion region : (List<Catregion>) servletContext.getAttribute("catalogo_regiones")) {
            catalogoRegiones.add(region);
        }
        List<Catregion> regionesSelected = new ArrayList<>();
        regiones = new DualListModel(catalogoRegiones, regionesSelected);

        List<Catmunicipio> catalogoMunicipios = new ArrayList<>();
        for (Catmunicipio municipio : (List<Catmunicipio>) servletContext.getAttribute("catalogo_municipios")) {
            catalogoMunicipios.add(municipio);
        }
        List<Catmunicipio> municipiosSelected = new ArrayList<>();
        municipios = new DualListModel(catalogoMunicipios, municipiosSelected);

        catalogoTiposLoc = (List<Ctiploc>) servletContext.getAttribute("catalogo_tipos_localidad");

        rectangleModel = new DefaultMapModel();
    }

    public MapModel getRectangleModel() {
        return rectangleModel;
    }

    public void setRectangleModel(MapModel rectangleModel) {
        this.rectangleModel = rectangleModel;
    }

    public List<Ctiploc> getCatalogoTiposLoc() {
        return catalogoTiposLoc;
    }

    public void setCatalogoTiposLoc(List<Ctiploc> catalogoTiposLoc) {
        this.catalogoTiposLoc = catalogoTiposLoc;
    }

    public DualListModel getMunicipios() {
        return municipios;
    }

    public void setMunicipios(DualListModel municipios) {
        this.municipios = municipios;
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

    public void listenerEvent() {
    }

    public Integer saveRelSolBco() {
        RelsolbcoDAO relsolbcoDAO = new RelsolbcoDAO();
        solicitud.getBancoProyecto().getIdSol().getRegiones().clear();
        solicitud.getBancoProyecto().getIdSol().getMunicipios().clear();

        if (regiones.getTarget() != null && solicitud.getBancoProyecto().getIdSol().getIdCob().getIdCob() == 2) {
            for (Catregion region : (List<Catregion>) regiones.getTarget()) {
                solicitud.getBancoProyecto().getIdSol().getRegiones().add(region);
            }
        }

        if (municipios.getTarget() != null && solicitud.getBancoProyecto().getIdSol().getIdCob().getIdCob() == 3) {
            for (Catmunicipio municipio : (List<Catmunicipio>) municipios.getTarget()) {
                solicitud.getBancoProyecto().getIdSol().getMunicipios().add(municipio);
            }
        }
        Integer noBancoProyecto = relsolbcoDAO.saveBancoProyecto(solicitud.getBancoProyecto());
        return noBancoProyecto;
    }

    public void saveHoja2Bco() {
        Integer noBancoProyecto = saveRelSolBco();
        FacesContext context = FacesContext.getCurrentInstance();
        if (noBancoProyecto != -1) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informaci\u00f3n guardada", "No. de Banco de Proyectos: " + noBancoProyecto));
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Ocurri\u00f3 un error", ""));
        }
    }

    public void cambioCoordenadas() {

        LatLng coord1 = new LatLng(solicitud.getBancoProyecto().getIdSol().getLatIni().doubleValue(), solicitud.getBancoProyecto().getIdSol().getLonIni().doubleValue());
        LatLng coord4 = null;
        if (solicitud.getBancoProyecto().getIdSol().getLatFin() != null && solicitud.getBancoProyecto().getIdSol().getLatFin().doubleValue() != 0.00d && solicitud.getBancoProyecto().getIdSol().getLonFin() != null && solicitud.getBancoProyecto().getIdSol().getLonFin().doubleValue() != 0.00d) {
            coord4 = new LatLng(solicitud.getBancoProyecto().getIdSol().getLatFin().doubleValue(), solicitud.getBancoProyecto().getIdSol().getLonFin().doubleValue());
        }
        rectangleModel = new DefaultMapModel();
        if (coord4 != null) {
            //Rectangulo
            Rectangle rect = new Rectangle(new LatLngBounds(coord1, coord4));
            rect.setStrokeColor("#d93c3c");
            rect.setFillColor("#d93c3c");
            rect.setFillOpacity(0.5);
            rectangleModel.addOverlay(rect);
        } else {
            //Circulo
            Circle circle1 = new Circle(coord1, 5000);
            circle1.setStrokeColor("#d93c3c");
            circle1.setFillColor("#d93c3c");
            circle1.setFillOpacity(0.5);
            rectangleModel.addOverlay(circle1);
        }

    }

    public void enviarDictaminar() {        
        solicitud.getBancoProyecto().setStatus(RelsolbcoDAO.EDO_ENVIO);
        if(solicitud.getBancoProyecto().getMovBcoList() == null){
            solicitud.getBancoProyecto().setMovBcoList(new ArrayList<Movbco>());
        }
        Movbco movimiento = new Movbco();
        movimiento.setFecMov(new Date());
        movimiento.setIdBanco(solicitud.getBancoProyecto());
        movimiento.setTipMov(RelsolbcoDAO.EDO_ENVIO+"");
        solicitud.getBancoProyecto().getMovBcoList().add(movimiento);
        Integer noBancoProyecto = saveRelSolBco();
        FacesContext context = FacesContext.getCurrentInstance();
        if (noBancoProyecto != -1) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informaci\u00f3n guardada", "No. de Banco de Proyectos: " + noBancoProyecto + ", se ha enviado a DICTAMINAR."));
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Ocurri\u00f3 un error", ""));
        }

    }
}
