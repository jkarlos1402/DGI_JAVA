package com.sgi.managed.beans.banco;

import com.sgi.pojos.Psolicitud;
import com.sgi.pojos.Relsolbco;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "estudioSocioEconomico")
@ViewScoped
public class Solicitud implements Serializable{
    private Relsolbco bancoProyecto;

    public Solicitud() {
        bancoProyecto = new Relsolbco();
        bancoProyecto.setIdSol(new Psolicitud());
    }

    public Solicitud(Relsolbco bancoProyecto) {
        this.bancoProyecto = bancoProyecto;
    }

    public Relsolbco getBancoProyecto() {
        return bancoProyecto;
    }

    public void setBancoProyecto(Relsolbco bancoProyecto) {
        this.bancoProyecto = bancoProyecto;
    }   
    
}
