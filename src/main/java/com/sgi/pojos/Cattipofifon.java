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
@Table(name = "cattipofifon")
public class Cattipofifon implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipOfi")
    private Integer idTipOfi;

    @Size(max = 45)
    @Column(name = "NomTipOfi")
    private String nomTipOfi;

    public Cattipofifon() {
    }

    public Cattipofifon(Integer idTipOfi) {
        this.idTipOfi = idTipOfi;
    }

    public Integer getIdTipOfi() {
        return idTipOfi;
    }

    public void setIdTipOfi(Integer idTipOfi) {
        this.idTipOfi = idTipOfi;
    }

    public String getNomTipOfi() {
        return nomTipOfi;
    }

    public void setNomTipOfi(String nomTipOfi) {
        this.nomTipOfi = nomTipOfi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipOfi != null ? idTipOfi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cattipofifon)) {
            return false;
        }
        Cattipofifon other = (Cattipofifon) object;
        if ((this.idTipOfi == null && other.idTipOfi != null) || (this.idTipOfi != null && !this.idTipOfi.equals(other.idTipOfi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cattipofifon[ idTipOfi=" + idTipOfi + " ]";
    }

}
