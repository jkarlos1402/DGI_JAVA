package com.sgi.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catejercicio")
public class Catejercicio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Ejercicio")
    private Short ejercicio;

    @Size(max = 100)
    @Column(name = "Frase")
    private String frase;

    public Catejercicio() {
    }

    public Catejercicio(Short ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Short getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Short ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ejercicio != null ? ejercicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catejercicio)) {
            return false;
        }
        Catejercicio other = (Catejercicio) object;
        if ((this.ejercicio == null && other.ejercicio != null) || (this.ejercicio != null && !this.ejercicio.equals(other.ejercicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ejercicio+"";
    }

}
