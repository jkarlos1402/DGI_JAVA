package com.sgi.managed.beans.banco;

import com.sgi.dao.CatedosolDAO;
import com.sgi.dao.PsolicitudDAO;
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
import com.sgi.pojos.Psolicitud;
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
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;

@ManagedBean(name = "hoja1Estudio")
@ViewScoped
public class Hoja1Estudio implements Serializable {

    private Short noBanco;
    private Catejercicio ejercicioSelected;
    private List<Catejercicio> catalogoEjericios;
    private Integer vidaUtil;
    private String nombreObra;
    private Catue unidadEjecutora;
    private Catsector sector;
    private String justificacion;
    private Cmodeje modoSelected;
    private List<Cmodeje> catalogoModEje;
    private Ctipobr tipoObraSelected;
    private List<Ctipobr> catalogoTipoObr;
    private String principalesCaract;
    private List<Catgposoc> catalogoGruposSoc;
    private Catgposoc grupoSocSelected;
    private List<Catmeta> catalogoMetas;
    private Catmeta metaSelected;
    private double cantidadMetas;
    private List<Catbeneficiario> catalogoBeneficiarios;
    private Catbeneficiario beneficiarioSelected;
    private int cantidadBeneficiarios;
    private int anhosObr;
    private int mesesObr;

    private Psolicitud solicitud = new Psolicitud();

    @ManagedProperty("#{fuentesInversion}")
    private FuentesInversion fuentesInversion;

    @ManagedProperty("#{factibilidadesLegales}")
    private FactibilidadesLegales factibilidadesLegales;

    @ManagedProperty("#{factibilidadesAmbientales}")
    private FactibilidadesAmbientales factibilidadesAmbientales;

    @ManagedProperty("#{factibilidadesTecnicas}")
    private FactibilidadesTecnicas factibilidadesTecnicas;

    //para control UI
    private boolean skip;
    private DualListModel<Catacuerdo> accionesFederales;
    private DualListModel<Catacuerdo> accionesEstatales;    

    public Hoja1Estudio() {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        catalogoEjericios = (List<Catejercicio>) servletContext.getAttribute("catalogo_ejercicio");

        List<Catacuerdo> acuerdosFederales = (List<Catacuerdo>) servletContext.getAttribute("catalogo_acuerdos_federales");
        List<Catacuerdo> acuerdosFederalesSelected = new ArrayList<>();
        accionesFederales = new DualListModel<>(acuerdosFederales, acuerdosFederalesSelected);

        List<Catacuerdo> acuerdosEstatales = (List<Catacuerdo>) servletContext.getAttribute("catalogo_acuerdos_estatales");
        List<Catacuerdo> acuerdosEstatalesSelected = new ArrayList<>();
        accionesEstatales = new DualListModel<>(acuerdosEstatales, acuerdosEstatalesSelected);

        catalogoModEje = (List<Cmodeje>) servletContext.getAttribute("catalogo_modo_ejecucion");

        catalogoTipoObr = (List<Ctipobr>) servletContext.getAttribute("catalogo_tipo_obra");

        catalogoGruposSoc = (List<Catgposoc>) servletContext.getAttribute("catalogo_grupos_sociales");

        catalogoMetas = (List<Catmeta>) servletContext.getAttribute("catalogo_metas");

        catalogoBeneficiarios = (List<Catbeneficiario>) servletContext.getAttribute("catalogo_beneficiarios");
    }

    public int getAnhosObr() {
        return anhosObr;
    }

    public void setAnhosObr(int anhosObr) {
        this.anhosObr = anhosObr;
    }

    public int getMesesObr() {
        return mesesObr;
    }

    public void setMesesObr(int mesesObr) {
        this.mesesObr = mesesObr;
    }

    public List<Catbeneficiario> getCatalogoBeneficiarios() {
        return catalogoBeneficiarios;
    }

    public void setCatalogoBeneficiarios(List<Catbeneficiario> catalogoBeneficiarios) {
        this.catalogoBeneficiarios = catalogoBeneficiarios;
    }

    public Catbeneficiario getBeneficiarioSelected() {
        return beneficiarioSelected;
    }

    public void setBeneficiarioSelected(Catbeneficiario beneficiarioSelected) {
        this.beneficiarioSelected = beneficiarioSelected;
    }

    public int getCantidadBeneficiarios() {
        return cantidadBeneficiarios;
    }

