package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cattipeva")
public class Cattipeva implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdTipEva")
    private Short idTipEva;
    
    @Size(max = 50)
    @Column(name = "NomTipEva")
    private String nomTipEva;
    
    @Column(name = "Activo")
    private Boolean activo;
    
    @Column(name = "MonIni")
    private Integer monIni;
    
    @Column(name = "MonFin")
    private Integer monFin;

    public Cattipeva() {
    }

    public Cattipeva(Short idTipEva) {
        this.idTipEva = idTipEva;
    }

    public Short getIdTipEva() {
        return idTipEva;
    }

    public void setIdTipEva(Short idTipEva) {
        this.idTipEva = idTipEva;
    }

    public String getNomTipEva() {
        return nomTipEva;
    }

    public void setNomTipEva(String nomTipEva) {
        this.nomTipEva = nomTipEva;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getMonIni() {
        return monIni;
    }

    public void setMonIni(Integer monIni) {
        this.monIni = monIni;
    }

    public Integer getMonFin() {
        return monFin;
    }

    public void setMonFin(Integer monFin) {
        this.monFin = monFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipEva != null ? idTipEva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cattipeva)) {
            return false;
        }
        Cattipeva other = (Cattipeva) object;
        if ((this.idTipEva == null && other.idTipEva != null) || (this.idTipEva != null && !this.idTipEva.equals(other.idTipEva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cattipeva[ idTipEva=" + idTipEva + " ]";
    }
    
}
