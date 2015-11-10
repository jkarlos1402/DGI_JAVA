package com.sgi.managed.beans.banco;

import com.sgi.dao.CatedosolDAO;
import com.sgi.dao.RelsolbcoDAO;
import com.sgi.managed.beans.FuentesInversion;
import com.sgi.pojos.Catacuerdo;
import com.sgi.pojos.Catbeneficiario;
import com.sgi.pojos.Catejercicio;
import com.sgi.pojos.Catgposoc;
import com.sgi.pojos.Catmeta;
import com.sgi.pojos.Catsector;
import com.sgi.pojos.Catue;
import com.sgi.pojos.Cmodeje;
import com.sgi.pojos.Ctipobr;
import com.sgi.pojos.Relsolfte;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.primefaces.event.FlowEvent;
import org.primefaces.event.SelectEvent;

@ManagedBean(name = "hoja1Estudio")
@ViewScoped
public class Hoja1Estudio implements Serializable {

    private List<Catejercicio> catalogoEjericios;
    private Catue unidadEjecutora;
    private Catsector sector;
    private List<Cmodeje> catalogoModEje;
    private List<Ctipobr> catalogoTipoObr;
    private List<Catgposoc> catalogoGruposSoc;
    private List<Catmeta> catalogoMetas;
    private List<Catbeneficiario> catalogoBeneficiarios;
    
    private List<Catacuerdo> accionesFederalesSelected;
    private List<Catacuerdo> accionesEstatalesSelected;
    private List<Catacuerdo> catalogoAcuerdosFederales;
    private List<Catacuerdo> catalogoAcuerdosEstatales;
    private Catbeneficiario beneficiarioVacio;     

    @ManagedProperty("#{fuentesInversion}")
    private FuentesInversion fuentesInversion;

    @ManagedProperty("#{factibilidadesLegales}")
    private FactibilidadesLegales factibilidadesLegales;

    @ManagedProperty("#{factibilidadesAmbientales}")
    private FactibilidadesAmbientales factibilidadesAmbientales;

    @ManagedProperty("#{factibilidadesTecnicas}")
    private FactibilidadesTecnicas factibilidadesTecnicas;
    
    @ManagedProperty("#{estudioSocioEconomico}")
    private Solicitud solicitud;

    //para control UI
    private boolean skip;

    public Hoja1Estudio() {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        catalogoEjericios = (List<Catejercicio>) servletContext.getAttribute("catalogo_ejercicio");

        catalogoAcuerdosFederales = (List<Catacuerdo>) servletContext.getAttribute("catalogo_acuerdos_federales");

        catalogoAcuerdosEstatales = (List<Catacuerdo>) servletContext.getAttribute("catalogo_acuerdos_estatales");

        catalogoModEje = (List<Cmodeje>) servletContext.getAttribute("catalogo_modo_ejecucion");

        catalogoTipoObr = (List<Ctipobr>) servletContext.getAttribute("catalogo_tipo_obra");

        catalogoGruposSoc = (List<Catgposoc>) servletContext.getAttribute("catalogo_grupos_sociales");

        catalogoMetas = (List<Catmeta>) servletContext.getAttribute("catalogo_metas");

        catalogoBeneficiarios = (List<Catbeneficiario>) servletContext.getAttribute("catalogo_beneficiarios");        

        accionesEstatalesSelected = new ArrayList<>();
        accionesFederalesSelected = new ArrayList<>();        
    }    

    public Catbeneficiario getBeneficiarioVacio() {
        return beneficiarioVacio;
    }

    public void setBeneficiarioVacio(Catbeneficiario beneficiarioVacio) {
        this.beneficiarioVacio = beneficiarioVacio;
    }

    public List<Catacuerdo> getAccionesFederalesSelected() {
        return accionesFederalesSelected;
    }

    public void setAccionesFederalesSelected(List<Catacuerdo> accionesFederalesSelected) {
        this.accionesFederalesSelected = accionesFederalesSelected;
    }

    public List<Catacuerdo> getAccionesEstatalesSelected() {
        return accionesEstatalesSelected;
    }

    public void setAccionesEstatalesSelected(List<Catacuerdo> accionesEstatalesSelected) {
        this.accionesEstatalesSelected = accionesEstatalesSelected;
    }

    public List<Catacuerdo> getCatalogoAcuerdosFederales() {
        return catalogoAcuerdosFederales;
    }

    public void setCatalogoAcuerdosFederales(List<Catacuerdo> catalogoAcuerdosFederales) {
        this.catalogoAcuerdosFederales = catalogoAcuerdosFederales;
    }

    public List<Catacuerdo> getCatalogoAcuerdosEstatales() {
        return catalogoAcuerdosEstatales;
    }

    public void setCatalogoAcuerdosEstatales(List<Catacuerdo> catalogoAcuerdosEstatales) {
        this.catalogoAcuerdosEstatales = catalogoAcuerdosEstatales;
    }
    

    public List<Catbeneficiario> getCatalogoBeneficiarios() {
        return catalogoBeneficiarios;
    }

    public void setCatalogoBeneficiarios(List<Catbeneficiario> catalogoBeneficiarios) {
        this.catalogoBeneficiarios = catalogoBeneficiarios;
    }

    public List<Catmeta> getCatalogoMetas() {
        return catalogoMetas;
    }

    public void setCatalogoMetas(List<Catmeta> catalogoMetas) {
        this.catalogoMetas = catalogoMetas;
    }

    public List<Catgposoc> getCatalogoGruposSoc() {
        return catalogoGruposSoc;
    }

    public void setCatalogoGruposSoc(List<Catgposoc> catalogoGruposSoc) {
        this.catalogoGruposSoc = catalogoGruposSoc;
    }

