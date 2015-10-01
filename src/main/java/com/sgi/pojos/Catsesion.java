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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catsesion")
public class Catsesion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdSesion")
    private Integer idSesion;
        
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NomSes")
    private String nomSes;
       
    @NotNull
    @Column(name = "FecSes")
    @Temporal(TemporalType.DATE)
    private Date fecSes;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catejercicio ejercicio;

    public Catsesion() {
    }

    public Catsesion(Integer idSesion) {
        this.idSesion = idSesion;
    }

    public Catsesion(Integer idSesion, String nomSes, Date fecSes) {
        this.idSesion = idSesion;
        this.nomSes = nomSes;
        this.fecSes = fecSes;
    }

    public Catejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Catejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Integer getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(Integer idSesion) {
        this.idSesion = idSesion;
    }

    public String getNomSes() {
        return nomSes;
    }

    public void setNomSes(String nomSes) {
        this.nomSes = nomSes;
    }

    public Date getFecSes() {
        return fecSes;
    }

    public void setFecSes(Date fecSes) {
        this.fecSes = fecSes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSesion != null ? idSesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catsesion)) {
            return false;
        }
        Catsesion other = (Catsesion) object;
        if ((this.idSesion == null && other.idSesion != null) || (this.idSesion != null && !this.idSesion.equals(other.idSesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catsesion[ idSesion=" + idSesion + " ]";
    }
    
}
