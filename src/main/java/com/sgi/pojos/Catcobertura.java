package com.sgi.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catcobertura")
public class Catcobertura implements Serializable {    

    private static final long serialVersionUID = 1L;
    
    @Id   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCob")    
    private Integer idCob;
    
    @Size(max = 15)
    @Column(name = "NomCob")
    private String nomCob;
    
    @OneToMany(mappedBy = "idCob")
    private List<Psolicitud> psolicitudList;

    public Catcobertura() {
    }

    public Catcobertura(Integer idCob) {
        this.idCob = idCob;
    }

    public Integer getIdCob() {
        return idCob;
    }

    public void setIdCob(Integer idCob) {
        this.idCob = idCob;
    }

    public String getNomCob() {
        return nomCob;
    }

    public void setNomCob(String nomCob) {
        this.nomCob = nomCob;
    }
    
    public List<Psolicitud> getPsolicitudList() {
        return psolicitudList;
    }

    public void setPsolicitudList(List<Psolicitud> psolicitudList) {
        this.psolicitudList = psolicitudList;
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
