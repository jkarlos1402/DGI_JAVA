package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "relsolfte")
public class Relsolfte implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrelsolfte")
    private Integer idrelsolfte;

    @JoinColumn(name = "iddsolfte")
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private Dsolfte dsolfte;

    @JoinColumn(name = "idSol", referencedColumnName = "IdSol")
    @ManyToOne
    private Psolicitud idSol;

    @JoinColumn(name = "idFte", referencedColumnName = "idFte")
    @ManyToOne(optional = false)
    private Catfte2015 idFte;

    public Relsolfte() {
    }

    public Integer getIdrelsolfte() {
        return idrelsolfte;
    }

    public void setIdrelsolfte(Integer idrelsolfte) {
        this.idrelsolfte = idrelsolfte;
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

}
