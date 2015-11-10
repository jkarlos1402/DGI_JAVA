package com.sgi.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catmunicipio")
public class Catmunicipio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMun")
    private Integer idMun;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catparpol idParPol;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Catregion idReg;

    @Column(name = "CveFed")
    private Short cveFed;

    @Column(name = "CveEst")
    private Short cveEst;

    @Size(max = 30)
    @Column(name = "NomMun")
    private String nomMun;

    @Size(max = 30)
    @Column(name = "NomFed")
    private String nomFed;
    
    @ManyToMany(cascade = {CascadeType.ALL},mappedBy = "municipios")
    private List<Psolicitud> solicitudes = new ArrayList();

    public Catmunicipio() {
    }

    public Catmunicipio(Integer idMun) {
        this.idMun = idMun;
    }

    public List<Psolicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<Psolicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public Integer getIdMun() {
        return idMun;
    }

    public void setIdMun(Integer idMun) {
        this.idMun = idMun;
    }

    public Catparpol getIdParPol() {
        return idParPol;
    }

    public void setIdParPol(Catparpol idParPol) {
        this.idParPol = idParPol;
    }

    public Catregion getIdReg() {
        return idReg;
    }

    public void setIdReg(Catregion idReg) {
        this.idReg = idReg;
    }

    public Short getCveFed() {
        return cveFed;
    }

    public void setCveFed(Short cveFed) {
        this.cveFed = cveFed;
    }

    public Short getCveEst() {
        return cveEst;
    }

    public void setCveEst(Short cveEst) {
        this.cveEst = cveEst;
    }

    public String getNomMun() {
        return nomMun;
    }

    public void setNomMun(String nomMun) {
        this.nomMun = nomMun;
    }

    public String getNomFed() {
        return nomFed;
    }

    public void setNomFed(String nomFed) {
        this.nomFed = nomFed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMun != null ? idMun.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catmunicipio)) {
            return false;
        }
        Catmunicipio other = (Catmunicipio) object;
        if ((this.idMun == null && other.idMun != null) || (this.idMun != null && !this.idMun.equals(other.idMun))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomMun;
    }

}
