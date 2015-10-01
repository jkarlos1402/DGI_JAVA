package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ctiprel")
public class Ctiprel implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdTipRel")
    private Short idTipRel;
    
    @Size(max = 5)
    @Column(name = "CveSrv")
    private String cveSrv;
    
    @Column(name = "Activo")
    private Boolean activo;
    
    @Size(max = 20)
    @Column(name = "NomTipRel")
    private String nomTipRel;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "TxtTipRel")
    private String txtTipRel;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "TitTipRel")
    private String titTipRel;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "CcpTipRel")
    private String ccpTipRel;   

    public Ctiprel() {
    }

    public Ctiprel(Short idTipRel) {
        this.idTipRel = idTipRel;
    }

    public Short getIdTipRel() {
        return idTipRel;
    }

    public void setIdTipRel(Short idTipRel) {
        this.idTipRel = idTipRel;
    }

    public String getCveSrv() {
        return cveSrv;
    }

    public void setCveSrv(String cveSrv) {
        this.cveSrv = cveSrv;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getNomTipRel() {
        return nomTipRel;
    }

    public void setNomTipRel(String nomTipRel) {
        this.nomTipRel = nomTipRel;
    }

    public String getTxtTipRel() {
        return txtTipRel;
    }

    public void setTxtTipRel(String txtTipRel) {
        this.txtTipRel = txtTipRel;
    }

    public String getTitTipRel() {
        return titTipRel;
    }

    public void setTitTipRel(String titTipRel) {
        this.titTipRel = titTipRel;
    }

    public String getCcpTipRel() {
        return ccpTipRel;
    }

    public void setCcpTipRel(String ccpTipRel) {
        this.ccpTipRel = ccpTipRel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipRel != null ? idTipRel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctiprel)) {
            return false;
        }
        Ctiprel other = (Ctiprel) object;
        if ((this.idTipRel == null && other.idTipRel != null) || (this.idTipRel != null && !this.idTipRel.equals(other.idTipRel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Ctiprel[ idTipRel=" + idTipRel + " ]";
    }
    
}
