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
@Table(name = "catgposoc")
public class Catgposoc implements Serializable {    

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdGpo")
    private Integer idGpo;
    
    @Size(max = 100)
    @Column(name = "NomGpo")
    private String nomGpo;

    @OneToMany(mappedBy = "idGpo")
    private List<Psolicitud> psolicitudList;
    
    public Catgposoc() {
    }

    public Catgposoc(Integer idGpo) {
        this.idGpo = idGpo;
    }

    public Integer getIdGpo() {
        return idGpo;
    }

    public void setIdGpo(Integer idGpo) {
        this.idGpo = idGpo;
    }

    public String getNomGpo() {
        return nomGpo;
    }

    public void setNomGpo(String nomGpo) {
        this.nomGpo = nomGpo;
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
        hash += (idGpo != null ? idGpo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catgposoc)) {
            return false;
        }
        Catgposoc other = (Catgposoc) object;
        if ((this.idGpo == null && other.idGpo != null) || (this.idGpo != null && !this.idGpo.equals(other.idGpo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catgposoc[ idGpo=" + idGpo + " ]";
    }    

}
