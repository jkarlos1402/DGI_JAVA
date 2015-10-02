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
@Table(name = "catrespuesta")
public class Catrespuesta implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdRsp")
    private Integer idRsp;
    
    @Size(max = 15)
    @Column(name = "NomRsp")
    private String nomRsp;

    public Catrespuesta() {
    }

    public Catrespuesta(Integer idRsp) {
        this.idRsp = idRsp;
    }

    public Integer getIdRsp() {
        return idRsp;
    }

    public void setIdRsp(Integer idRsp) {
        this.idRsp = idRsp;
    }

    public String getNomRsp() {
        return nomRsp;
    }

    public void setNomRsp(String nomRsp) {
        this.nomRsp = nomRsp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRsp != null ? idRsp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catrespuesta)) {
            return false;
        }
        Catrespuesta other = (Catrespuesta) object;
        if ((this.idRsp == null && other.idRsp != null) || (this.idRsp != null && !this.idRsp.equals(other.idRsp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catrespuesta[ idRsp=" + idRsp + " ]";
    }
    
}
