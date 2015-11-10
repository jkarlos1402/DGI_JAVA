package com.sgi.managed.beans.banco;

import com.sgi.dao.RelsolbcoDAO;
import com.sgi.pojos.Catacuerdo;
import com.sgi.pojos.Catejercicio;
import com.sgi.pojos.Catregion;
import com.sgi.pojos.Relsolbco;
import com.sgi.pojos.Relsolfte;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

@ManagedBean(name = "bancoProyectoFind")
@ViewScoped
public class BancoProyecto implements Serializable {

    private static final int ACUERDO_ESTATAL_1 = 1;
    private static final int ACUERDO_ESTATAL_2 = 2;
    private static final int ACUERDO_FEDERAL = 4;

    private Integer noBancoFind;

    @ManagedProperty("#{hoja1Estudio}")
    private Hoja1Estudio hoja1;

    @ManagedProperty("#{hoja2Estudio}")
    private Hoja2Estudio hoja2;

    public BancoProyecto() {
    }

    public Hoja2Estudio getHoja2() {
        return hoja2;
    }

    public void setHoja2(Hoja2Estudio hoja2) {
        this.hoja2 = hoja2;
    }

    public Hoja1Estudio getHoja1() {
        return hoja1;
    }

    public void setHoja1(Hoja1Estudio hoja1) {
        this.hoja1 = hoja1;
    }

    public Integer getNoBancoFind() {
        return noBancoFind;
    }

    public void setNoBancoFind(Integer noBancoFind) {
        this.noBancoFind = noBancoFind;
    }

    public void getBancoProyecto() {
        RelsolbcoDAO relsolbcoDAO = new RelsolbcoDAO();
        Relsolbco bancoProyecto = relsolbcoDAO.getBancoProyecto(noBancoFind);

        FacesContext context = FacesContext.getCurrentInstance();
        if (bancoProyecto != null) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informaci\u00f3n obtenida", "No. de Banco de Proyectos: " + noBancoFind));
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Ocurri\u00f3 un error", "No se encontr\u00f3 el proyecto ingresado"));
        }
        Solicitud solicitud = new Solicitud(bancoProyecto);
        hoja1.setSolicitud(solicitud);
        hoja2.setSolicitud(solicitud);
        List<Relsolfte> fuentesEstatales = new ArrayList<>();
        List<Relsolfte> fuentesFederales = new ArrayList<>();
        if (bancoProyecto != null) {
            for (Relsolfte fuente : bancoProyecto.getIdSol().getRelsolfteList()) {
                if (fuente.getIdFte().getTipoFte().equals('E')) {
                    fuentesEstatales.add(fuente);
                } else {
                    fuentesFederales.add(fuente);
                }
            }

            hoja1.getFuentesInversion().setFuentesEstatalesSelected(fuentesEstatales);
            hoja1.getFuentesInversion().setFuentesFederalesSelected(fuentesFederales);
            hoja1.getFuentesInversion().setMontoFteMun(bancoProyecto.getIdSol().getMonMun().doubleValue());
            hoja1.getFuentesInversion().setNombreFteMun(bancoProyecto.getIdSol().getFteMun());
            hoja1.getFuentesInversion().obtieneTotalDeInversion();

            hoja1.setAccionesEstatalesSelected(new ArrayList<Catacuerdo>());
            hoja1.setAccionesFederalesSelected(new ArrayList<Catacuerdo>());
            for (Catacuerdo acuerdo : bancoProyecto.getIdSol().getAcuerdos()) {
                if (acuerdo.getIdTipAcu().getIdTipAcu() == ACUERDO_ESTATAL_1 || acuerdo.getIdTipAcu().getIdTipAcu() == ACUERDO_ESTATAL_2) {
                    hoja1.getAccionesEstatalesSelected().add(acuerdo);
                } else if (acuerdo.getIdTipAcu().getIdTipAcu() == ACUERDO_FEDERAL) {
                    hoja1.getAccionesFederalesSelected().add(acuerdo);
                }
            }
            hoja1.setFactibilidadesAmbientales(FactibilidadesAmbientales.fromJSON(bancoProyecto.getIdSol().getFactAmb()));
            hoja1.setFactibilidadesLegales(FactibilidadesLegales.fromJSON(bancoProyecto.getIdSol().getFactLeg()));
            hoja1.setFactibilidadesTecnicas(FactibilidadesTecnicas.fromJSON(bancoProyecto.getIdSol().getFactTec()));

            ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();            
            hoja2.getRegiones().getTarget().clear();
            hoja2.getRegiones().setSource((List<Catregion>) servletContext.getAttribute("catalogo_regiones"));
            for (Catregion region : bancoProyecto.getIdSol().getRegiones()) {                                
                hoja2.getRegiones().getTarget().add(region);
                hoja2.getRegiones().getSource().remove(region);
            }
        }
    }

}
