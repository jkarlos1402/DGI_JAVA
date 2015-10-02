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
@Table(name = "ctipobr")
public class Ctipobr implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idTipObr")
    private Integer idTipObr;
    
    @Size(max = 20)
    @Column(name = "NomTipObr")
    private String nomTipObr;

    public Ctipobr() {
    }

    public Ctipobr(Integer idTipObr) {
        this.idTipObr = idTipObr;
    }

    public Integer getIdTipObr() {
        return idTipObr;
    }

    public void setIdTipObr(Integer idTipObr) {
        this.idTipObr = idTipObr;
    }

    public String getNomTipObr() {
        return nomTipObr;
    }

    public void setNomTipObr(String nomTipObr) {
        this.nomTipObr = nomTipObr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipObr != null ? idTipObr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctipobr)) {
            return false;
        }
        Ctipobr other = (Ctipobr) object;
        if ((this.idTipObr == null && other.idTipObr != null) || (this.idTipObr != null && !this.idTipObr.equals(other.idTipObr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Ctipobr[ idTipObr=" + idTipObr + " ]";
    }
    
}
