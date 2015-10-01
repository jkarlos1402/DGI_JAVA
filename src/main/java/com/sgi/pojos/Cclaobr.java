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
@Table(name = "cclaobr")
public class Cclaobr implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idClaObr")
    private Integer idClaObr;
    
    @Size(max = 20)
    @Column(name = "NomClaObr")
    private String nomClaObr;

    public Cclaobr() {
    }

    public Cclaobr(Integer idClaObr) {
        this.idClaObr = idClaObr;
    }

    public Integer getIdClaObr() {
        return idClaObr;
    }

    public void setIdClaObr(Integer idClaObr) {
        this.idClaObr = idClaObr;
    }

    public String getNomClaObr() {
        return nomClaObr;
    }

    public void setNomClaObr(String nomClaObr) {
        this.nomClaObr = nomClaObr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClaObr != null ? idClaObr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cclaobr)) {
            return false;
        }
        Cclaobr other = (Cclaobr) object;
        if ((this.idClaObr == null && other.idClaObr != null) || (this.idClaObr != null && !this.idClaObr.equals(other.idClaObr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cclaobr[ idClaObr=" + idClaObr + " ]";
    }
    
}