    public List<Ctipobr> getCatalogoTipoObr() {
        return catalogoTipoObr;
    }

    public void setCatalogoTipoObr(List<Ctipobr> catalogoTipoObr) {
        this.catalogoTipoObr = catalogoTipoObr;
    }

    public List<Cmodeje> getCatalogoModEje() {
        return catalogoModEje;
    }

    public void setCatalogoModEje(List<Cmodeje> catalogoModEje) {
        this.catalogoModEje = catalogoModEje;
    }

    public List<Catejercicio> getCatalogoEjericios() {
        return catalogoEjericios;
    }

    public void setCatalogoEjericios(List<Catejercicio> catalogoEjericios) {
        this.catalogoEjericios = catalogoEjericios;
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

    public FuentesInversion getFuentesInversion() {
        return fuentesInversion;
    }

    public void setFuentesInversion(FuentesInversion fuentesInversion) {
        this.fuentesInversion = fuentesInversion;
    }

    public FactibilidadesLegales getFactibilidadesLegales() {
        return factibilidadesLegales;
    }

    public void setFactibilidadesLegales(FactibilidadesLegales factibilidadesLegales) {
        this.factibilidadesLegales = factibilidadesLegales;
    }

    public FactibilidadesAmbientales getFactibilidadesAmbientales() {
        return factibilidadesAmbientales;
    }

    public void setFactibilidadesAmbientales(FactibilidadesAmbientales factibilidadesAmbientales) {
        this.factibilidadesAmbientales = factibilidadesAmbientales;
    }

    public FactibilidadesTecnicas getFactibilidadesTecnicas() {
        return factibilidadesTecnicas;
    }

    public void setFactibilidadesTecnicas(FactibilidadesTecnicas factibilidadesTecnicas) {
        this.factibilidadesTecnicas = factibilidadesTecnicas;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }    

    public String onFlowProcess(FlowEvent event) {
        if (skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        } else {                            
            return event.getNewStep();
        }
    }

    public List<Catacuerdo> completeAcuerdoFederal(String query) {
        List<Catacuerdo> filteredAcuerdos = new ArrayList<>();
        for (Catacuerdo acuerdo : catalogoAcuerdosFederales) {
            if (acuerdo.toString().toLowerCase().contains(query)) {
                filteredAcuerdos.add(acuerdo);
            }
        }
        return filteredAcuerdos;
    }

    public List<Catacuerdo> completeAcuerdoEstatal(String query) {
        List<Catacuerdo> filteredAcuerdos = new ArrayList<>();
        for (Catacuerdo acuerdo : catalogoAcuerdosEstatales) {
            if (acuerdo.toString().toLowerCase().contains(query)) {
                filteredAcuerdos.add(acuerdo);
            }
        }
        return filteredAcuerdos;
    }

    public void onItemSelect(SelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Acuerdo seleccionado", event.getObject().toString()));
    }        

    public void saveHoja1Bco() {

        CatedosolDAO catedosolDAO = new CatedosolDAO();

        solicitud.getBancoProyecto().getIdSol().setFactAmb(factibilidadesAmbientales.getFactibilidadesAmbientalesToJSON());
        solicitud.getBancoProyecto().getIdSol().setFactLeg(factibilidadesLegales.getFactibilidadesLegalesToJSON());
        solicitud.getBancoProyecto().getIdSol().setFactTec(factibilidadesTecnicas.getFactibilidadesTecnicasToJSON());
        solicitud.getBancoProyecto().getIdSol().setFecCap(new Date());
        solicitud.getBancoProyecto().getIdSol().setFecMod(new Date());
        solicitud.getBancoProyecto().getIdSol().setFteMun(fuentesInversion.getNombreFteMun());
        solicitud.getBancoProyecto().getIdSol().setIdEdoSol(catedosolDAO.getEdoSol(CatedosolDAO.EDO_CREADO));
        solicitud.getBancoProyecto().getIdSol().setMonMun(new BigDecimal(fuentesInversion.getMontoFteMun()));
        solicitud.getBancoProyecto().getIdSol().setMonto(new BigDecimal(fuentesInversion.getMontoFinalInversion()));
        solicitud.getBancoProyecto().getIdSol().getRelsolfteList().clear();
        for (Relsolfte fuente : fuentesInversion.getFuentesSelected()) {
            solicitud.getBancoProyecto().getIdSol().getRelsolfteList().add(fuente);
        }
        solicitud.getBancoProyecto().getIdSol().setAcuerdos(new ArrayList<Catacuerdo>());
        if (accionesEstatalesSelected != null) {
            for (Catacuerdo acuerdo : accionesEstatalesSelected) {
                solicitud.getBancoProyecto().getIdSol().addAcuerdo(acuerdo);
            }
        }
        if (accionesFederalesSelected != null) {
            for (Catacuerdo acuerdo : accionesFederalesSelected) {
                solicitud.getBancoProyecto().getIdSol().addAcuerdo(acuerdo);
            }
        }
        solicitud.getBancoProyecto().setFecReg(new Date());
        solicitud.getBancoProyecto().setStatus(RelsolbcoDAO.EDO_CREADO);

        RelsolbcoDAO relsolbcoDAO = new RelsolbcoDAO();

        Integer noBancoProyecto = relsolbcoDAO.saveBancoProyecto(solicitud.getBancoProyecto());

        FacesContext context = FacesContext.getCurrentInstance();
        if (noBancoProyecto != -1) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informaci\u00f3n guardada", "No. de Banco de Proyectos: " + noBancoProyecto));            
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Ocurri\u00f3 un error", ""));
        }
    }
}
