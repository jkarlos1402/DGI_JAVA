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
@Table(name = "catsolpre")
public class Catsolpre implements Serializable {    
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdSolPre")
    private Integer idSolPre;
    
    @Size(max = 50)
    @Column(name = "NomSolPre")
    private String nomSolPre;
    
    @OneToMany(mappedBy = "idSolPre")
    private List<Psolicitud> psolicitudList;

    public Catsolpre() {
    }

    public Catsolpre(Integer idSolPre) {
        this.idSolPre = idSolPre;
    }

    public Integer getIdSolPre() {
        return idSolPre;
    }

    public void setIdSolPre(Integer idSolPre) {
        this.idSolPre = idSolPre;
    }

    public String getNomSolPre() {
        return nomSolPre;
    }

    public void setNomSolPre(String nomSolPre) {
        this.nomSolPre = nomSolPre;
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
        hash += (idSolPre != null ? idSolPre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catsolpre)) {
            return false;
        }
        Catsolpre other = (Catsolpre) object;
        if ((this.idSolPre == null && other.idSolPre != null) || (this.idSolPre != null && !this.idSolPre.equals(other.idSolPre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catsolpre[ idSolPre=" + idSolPre + " ]";
    }    
    
}
