package com.sgi.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catacuerdo")
public class Catacuerdo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAcu")
    private Integer idAcu;

    @ManyToOne
    @JoinColumn(name = "IdTipAcu")
    private Cattipacu idTipAcu;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catsector idSec;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catcobertura idCob;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catmunicipio idMun;

    @Size(max = 20)
    @Column(name = "CveAcu")
    private String cveAcu;

    @Lob
    @Size(max = 65535)
    @Column(name = "NomAcu")
    private String nomAcu;

    @Column(name = "CosTot")
    private BigDecimal cosTot;

    @Column(name = "FecIni")
    @Temporal(TemporalType.DATE)
    private Date fecIni;

    @Column(name = "FecFin")
    @Temporal(TemporalType.DATE)
    private Date fecFin;

    @Column(name = "FecFir")
    @Temporal(TemporalType.DATE)
    private Date fecFir;

    @Column(name = "CosBen")
    private Boolean cosBen;

    @Column(name = "PryEje")
    private Boolean pryEje;

    @Column(name = "IdPrgAcu")
    private Short idPrgAcu;

    @Column(name = "IdRef")
    private Integer idRef;

    @Column(name = "AvaFis")
    private BigDecimal avaFis;

    @Column(name = "Terminado")
    private Boolean terminado;

    @Lob
    @Size(max = 65535)
    @Column(name = "ObsAcu")
    private String obsAcu;

    @Column(name = "IdSgi")
    private Short idSgi;

    public Catacuerdo() {
    }

    public Catacuerdo(Integer idAcu) {
        this.idAcu = idAcu;
    }

    public Integer getIdAcu() {
        return idAcu;
    }

    public void setIdAcu(Integer idAcu) {
        this.idAcu = idAcu;
    }

    public Cattipacu getIdTipAcu() {
        return idTipAcu;
    }

    public void setIdTipAcu(Cattipacu idTipAcu) {
        this.idTipAcu = idTipAcu;
    }

    public Catsector getIdSec() {
        return idSec;
    }

    public void setIdSec(Catsector idSec) {
        this.idSec = idSec;
    }

    public Catcobertura getIdCob() {
        return idCob;
    }

    public void setIdCob(Catcobertura idCob) {
        this.idCob = idCob;
    }

    public Catmunicipio getIdMun() {
        return idMun;
    }

    public void setIdMun(Catmunicipio idMun) {
        this.idMun = idMun;
    }

    public String getCveAcu() {
        return cveAcu;
    }

    public void setCveAcu(String cveAcu) {
        this.cveAcu = cveAcu;
    }

    public String getNomAcu() {
        return nomAcu;
    }

    public void setNomAcu(String nomAcu) {
        this.nomAcu = nomAcu;
    }

    public BigDecimal getCosTot() {
        return cosTot;
    }

    public void setCosTot(BigDecimal cosTot) {
        this.cosTot = cosTot;
    }

    public Date getFecIni() {
        return fecIni;
    }

    public void setFecIni(Date fecIni) {
        this.fecIni = fecIni;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public Date getFecFir() {
        return fecFir;
    }

    public void setFecFir(Date fecFir) {
        this.fecFir = fecFir;
    }

    public Boolean getCosBen() {
        return cosBen;
    }

    public void setCosBen(Boolean cosBen) {
        this.cosBen = cosBen;
    }

    public Boolean getPryEje() {
        return pryEje;
    }

    public void setPryEje(Boolean pryEje) {
        this.pryEje = pryEje;
    }

    public Short getIdPrgAcu() {
        return idPrgAcu;
    }

    public void setIdPrgAcu(Short idPrgAcu) {
        this.idPrgAcu = idPrgAcu;
    }

    public Integer getIdRef() {
        return idRef;
    }

    public void setIdRef(Integer idRef) {
        this.idRef = idRef;
    }

    public BigDecimal getAvaFis() {
        return avaFis;
    }

    public void setAvaFis(BigDecimal avaFis) {
        this.avaFis = avaFis;
    }

    public Boolean getTerminado() {
        return terminado;
    }

    public void setTerminado(Boolean terminado) {
        this.terminado = terminado;
    }

    public String getObsAcu() {
        return obsAcu;
    }

    public void setObsAcu(String obsAcu) {
        this.obsAcu = obsAcu;
    }

    public Short getIdSgi() {
        return idSgi;
    }

    public void setIdSgi(Short idSgi) {
        this.idSgi = idSgi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcu != null ? idAcu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catacuerdo)) {
            return false;
        }
        Catacuerdo other = (Catacuerdo) object;
        if ((this.idAcu == null && other.idAcu != null) || (this.idAcu != null && !this.idAcu.equals(other.idAcu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return cveAcu + " " + nomAcu;
    }

}
