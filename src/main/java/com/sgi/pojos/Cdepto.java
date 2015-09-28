package com.sgi.pojos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cdepto")
public class Cdepto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id    
    @Column(name = "idDpt")
    private Short idDpt;
    
    @Size(max = 200)
    @Column(name = "NomDpt")
    private String nomDpt;
    
    @Column(name = "Activo")
    private Boolean activo;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catresarea idRes;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Carea idDir;       

    public Cdepto() {
    }

    public Cdepto(Short idDpt) {
        this.idDpt = idDpt;
    }

    public Short getIdDpt() {
        return idDpt;
    }

    public void setIdDpt(Short idDpt) {
        this.idDpt = idDpt;
    }

    public String getNomDpt() {
        return nomDpt;
    }

    public void setNomDpt(String nomDpt) {
        this.nomDpt = nomDpt;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Catresarea getIdRes() {
        return idRes;
    }

    public void setIdRes(Catresarea idRes) {
        this.idRes = idRes;
    }

    public Carea getIdDir() {
        return idDir;
    }

    public void setIdDir(Carea idDir) {
        this.idDir = idDir;
    }    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDpt != null ? idDpt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cdepto)) {
            return false;
        }
        Cdepto other = (Cdepto) object;
        if ((this.idDpt == null && other.idDpt != null) || (this.idDpt != null && !this.idDpt.equals(other.idDpt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cdepto[ idDpt=" + idDpt + " ]";
    }
    
}
