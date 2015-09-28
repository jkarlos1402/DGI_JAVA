package com.sgi.managed.beans;

import com.sgi.pojos.Catejercicio;
import com.sgi.pojos.Catsector;
import com.sgi.pojos.Catue;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "hoja1Estudio")
public class Hoja1Estudio {
    private Short noBanco;
    private Catejercicio ejercicioSelected;
    private List<Catejercicio> catalogoEjericios;
    private int vidaUtil;
    private String nombreObra;
    private Catue unidadEjecutora;
    private Catsector sector;

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
    
    
}
