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
@Table(name = "ctipobrcontr")
public class Ctipobrcontr implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idtipo")
    private Integer idtipo;
    
    @Size(max = 64)
    @Column(name = "dsctipo")
    private String dsctipo;

    public Ctipobrcontr() {
    }

    public Ctipobrcontr(Integer idtipo) {
        this.idtipo = idtipo;
    }

    public Integer getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(Integer idtipo) {
        this.idtipo = idtipo;
    }

    public String getDsctipo() {
        return dsctipo;
    }

    public void setDsctipo(String dsctipo) {
        this.dsctipo = dsctipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipo != null ? idtipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctipobrcontr)) {
            return false;
        }
        Ctipobrcontr other = (Ctipobrcontr) object;
        if ((this.idtipo == null && other.idtipo != null) || (this.idtipo != null && !this.idtipo.equals(other.idtipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Ctipobrcontr[ idtipo=" + idtipo + " ]";
    }
    
}
