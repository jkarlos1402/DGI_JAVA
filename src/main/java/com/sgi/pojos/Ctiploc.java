package com.sgi.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ctiploc")
public class Ctiploc implements Serializable {    

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipLoc")
    private Integer idTipLoc;

    @Size(max = 20)
    @Column(name = "NomTipLoc")
    private String nomTipLoc;
    
    @OneToMany(mappedBy = "idTipLoc")
    private List<Psolicitud> psolicitudList;

    public Ctiploc() {
    }

    public Ctiploc(Integer idTipLoc) {
        this.idTipLoc = idTipLoc;
    }

    public Integer getIdTipLoc() {
        return idTipLoc;
    }

    public void setIdTipLoc(Integer idTipLoc) {
        this.idTipLoc = idTipLoc;
    }

    public String getNomTipLoc() {
        return nomTipLoc;
    }

    public void setNomTipLoc(String nomTipLoc) {
        this.nomTipLoc = nomTipLoc;
    }

    public List<Psolicitud> getPsolicitudList() {
        return psolicitudList;
    }

    public void setPsolicitudList(List<Psolicitud> psolicitudList) {
        this.psolicitudList = psolicitudList;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipLoc != null ? idTipLoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctiploc)) {
            return false;
        }
        Ctiploc other = (Ctiploc) object;
        if ((this.idTipLoc == null && other.idTipLoc != null) || (this.idTipLoc != null && !this.idTipLoc.equals(other.idTipLoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Ctiploc[ idTipLoc=" + idTipLoc + " ]";
    }    

}
