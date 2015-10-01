package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "catcobertura")
public class Catcobertura implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCob")    
    private Short idCob;
    
    @Size(max = 15)
    @Column(name = "NomCob")
    private String nomCob;

    public Catcobertura() {
    }

    public Catcobertura(Short idCob) {
        this.idCob = idCob;
    }

    public Short getIdCob() {
        return idCob;
    }

    public void setIdCob(Short idCob) {
        this.idCob = idCob;
    }

    public String getNomCob() {
        return nomCob;
    }

    public void setNomCob(String nomCob) {
        this.nomCob = nomCob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCob != null ? idCob.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catcobertura)) {
            return false;
        }
        Catcobertura other = (Catcobertura) object;
        if ((this.idCob == null && other.idCob != null) || (this.idCob != null && !this.idCob.equals(other.idCob))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catcobertura[ idCob=" + idCob + " ]";
    }

}
