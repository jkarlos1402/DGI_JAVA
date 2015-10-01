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
@Table(name = "cedoaps")
public class Cedoaps implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idEdoAps")
    private Integer idEdoAps;
    
    @Size(max = 1)
    @Column(name = "CveEdoAps")
    private String cveEdoAps;
    
    @Size(max = 51)
    @Column(name = "NomEdoAps")
    private String nomEdoAps;

    public Cedoaps() {
    }

    public Cedoaps(Integer idEdoAps) {
        this.idEdoAps = idEdoAps;
    }

    public Integer getIdEdoAps() {
        return idEdoAps;
    }

    public void setIdEdoAps(Integer idEdoAps) {
        this.idEdoAps = idEdoAps;
    }

    public String getCveEdoAps() {
        return cveEdoAps;
    }

    public void setCveEdoAps(String cveEdoAps) {
        this.cveEdoAps = cveEdoAps;
    }

    public String getNomEdoAps() {
        return nomEdoAps;
    }

    public void setNomEdoAps(String nomEdoAps) {
        this.nomEdoAps = nomEdoAps;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEdoAps != null ? idEdoAps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cedoaps)) {
            return false;
        }
        Cedoaps other = (Cedoaps) object;
        if ((this.idEdoAps == null && other.idEdoAps != null) || (this.idEdoAps != null && !this.idEdoAps.equals(other.idEdoAps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cedoaps[ idEdoAps=" + idEdoAps + " ]";
    }
    
}
