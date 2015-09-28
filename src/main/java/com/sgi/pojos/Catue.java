package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catue")
public class Catue implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdUE")
    private Short idUE;
    
    @Size(max = 150)
    @Column(name = "NomUE")
    private String nomUE;
        
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catsector idSec;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catclasec idClaSec;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Cattitular idTit;

    public Catue() {
    }

    public Catue(Short idUE) {
        this.idUE = idUE;
    }

    public Short getIdUE() {
        return idUE;
    }

    public void setIdUE(Short idUE) {
        this.idUE = idUE;
    }

    public String getNomUE() {
        return nomUE;
    }

    public void setNomUE(String nomUE) {
        this.nomUE = nomUE;
    }

    public Catsector getIdSec() {
        return idSec;
    }

    public void setIdSec(Catsector idSec) {
        this.idSec = idSec;
    }

    public Catclasec getIdClaSec() {
        return idClaSec;
    }

    public void setIdClaSec(Catclasec idClaSec) {
        this.idClaSec = idClaSec;
    }

    public Cattitular getIdTit() {
        return idTit;
    }

    public void setIdTit(Cattitular idTit) {
        this.idTit = idTit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUE != null ? idUE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catue)) {
            return false;
        }
        Catue other = (Catue) object;
        if ((this.idUE == null && other.idUE != null) || (this.idUE != null && !this.idUE.equals(other.idUE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catue[ idUE=" + idUE + " ]";
    }
    
}
