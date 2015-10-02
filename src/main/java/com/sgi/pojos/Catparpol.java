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
@Table(name = "catparpol")
public class Catparpol implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdParPol")
    private Integer idParPol;
    
    @Size(max = 6)
    @Column(name = "CveParPol")
    private String cveParPol;
    
    @Size(max = 50)
    @Column(name = "NomParPol")
    private String nomParPol;

    public Catparpol() {
    }

    public Catparpol(Integer idParPol) {
        this.idParPol = idParPol;
    }

    public Integer getIdParPol() {
        return idParPol;
    }

    public void setIdParPol(Integer idParPol) {
        this.idParPol = idParPol;
    }

    public String getCveParPol() {
        return cveParPol;
    }

    public void setCveParPol(String cveParPol) {
        this.cveParPol = cveParPol;
    }

    public String getNomParPol() {
        return nomParPol;
    }

    public void setNomParPol(String nomParPol) {
        this.nomParPol = nomParPol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParPol != null ? idParPol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catparpol)) {
            return false;
        }
        Catparpol other = (Catparpol) object;
        if ((this.idParPol == null && other.idParPol != null) || (this.idParPol != null && !this.idParPol.equals(other.idParPol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catparpol[ idParPol=" + idParPol + " ]";
    }
    
}
