package com.sgi.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "movbco")
public class Movbco implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idmovbco")    
    private Integer idmovbco;
    
    @Column(name = "fecMov")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecMov;
    
    @Size(max = 45)
    @Column(name = "tipMov")
    private String tipMov;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "obs")
    private String obs;
    
    @JoinColumn(name = "IdBco", referencedColumnName = "IdBco")
    @ManyToOne
    private Relsolbco idBco;

    public Movbco() {
    }

    public Movbco(Integer idmovbco) {
        this.idmovbco = idmovbco;
    }

    public Relsolbco getIdBanco() {
        return idBco;
    }

    public void setIdBanco(Relsolbco idBco) {
        this.idBco = idBco;
    }

    public Integer getIdmovbco() {
        return idmovbco;
    }

    public void setIdmovbco(Integer idmovbco) {
        this.idmovbco = idmovbco;
    }

    public Date getFecMov() {
        return fecMov;
    }

    public void setFecMov(Date fecMov) {
        this.fecMov = fecMov;
    }

    public String getTipMov() {
        return tipMov;
    }

    public void setTipMov(String tipMov) {
        this.tipMov = tipMov;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovbco != null ? idmovbco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movbco)) {
            return false;
        }
        Movbco other = (Movbco) object;
        if ((this.idmovbco == null && other.idmovbco != null) || (this.idmovbco != null && !this.idmovbco.equals(other.idmovbco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Movbco[ idmovbco=" + idmovbco + " ]";
    }
    
}
