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
@Table(name = "catclasec")
public class Catclasec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClaSec")
    private Integer idClaSec;

    @Size(max = 20)
    @Column(name = "NomClaSec")
    private String nomClaSec;    

    public Catclasec() {
    }

    public Catclasec(Integer idClaSec) {
        this.idClaSec = idClaSec;
    }

    public Integer getIdClaSec() {
        return idClaSec;
    }

    public void setIdClaSec(Integer idClaSec) {
        this.idClaSec = idClaSec;
    }

    public String getNomClaSec() {
        return nomClaSec;
    }

    public void setNomClaSec(String nomClaSec) {
        this.nomClaSec = nomClaSec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClaSec != null ? idClaSec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catclasec)) {
            return false;
        }
        Catclasec other = (Catclasec) object;
        if ((this.idClaSec == null && other.idClaSec != null) || (this.idClaSec != null && !this.idClaSec.equals(other.idClaSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catclasec[ idClaSec=" + idClaSec + " ]";
    }

}
