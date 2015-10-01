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
@Table(name = "cedoofi")
public class Cedoofi implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)       
    @Column(name = "idEdoOfi")
    private Integer idEdoOfi;
    
    @Size(max = 1)
    @Column(name = "CveEdoOfi")
    private String cveEdoOfi;
    
    @Size(max = 15)
    @Column(name = "NomEdoOfi")
    private String nomEdoOfi;

    public Cedoofi() {
    }

    public Cedoofi(Integer idEdoOfi) {
        this.idEdoOfi = idEdoOfi;
    }

    public Integer getIdEdoOfi() {
        return idEdoOfi;
    }

    public void setIdEdoOfi(Integer idEdoOfi) {
        this.idEdoOfi = idEdoOfi;
    }

    public String getCveEdoOfi() {
        return cveEdoOfi;
    }

    public void setCveEdoOfi(String cveEdoOfi) {
        this.cveEdoOfi = cveEdoOfi;
    }

    public String getNomEdoOfi() {
        return nomEdoOfi;
    }

    public void setNomEdoOfi(String nomEdoOfi) {
        this.nomEdoOfi = nomEdoOfi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEdoOfi != null ? idEdoOfi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cedoofi)) {
            return false;
        }
        Cedoofi other = (Cedoofi) object;
        if ((this.idEdoOfi == null && other.idEdoOfi != null) || (this.idEdoOfi != null && !this.idEdoOfi.equals(other.idEdoOfi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cedoofi[ idEdoOfi=" + idEdoOfi + " ]";
    }
    
}
