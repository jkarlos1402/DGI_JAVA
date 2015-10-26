package com.sgi.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dsolfte")
public class Dsolfte implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "iddsolfte")
    private Integer iddsolfte;
        
    @Column(name = "tipoFte")
    private short tipoFte;
    
    @Column(name = "monto")
    private BigDecimal monto;
    
    @Column(name = "MontoAutorizado")
    private BigDecimal montoAutorizado;
    
    @Column(name = "MontoEjercido")
    private BigDecimal montoEjercido;
        
    @Column(name = "pjeInv")
    private BigDecimal pjeInv;
    
    @Column(name = "disponible")
    private BigDecimal disponible;
    
    @Size(max = 40)
    @Column(name = "cuenta")    
    private String cuenta;
    
    @Column(name = "sumaAnticipo")
    private BigDecimal sumaAnticipo;
    
    @Column(name = "retenciones")
    private BigDecimal retenciones;
    
    @Column(name = "comprobado")
    private BigDecimal comprobado;
    
    @Column(name = "pagado")
    private BigDecimal pagado;
    
    @Column(name = "MontoAmpliado")
    private BigDecimal montoAmpliado;
    
    @Size(max = 45)
    @Column(name = "estPrg")
    private String estPrg;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dsolfte")
    private Relsolfte relsolfte;

    public Dsolfte() {
    }

    public Dsolfte(Integer iddsolfte) {
        this.iddsolfte = iddsolfte;
    }

    public Dsolfte(Integer iddsolfte, short tipoFte, BigDecimal monto, BigDecimal pjeInv) {
        this.iddsolfte = iddsolfte;
        this.tipoFte = tipoFte;
        this.monto = monto;
        this.pjeInv = pjeInv;
    }

    public Integer getIddsolfte() {
        return iddsolfte;
    }

    public void setIddsolfte(Integer iddsolfte) {
        this.iddsolfte = iddsolfte;
    }

    public short getTipoFte() {
        return tipoFte;
    }

    public void setTipoFte(short tipoFte) {
        this.tipoFte = tipoFte;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMontoAutorizado() {
        return montoAutorizado;
    }

    public void setMontoAutorizado(BigDecimal montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }

    public BigDecimal getMontoEjercido() {
        return montoEjercido;
    }

    public void setMontoEjercido(BigDecimal montoEjercido) {
        this.montoEjercido = montoEjercido;
    }

    public BigDecimal getPjeInv() {
        return pjeInv;
    }

    public void setPjeInv(BigDecimal pjeInv) {
        this.pjeInv = pjeInv;
    }

    public BigDecimal getDisponible() {
        return disponible;
    }

    public void setDisponible(BigDecimal disponible) {
        this.disponible = disponible;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public BigDecimal getSumaAnticipo() {
        return sumaAnticipo;
    }

    public void setSumaAnticipo(BigDecimal sumaAnticipo) {
        this.sumaAnticipo = sumaAnticipo;
    }

    public BigDecimal getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(BigDecimal retenciones) {
        this.retenciones = retenciones;
    }

    public BigDecimal getComprobado() {
        return comprobado;
    }

    public void setComprobado(BigDecimal comprobado) {
        this.comprobado = comprobado;
    }

    public BigDecimal getPagado() {
        return pagado;
    }

    public void setPagado(BigDecimal pagado) {
        this.pagado = pagado;
    }

    public BigDecimal getMontoAmpliado() {
        return montoAmpliado;
    }

    public void setMontoAmpliado(BigDecimal montoAmpliado) {
        this.montoAmpliado = montoAmpliado;
    }

    public String getEstPrg() {
        return estPrg;
    }

    public void setEstPrg(String estPrg) {
        this.estPrg = estPrg;
    }

    public Relsolfte getRelsolfte() {
        return relsolfte;
    }

    public void setRelsolfte(Relsolfte relsolfte) {
        this.relsolfte = relsolfte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddsolfte != null ? iddsolfte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dsolfte)) {
            return false;
        }
        Dsolfte other = (Dsolfte) object;
        if ((this.iddsolfte == null && other.iddsolfte != null) || (this.iddsolfte != null && !this.iddsolfte.equals(other.iddsolfte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Dsolfte[ iddsolfte=" + iddsolfte + " ]";
    }
    
}
