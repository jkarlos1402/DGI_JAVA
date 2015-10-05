package com.sgi.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catsector")
public class Catsector implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSec")
    private Integer idSec;

    @Size(max = 40)
    @Column(name = "NomSec")
    private String nomSec;

    @OneToMany(mappedBy = "idSec")
    private List<Psolicitud> psolicitudList;
    
    @OneToMany(mappedBy = "idSec")
    private List<Catue> catueList;
    
    @JoinColumn(name = "IdTit", referencedColumnName = "IdTit")
    @ManyToOne
    private Cattitular idTit;
    
    @JoinColumn(name = "IdDpt", referencedColumnName = "idDpt")
    @ManyToOne
    private Cdepto idDpt;

    public Catsector() {
    }

    public Catsector(Integer idSec) {
        this.idSec = idSec;
    }

    public Integer getIdSec() {
        return idSec;
    }

    public void setIdSec(Integer idSec) {
        this.idSec = idSec;
    }

    public String getNomSec() {
        return nomSec;
    }

    public void setNomSec(String nomSec) {
        this.nomSec = nomSec;
    }

    public Cattitular getIdTit() {
        return idTit;
    }

    public void setIdTit(Cattitular idTit) {
        this.idTit = idTit;
    }

    public Cdepto getIdDpt() {
        return idDpt;
    }

    public void setIdDpt(Cdepto idDpt) {
        this.idDpt = idDpt;
    }

    public List<Psolicitud> getPsolicitudList() {
        return psolicitudList;
    }

    public void setPsolicitudList(List<Psolicitud> psolicitudList) {
        this.psolicitudList = psolicitudList;
    }

    public List<Catue> getCatueList() {
        return catueList;
    }

    public void setCatueList(List<Catue> catueList) {
        this.catueList = catueList;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSec != null ? idSec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catsector)) {
            return false;
        }
        Catsector other = (Catsector) object;
        if ((this.idSec == null && other.idSec != null) || (this.idSec != null && !this.idSec.equals(other.idSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catsector[ idSec=" + idSec + " ]";
    }   

}
