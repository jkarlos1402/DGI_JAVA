package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ctxtofi")
public class Ctxtofi implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTxtOfi")
    private Integer idTxtOfi;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Ctipofi idTipOfi;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catejercicio ejercicio;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catfte2015 idFte;

    @Size(max = 150)
    @Column(name = "AsuOFi")
    private String asuOFi;

    @Size(max = 20)
    @Column(name = "PfjOfi")
    private String pfjOfi;

    @Lob
    @Size(max = 65535)
    @Column(name = "fundamento")
    private String fundamento;

    @Lob
    @Size(max = 65535)
    @Column(name = "complemento")
    private String complemento;

    public Ctxtofi() {
    }

    public Ctxtofi(Integer idTxtOfi) {
        this.idTxtOfi = idTxtOfi;
    }

    public Integer getIdTxtOfi() {
        return idTxtOfi;
    }

    public void setIdTxtOfi(Integer idTxtOfi) {
        this.idTxtOfi = idTxtOfi;
    }

    public Ctipofi getIdTipOfi() {
        return idTipOfi;
    }

    public void setIdTipOfi(Ctipofi idTipOfi) {
        this.idTipOfi = idTipOfi;
    }

    public Catejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Catejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Catfte2015 getIdFte() {
        return idFte;
    }

    public void setIdFte(Catfte2015 idFte) {
        this.idFte = idFte;
    }

    public String getAsuOFi() {
        return asuOFi;
    }

    public void setAsuOFi(String asuOFi) {
        this.asuOFi = asuOFi;
    }

    public String getPfjOfi() {
        return pfjOfi;
    }

    public void setPfjOfi(String pfjOfi) {
        this.pfjOfi = pfjOfi;
    }

    public String getFundamento() {
        return fundamento;
    }

    public void setFundamento(String fundamento) {
        this.fundamento = fundamento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTxtOfi != null ? idTxtOfi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctxtofi)) {
            return false;
        }
        Ctxtofi other = (Ctxtofi) object;
        if ((this.idTxtOfi == null && other.idTxtOfi != null) || (this.idTxtOfi != null && !this.idTxtOfi.equals(other.idTxtOfi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Ctxtofi[ idTxtOfi=" + idTxtOfi + " ]";
    }

}
