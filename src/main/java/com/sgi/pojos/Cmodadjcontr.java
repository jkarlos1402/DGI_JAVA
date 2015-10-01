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
@Table(name = "cmodadjcontr")
public class Cmodadjcontr implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idmod")
    private Integer idmod;
    
    @Size(max = 64)
    @Column(name = "dscmod")
    private String dscmod;

    public Cmodadjcontr() {
    }

    public Cmodadjcontr(Integer idmod) {
        this.idmod = idmod;
    }

    public Integer getIdmod() {
        return idmod;
    }

    public void setIdmod(Integer idmod) {
        this.idmod = idmod;
    }

    public String getDscmod() {
        return dscmod;
    }

    public void setDscmod(String dscmod) {
        this.dscmod = dscmod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmod != null ? idmod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cmodadjcontr)) {
            return false;
        }
        Cmodadjcontr other = (Cmodadjcontr) object;
        if ((this.idmod == null && other.idmod != null) || (this.idmod != null && !this.idmod.equals(other.idmod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Cmodadjcontr[ idmod=" + idmod + " ]";
    }
    
}