    public void setCantidadBeneficiarios(int cantidadBeneficiarios) {
        this.cantidadBeneficiarios = cantidadBeneficiarios;
    }

    public double getCantidadMetas() {
        return cantidadMetas;
    }

    public void setCantidadMetas(double cantidadMetas) {
        this.cantidadMetas = cantidadMetas;
    }

    public List<Catmeta> getCatalogoMetas() {
        return catalogoMetas;
    }

    public void setCatalogoMetas(List<Catmeta> catalogoMetas) {
        this.catalogoMetas = catalogoMetas;
    }

    public Catmeta getMetaSelected() {
        return metaSelected;
    }

    public void setMetaSelected(Catmeta metaSelected) {
        this.metaSelected = metaSelected;
    }

    public List<Catgposoc> getCatalogoGruposSoc() {
        return catalogoGruposSoc;
    }

    public void setCatalogoGruposSoc(List<Catgposoc> catalogoGruposSoc) {
        this.catalogoGruposSoc = catalogoGruposSoc;
    }

    public Catgposoc getGrupoSocSelected() {
        return grupoSocSelected;
    }

    public void setGrupoSocSelected(Catgposoc grupoSocSelected) {
        this.grupoSocSelected = grupoSocSelected;
    }

    public String getPrincipalesCaract() {
        return principalesCaract;
    }

    public void setPrincipalesCaract(String principalesCaract) {
        this.principalesCaract = principalesCaract;
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

    public Integer getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(Integer vidaUtil) {
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

    public Psolicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Psolicitud solicitud) {
        this.solicitud = solicitud;
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

    public void onTransfer(TransferEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Elemento(s) transferido(s)", event.getItems().size() + ""));
    }

    public void onUnselect(UnselectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Unselected", event.getObject().toString()));
    }

    public void saveHoja1Bco() {
        CatedosolDAO catedosolDAO = new CatedosolDAO();

        solicitud.setCanBen(cantidadBeneficiarios);
        solicitud.setCanMet(new BigDecimal(cantidadMetas));
        solicitud.setDurAgs(new Short(anhosObr + ""));
        solicitud.setDurMes(new Short(mesesObr + ""));
        solicitud.setEjercicio(ejercicioSelected);
        solicitud.setFactAmb(factibilidadesAmbientales.getFactibilidadesAmbientalesToJSON());
        solicitud.setFactLeg(factibilidadesLegales.getFactibilidadesLegalesToJSON());
        solicitud.setFactTec(factibilidadesTecnicas.getFactibilidadesTecnicasToJSON());
        solicitud.setFecCap(new Date());
        solicitud.setFecMod(new Date());
        solicitud.setFteMun(fuentesInversion.getNombreFteMun());
        solicitud.setIdBen(beneficiarioSelected);
        solicitud.setIdEdoSol(catedosolDAO.getEdoSol(CatedosolDAO.EDO_CREADO));
        solicitud.setIdGpo(grupoSocSelected);
        solicitud.setIdMet(metaSelected);
        solicitud.setIdModEje(modoSelected);
        solicitud.setIdTipObr(tipoObraSelected);
        solicitud.setJustifi(justificacion);
        solicitud.setMonMun(new BigDecimal(fuentesInversion.getMontoFteMun()));
        solicitud.setMonto(new BigDecimal(fuentesInversion.getMontoFinalInversion()));
        solicitud.setNomObr(nombreObra);
        solicitud.setPriCar(principalesCaract);
        solicitud.setVidaPry(vidaUtil);
        //solicitud.setRelsolfteList(fuentesInversion.getFuentesSelected());  
        solicitud.setAcuerdos(new ArrayList<Catacuerdo>());
        for (Catacuerdo acuerdo : accionesEstatales.getTarget()) {
            solicitud.addAcuerdo(acuerdo);
        }
        for (Catacuerdo acuerdo : accionesFederales.getTarget()) {
            solicitud.addAcuerdo(acuerdo);
        }        
        PsolicitudDAO psolicitudDAO = new PsolicitudDAO();

        boolean correcto = psolicitudDAO.savePsolicitud(solicitud);

        FacesContext context = FacesContext.getCurrentInstance();
        if (correcto) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informaci\u00f3n guardada", ""));
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Ocurri\u00f3 un error", ""));
        }
    }
}
