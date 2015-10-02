package com.sgi.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catsrvpub")
public class Catsrvpub implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSrv")
    private Integer idSrv;
    
    @Size(max = 5)
    @Column(name = "CveSrv")
    private String cveSrv;
    
    @Size(max = 85)
    @Column(name = "CarSrv")
    private String carSrv;
    
    @Column(name = "FecFin")
    @Temporal(TemporalType.DATE)
    private Date fecFin;
    
    @Column(name = "FecIni")
    @Temporal(TemporalType.DATE)
    private Date fecIni;
    
    @Size(max = 5)
    @Column(name = "IniSrv")
    private String iniSrv;
    
    @Size(max = 70)
    @Column(name = "NomSrv")
    private String nomSrv;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catsector idSec;

    public Catsrvpub() {
    }

    public Catsrvpub(Integer idSrv) {
        this.idSrv = idSrv;
    }

    public Integer getIdSrv() {
        return idSrv;
    }

    public Catsector getIdSec() {
        return idSec;
    }

    public void setIdSec(Catsector idSec) {
        this.idSec = idSec;
    }

    public void setIdSrv(Integer idSrv) {
        this.idSrv = idSrv;
    }

    public String getCveSrv() {
        return cveSrv;
    }

    public void setCveSrv(String cveSrv) {
        this.cveSrv = cveSrv;
    }

    public String getCarSrv() {
        return carSrv;
    }

    public void setCarSrv(String carSrv) {
        this.carSrv = carSrv;
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

    public String getIniSrv() {
        return iniSrv;
    }

    public void setIniSrv(String iniSrv) {
        this.iniSrv = iniSrv;
    }

    public String getNomSrv() {
        return nomSrv;
    }

    public void setNomSrv(String nomSrv) {
        this.nomSrv = nomSrv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSrv != null ? idSrv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catsrvpub)) {
            return false;
        }
        Catsrvpub other = (Catsrvpub) object;
        if ((this.idSrv == null && other.idSrv != null) || (this.idSrv != null && !this.idSrv.equals(other.idSrv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catsrvpub[ idSrv=" + idSrv + " ]";
    }
    
}
