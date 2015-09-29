package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catbeneficiario")
public class Catbeneficiario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdBen")
    private Short idBen;
    
    @Size(max = 40)
    @Column(name = "NomBen")
    private String nomBen;

    public Catbeneficiario() {
    }

    public Catbeneficiario(Short idBen) {
        this.idBen = idBen;
    }

    public Short getIdBen() {
        return idBen;
    }

    public void setIdBen(Short idBen) {
        this.idBen = idBen;
    }

    public String getNomBen() {
        return nomBen;
    }

    public void setNomBen(String nomBen) {
        this.nomBen = nomBen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBen != null ? idBen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catbeneficiario)) {
            return false;
        }
        Catbeneficiario other = (Catbeneficiario) object;
        if ((this.idBen == null && other.idBen != null) || (this.idBen != null && !this.idBen.equals(other.idBen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catbeneficiario[ idBen=" + idBen + " ]";
    }
    
}
