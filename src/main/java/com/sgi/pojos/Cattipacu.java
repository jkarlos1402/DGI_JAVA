package com.sgi.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cattipacu")
public class Cattipacu implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdTipAcu")
    private Integer idTipAcu;
    
    @Size(max = 40)
    @Column(name = "NomTipAcu")
    private String nomTipAcu;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdTipAcu")
    private List<Catacuerdo> acuerdos = new ArrayList<>();

    public Cattipacu() {
    }

    public Cattipacu(Integer idTipAcu) {
        this.idTipAcu = idTipAcu;
    }

    public Integer getIdTipAcu() {
        return idTipAcu;
    }

    public void setIdTipAcu(Integer idTipAcu) {
        this.idTipAcu = idTipAcu;
    }

    public String getNomTipAcu() {
        return nomTipAcu;
    }

    public void setNomTipAcu(String nomTipAcu) {
        this.nomTipAcu = nomTipAcu;
    }

    public List<Catacuerdo> getAcuerdos() {
        return acuerdos;
    }

    public void setAcuerdos(List<Catacuerdo> acuerdos) {
        this.acuerdos = acuerdos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipAcu != null ? idTipAcu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cattipacu)) {
            return false;
        }
        Cattipacu other = (Cattipacu) object;
        if ((this.idTipAcu == null && other.idTipAcu != null) || (this.idTipAcu != null && !this.idTipAcu.equals(other.idTipAcu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cattipacu[ idTipAcu=" + idTipAcu + " ]";
    }
    
}
