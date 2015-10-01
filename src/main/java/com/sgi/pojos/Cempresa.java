package com.sgi.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cempresa")
public class Cempresa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idEmp")
    private Integer idEmp;
    
    @Column(name = "FecFin")
    @Temporal(TemporalType.DATE)
    private Date fecFin;
    
    @Column(name = "FecIni")
    @Temporal(TemporalType.DATE)
    private Date fecIni;
    
    @Size(max = 200)
    @Column(name = "NomEmp")
    private String nomEmp;
    
    @Size(max = 60)
    @Column(name = "NomRep")
    private String nomRep;
    
    @Column(name = "ObjEmp")
    private Boolean objEmp;
    
    @Size(max = 20)
    @Column(name = "RfcEmp")
    private String rfcEmp;
    
    @Size(max = 50)
    @Column(name = "rel")
    private String rel;
    
    @Size(max = 50)
    @Column(name = "padronContr")
    private String padronContr;

    public Cempresa() {
    }

    public Cempresa(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public Date getFecIni() {
        return fecIni;
    }

    public void setFecIni(Date fecIni) {
        this.fecIni = fecIni;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getNomRep() {
        return nomRep;
    }

    public void setNomRep(String nomRep) {
        this.nomRep = nomRep;
    }

    public Boolean getObjEmp() {
        return objEmp;
    }

    public void setObjEmp(Boolean objEmp) {
        this.objEmp = objEmp;
    }

    public String getRfcEmp() {
        return rfcEmp;
    }

    public void setRfcEmp(String rfcEmp) {
        this.rfcEmp = rfcEmp;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getPadronContr() {
        return padronContr;
    }

    public void setPadronContr(String padronContr) {
        this.padronContr = padronContr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmp != null ? idEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cempresa)) {
            return false;
        }
        Cempresa other = (Cempresa) object;
        if ((this.idEmp == null && other.idEmp != null) || (this.idEmp != null && !this.idEmp.equals(other.idEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cempresa[ idEmp=" + idEmp + " ]";
    }
    
}
