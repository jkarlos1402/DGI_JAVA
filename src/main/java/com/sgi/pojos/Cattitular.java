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
@Table(name = "cattitular")
public class Cattitular implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdTit")
    private Integer idTit;
    
    @Size(max = 60)
    @Column(name = "Titulo")
    private String titulo;
    
    @Size(max = 30)
    @Column(name = "NomTit")
    private String nomTit;
    
    @Size(max = 40)
    @Column(name = "ApeTit")
    private String apeTit;
    
    @Size(max = 100)
    @Column(name = "CarTit")
    private String carTit;
        

    public Cattitular() {
    }

    public Cattitular(Integer idTit) {
        this.idTit = idTit;
    }

    public Integer getIdTit() {
        return idTit;
    }

    public void setIdTit(Integer idTit) {
        this.idTit = idTit;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomTit() {
        return nomTit;
    }

    public void setNomTit(String nomTit) {
        this.nomTit = nomTit;
    }

    public String getApeTit() {
        return apeTit;
    }

    public void setApeTit(String apeTit) {
        this.apeTit = apeTit;
    }

    public String getCarTit() {
        return carTit;
    }

    public void setCarTit(String carTit) {
        this.carTit = carTit;
    }    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTit != null ? idTit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cattitular)) {
            return false;
        }
        Cattitular other = (Cattitular) object;
        if ((this.idTit == null && other.idTit != null) || (this.idTit != null && !this.idTit.equals(other.idTit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cattitular[ idTit=" + idTit + " ]";
    }
    
}
