package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "relsolfte")
public class Relsolfte implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "iddsolfte")
    private Integer iddsolfte;

    @JoinColumn(name = "idSol", referencedColumnName = "IdSol")
    @ManyToOne(optional = false)
    private Psolicitud idSol;

    @JoinColumn(name = "idFte", referencedColumnName = "idFte")
    @ManyToOne(optional = false)
    private Catfte2015 idFte;

    @JoinColumn(name = "iddsolfte", referencedColumnName = "iddsolfte", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Dsolfte dsolfte;   

    public Relsolfte() {        
    }

    public Relsolfte(Integer iddsolfte) {
        this.iddsolfte = iddsolfte;        
    }   

    public Integer getIddsolfte() {
        return iddsolfte;
    }

    public void setIddsolfte(Integer iddsolfte) {
        this.iddsolfte = iddsolfte;
    }

    public Psolicitud getIdSol() {
        return idSol;
    }

    public void setIdSol(Psolicitud idSol) {
        this.idSol = idSol;
    }

    public Catfte2015 getIdFte() {
        return idFte;
    }

    public void setIdFte(Catfte2015 idFte) {
        this.idFte = idFte;
    }

    public Dsolfte getDsolfte() {
        return dsolfte;
    }

    public void setDsolfte(Dsolfte dsolfte) {
        this.dsolfte = dsolfte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddsolfte != null ? iddsolfte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {        
        if (!(object instanceof Relsolfte)) {
            return false;
        }
        Relsolfte other = (Relsolfte) object;
        if ((this.idFte.getIdFte() == null && other.idFte.getIdFte() != null) || (this.idFte.getIdFte() != null && !this.idFte.getIdFte().equals(other.idFte.getIdFte()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Relsolfte[ iddsolfte=" + iddsolfte + " ]";
    }

}
