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
@Table(name = "cmodeje")
public class Cmodeje implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idModEje")
    private Integer idModEje;
    
    @Size(max = 20)
    @Column(name = "NomModEje")
    private String nomModEje;

    public Cmodeje() {
    }

    public Cmodeje(Integer idModEje) {
        this.idModEje = idModEje;
    }

    public Integer getIdModEje() {
        return idModEje;
    }

    public void setIdModEje(Integer idModEje) {
        this.idModEje = idModEje;
    }

    public String getNomModEje() {
        return nomModEje;
    }

    public void setNomModEje(String nomModEje) {
        this.nomModEje = nomModEje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModEje != null ? idModEje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cmodeje)) {
            return false;
        }
        Cmodeje other = (Cmodeje) object;
        if ((this.idModEje == null && other.idModEje != null) || (this.idModEje != null && !this.idModEje.equals(other.idModEje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cmodeje[ idModEje=" + idModEje + " ]";
    }
    
}
