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
@Table(name = "carea")
public class Carea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDir")
    private Short idDir;
    
    @Size(max = 200)
    @Column(name = "NomDir")
    private String nomDir;
    
    @Column(name = "Activo")
    private Boolean activo;    
        
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catresarea idRes;

    public Carea() {
    }

    public Carea(Short idDir) {
        this.idDir = idDir;
    }

    public Short getIdDir() {
        return idDir;
    }

    public void setIdDir(Short idDir) {
        this.idDir = idDir;
    }

    public String getNomDir() {
        return nomDir;
    }

    public void setNomDir(String nomDir) {
        this.nomDir = nomDir;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDir != null ? idDir.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carea)) {
            return false;
        }
        Carea other = (Carea) object;
        if ((this.idDir == null && other.idDir != null) || (this.idDir != null && !this.idDir.equals(other.idDir))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Carea[ idDir=" + idDir + " ]";
    }

}
