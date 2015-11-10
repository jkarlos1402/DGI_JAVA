package com.sgi.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "relsolbco")
public class Relsolbco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdBco")
    private Integer idBco;

    @Column(name = "Status")
    private Integer status;

    @Column(name = "FecReg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecReg;

    @Column(name = "FecIng")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecIng;

    @Column(name = "NumDictamen")
    private Integer numDictamen;

    @Lob
    @Size(max = 65535)
    @Column(name = "NombreResp")
    private String nombreResp;

    @Lob
    @Size(max = 65535)
    @Column(name = "CargoResp")
    private String cargoResp;

    @Size(max = 255)
    @Column(name = "TelResp")
    private String telResp;

    @Lob
    @Size(max = 65535)
    @Column(name = "EmailResp")
    private String emailResp;

    @JoinColumn(name = "IdSol")
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private Psolicitud idSol;

    public Relsolbco() {
    }

    public Relsolbco(Integer idBco) {
        this.idBco = idBco;
    }

    public Psolicitud getIdSol() {
        return idSol;
    }

    public void setIdSol(Psolicitud idSol) {
        this.idSol = idSol;
    }

    public Integer getIdBco() {
        return idBco;
    }

    public void setIdBco(Integer idBco) {
        this.idBco = idBco;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getFecReg() {
        return fecReg;
    }

    public void setFecReg(Date fecReg) {
        this.fecReg = fecReg;
    }

    public Date getFecIng() {
        return fecIng;
    }

    public void setFecIng(Date fecIng) {
        this.fecIng = fecIng;
    }

    public Integer getNumDictamen() {
        return numDictamen;
    }

    public void setNumDictamen(Integer numDictamen) {
        this.numDictamen = numDictamen;
    }

    public String getNombreResp() {
        return nombreResp;
    }

    public void setNombreResp(String nombreResp) {
        this.nombreResp = nombreResp;
    }

    public String getCargoResp() {
        return cargoResp;
    }

    public void setCargoResp(String cargoResp) {
        this.cargoResp = cargoResp;
    }

    public String getTelResp() {
        return telResp;
    }

    public void setTelResp(String telResp) {
        this.telResp = telResp;
    }

    public String getEmailResp() {
        return emailResp;
    }

    public void setEmailResp(String emailResp) {
        this.emailResp = emailResp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBco != null ? idBco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relsolbco)) {
            return false;
        }
        Relsolbco other = (Relsolbco) object;
        if ((this.idBco == null && other.idBco != null) || (this.idBco != null && !this.idBco.equals(other.idBco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Relsolbco[ idBco=" + idBco + " ]";
    }

}
