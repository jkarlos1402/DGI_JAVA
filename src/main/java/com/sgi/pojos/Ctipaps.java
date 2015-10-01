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
@Table(name = "ctipaps")
public class Ctipaps implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idTipAps")
    private Integer idTipAps;
    
    @Size(max = 1)
    @Column(name = "CveTipAps")
    private String cveTipAps;
    
    @Size(max = 15)
    @Column(name = "NomTipAps")
    private String nomTipAps;

    public Ctipaps() {
    }

    public Ctipaps(Integer idTipAps) {
        this.idTipAps = idTipAps;
    }

    public Integer getIdTipAps() {
        return idTipAps;
    }

    public void setIdTipAps(Integer idTipAps) {
        this.idTipAps = idTipAps;
    }

    public String getCveTipAps() {
        return cveTipAps;
    }

    public void setCveTipAps(String cveTipAps) {
        this.cveTipAps = cveTipAps;
    }

    public String getNomTipAps() {
        return nomTipAps;
    }

    public void setNomTipAps(String nomTipAps) {
        this.nomTipAps = nomTipAps;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipAps != null ? idTipAps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctipaps)) {
            return false;
        }
        Ctipaps other = (Ctipaps) object;
        if ((this.idTipAps == null && other.idTipAps != null) || (this.idTipAps != null && !this.idTipAps.equals(other.idTipAps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Ctipaps[ idTipAps=" + idTipAps + " ]";
    }
    
}
