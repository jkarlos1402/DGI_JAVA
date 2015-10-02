package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catedosol")
public class Catedosol implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdEdoSol")
    private Integer idEdoSol;
    
    @Size(max = 20)
    @Column(name = "NomEdo")
    private String nomEdo;

    public Catedosol() {
    }

    public Catedosol(Integer idEdoSol) {
        this.idEdoSol = idEdoSol;
    }

    public Integer getIdEdoSol() {
        return idEdoSol;
    }

    public void setIdEdoSol(Integer idEdoSol) {
        this.idEdoSol = idEdoSol;
    }

    public String getNomEdo() {
        return nomEdo;
    }

    public void setNomEdo(String nomEdo) {
        this.nomEdo = nomEdo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEdoSol != null ? idEdoSol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catedosol)) {
            return false;
        }
        Catedosol other = (Catedosol) object;
        if ((this.idEdoSol == null && other.idEdoSol != null) || (this.idEdoSol != null && !this.idEdoSol.equals(other.idEdoSol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catedosol[ idEdoSol=" + idEdoSol + " ]";
    }
    
}
