package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catmeta")
public class Catmeta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMet")
    private Short idMet;

    @Size(max = 40)
    @Column(name = "NomMet")
    private String nomMet;

    @Lob
    @Size(max = 65535)
    @Column(name = "DesMet")
    private String desMet;

    public Catmeta() {
    }

    public Catmeta(Short idMet) {
        this.idMet = idMet;
    }

    public Short getIdMet() {
        return idMet;
    }

    public void setIdMet(Short idMet) {
        this.idMet = idMet;
    }

    public String getNomMet() {
        return nomMet;
    }

    public void setNomMet(String nomMet) {
        this.nomMet = nomMet;
    }

    public String getDesMet() {
        return desMet;
    }

    public void setDesMet(String desMet) {
        this.desMet = desMet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMet != null ? idMet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catmeta)) {
            return false;
        }
        Catmeta other = (Catmeta) object;
        if ((this.idMet == null && other.idMet != null) || (this.idMet != null && !this.idMet.equals(other.idMet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catmeta[ idMet=" + idMet + " ]";
    }

}
