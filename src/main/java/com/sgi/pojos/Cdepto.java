package com.sgi.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cdepto")
public class Cdepto implements Serializable {    
    
    private static final long serialVersionUID = 1L;
    
    @Id    
    @Column(name = "idDpt")
    private Integer idDpt;
    
    @Size(max = 200)
    @Column(name = "NomDpt")
    private String nomDpt;
    
    @Column(name = "Activo")
    private Boolean activo;            

    @JoinColumn(name = "idRes", referencedColumnName = "IdRes")
    @ManyToOne
    private Catresarea idRes;
    
    @JoinColumn(name = "idDir", referencedColumnName = "idDir")
    @ManyToOne
    private Carea idDir;
    
    @OneToMany(mappedBy = "idDpt")
    private List<Catsector> catsectorList;
    
    public Cdepto() {
    }

    public Cdepto(Integer idDpt) {
        this.idDpt = idDpt;
    }

    public Integer getIdDpt() {
        return idDpt;
    }

    public void setIdDpt(Integer idDpt) {
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

    public List<Catsector> getCatsectorList() {
        return catsectorList;
    }

    public void setCatsectorList(List<Catsector> catsectorList) {
        this.catsectorList = catsectorList;
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
