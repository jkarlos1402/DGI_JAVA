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
@Table(name = "cmodadj")
public class Cmodadj implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idModAdj")
    private Integer idModAdj;
    
    @Size(max = 20)
    @Column(name = "NomModAdj")
    private String nomModAdj;

    public Cmodadj() {
    }

    public Cmodadj(Integer idModAdj) {
        this.idModAdj = idModAdj;
    }

    public Integer getIdModAdj() {
        return idModAdj;
    }

    public void setIdModAdj(Integer idModAdj) {
        this.idModAdj = idModAdj;
    }

    public String getNomModAdj() {
        return nomModAdj;
    }

    public void setNomModAdj(String nomModAdj) {
        this.nomModAdj = nomModAdj;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModAdj != null ? idModAdj.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cmodadj)) {
            return false;
        }
        Cmodadj other = (Cmodadj) object;
        if ((this.idModAdj == null && other.idModAdj != null) || (this.idModAdj != null && !this.idModAdj.equals(other.idModAdj))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cmodadj[ idModAdj=" + idModAdj + " ]";
    }
    
}
