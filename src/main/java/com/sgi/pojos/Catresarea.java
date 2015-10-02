package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catresarea")
public class Catresarea implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "IdRes")
    private Integer idRes;
    
    @Size(max = 60)
    @Column(name = "TitRes")
    private String titRes;
    
    @Size(max = 30)
    @Column(name = "NomRes")
    private String nomRes;
    
    @Size(max = 40)
    @Column(name = "ApeRes")
    private String apeRes;
    
    @Size(max = 100)
    @Column(name = "CarRes")
    private String carRes;        

    public Catresarea() {
    }

    public Catresarea(Integer idRes) {
        this.idRes = idRes;
    }

    public Integer getIdRes() {
        return idRes;
    }

    public void setIdRes(Integer idRes) {
        this.idRes = idRes;
    }

    public String getTitRes() {
        return titRes;
    }

    public void setTitRes(String titRes) {
        this.titRes = titRes;
    }

    public String getNomRes() {
        return nomRes;
    }

    public void setNomRes(String nomRes) {
        this.nomRes = nomRes;
    }

    public String getApeRes() {
        return apeRes;
    }

    public void setApeRes(String apeRes) {
        this.apeRes = apeRes;
    }

    public String getCarRes() {
        return carRes;
    }

    public void setCarRes(String carRes) {
        this.carRes = carRes;
    }    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRes != null ? idRes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catresarea)) {
            return false;
        }
        Catresarea other = (Catresarea) object;
        if ((this.idRes == null && other.idRes != null) || (this.idRes != null && !this.idRes.equals(other.idRes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Catresarea[ idRes=" + idRes + " ]";
    }
    
}
