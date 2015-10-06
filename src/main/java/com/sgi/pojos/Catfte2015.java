package com.sgi.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catfte2015")
public class Catfte2015 implements Serializable {    
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idFte")
    private Integer idFte;
    
    @Size(max = 8)
    @Column(name = "CveFte")
    private String cveFte;
    
    @Size(max = 100)
    @Column(name = "DscFte")
    private String dscFte;
    
    @Column(name = "NivFte")
    private Character nivFte;
    
    @Column(name = "TipoFte")
    private Character tipoFte;
    
    @Column(name = "DestGasto")
    private Short destGasto;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFte")
    private List<Relsolfte> relsolfteList;

    public Catfte2015() {        
    }

    public Catfte2015(Integer idFte) {
        this.idFte = idFte;
    }

    public Integer getIdFte() {
        return idFte;
    }

    public void setIdFte(Integer idFte) {
        this.idFte = idFte;
    }

    public String getCveFte() {
        return cveFte;
    }

    public void setCveFte(String cveFte) {
        this.cveFte = cveFte;
    }

    public String getDscFte() {
        return dscFte;
    }

    public void setDscFte(String dscFte) {
        this.dscFte = dscFte;
    }

    public Character getNivFte() {
        return nivFte;
    }

    public void setNivFte(Character nivFte) {
        this.nivFte = nivFte;
    }

    public Character getTipoFte() {
        return tipoFte;
    }

    public void setTipoFte(Character tipoFte) {
        this.tipoFte = tipoFte;
    }

    public Short getDestGasto() {
        return destGasto;
    }

    public void setDestGasto(Short destGasto) {
        this.destGasto = destGasto;
    }

    public List<Relsolfte> getRelsolfteList() {
        return relsolfteList;
    }

    public void setRelsolfteList(List<Relsolfte> relsolfteList) {
        this.relsolfteList = relsolfteList;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFte != null ? idFte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catfte2015)) {
            return false;
        }
        Catfte2015 other = (Catfte2015) object;
        if ((this.idFte == null && other.idFte != null) || (this.idFte != null && !this.idFte.equals(other.idFte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return dscFte;
    }    
    
}
