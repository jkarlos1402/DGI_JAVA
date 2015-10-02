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
@Table(name = "catregion")
public class Catregion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdReg")
    private Integer idReg;
    
    @Size(max = 4)
    @Column(name = "CveReg")
    private String cveReg;
    
    @Size(max = 20)
    @Column(name = "NomReg")
    private String nomReg;

    public Catregion() {
    }

    public Catregion(Integer idReg) {
        this.idReg = idReg;
    }

    public Integer getIdReg() {
        return idReg;
    }

    public void setIdReg(Integer idReg) {
        this.idReg = idReg;
    }

    public String getCveReg() {
        return cveReg;
    }

    public void setCveReg(String cveReg) {
        this.cveReg = cveReg;
    }

    public String getNomReg() {
        return nomReg;
    }

    public void setNomReg(String nomReg) {
        this.nomReg = nomReg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReg != null ? idReg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catregion)) {
            return false;
        }
        Catregion other = (Catregion) object;
        if ((this.idReg == null && other.idReg != null) || (this.idReg != null && !this.idReg.equals(other.idReg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catregion[ idReg=" + idReg + " ]";
    }
    
}
