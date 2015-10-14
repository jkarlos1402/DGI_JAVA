package com.sgi.managed.beans.banco;

import com.google.gson.Gson;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "factibilidadesAmbientales")
@ViewScoped
public class FactibilidadesAmbientales implements Serializable{
    //factibilidades ambientales
    private short moda = 4;
    private short solautcu = 4;
    private short miariesgo = 4;
    private short miapart = 4;
    private short miapr = 4;
    private short infpre = 4;
    private short camb = 4;
    private short aamia = 4;
    private short actamia = 4;
    private short anramia = 4;
    private short sepmia = 4;
    private short mpamia = 4;
    private short pcca = 4;
    private short atscrp = 4;
    private short salfor = 4;
    private short plca = 4;
    private short apfo = 4;

    public FactibilidadesAmbientales() {
    }

    public short getModa() {
        return moda;
    }

    public void setModa(short moda) {
        this.moda = moda;
    }

    public short getSolautcu() {
        return solautcu;
    }

    public void setSolautcu(short solautcu) {
        this.solautcu = solautcu;
    }

    public short getMiariesgo() {
        return miariesgo;
    }

    public void setMiariesgo(short miariesgo) {
        this.miariesgo = miariesgo;
    }

    public short getMiapart() {
        return miapart;
    }

    public void setMiapart(short miapart) {
        this.miapart = miapart;
    }

    public short getMiapr() {
        return miapr;
    }

    public void setMiapr(short miapr) {
        this.miapr = miapr;
    }

    public short getInfpre() {
        return infpre;
    }

    public void setInfpre(short infpre) {
        this.infpre = infpre;
    }

    public short getCamb() {
        return camb;
    }

    public void setCamb(short camb) {
        this.camb = camb;
    }

    public short getAamia() {
        return aamia;
    }

    public void setAamia(short aamia) {
        this.aamia = aamia;
    }

    public short getActamia() {
        return actamia;
    }

    public void setActamia(short actamia) {
        this.actamia = actamia;
    }

    public short getAnramia() {
        return anramia;
    }

    public void setAnramia(short anramia) {
        this.anramia = anramia;
    }

    public short getSepmia() {
        return sepmia;
    }

    public void setSepmia(short sepmia) {
        this.sepmia = sepmia;
    }

    public short getMpamia() {
        return mpamia;
    }

    public void setMpamia(short mpamia) {
        this.mpamia = mpamia;
    }

    public short getPcca() {
        return pcca;
    }

    public void setPcca(short pcca) {
        this.pcca = pcca;
    }

    public short getAtscrp() {
        return atscrp;
    }

    public void setAtscrp(short atscrp) {
        this.atscrp = atscrp;
    }

    public short getSalfor() {
        return salfor;
    }

    public void setSalfor(short salfor) {
        this.salfor = salfor;
    }

    public short getPlca() {
        return plca;
    }

    public void setPlca(short plca) {
        this.plca = plca;
    }

    public short getApfo() {
        return apfo;
    }

    public void setApfo(short apfo) {
        this.apfo = apfo;
    }
    
    public String getFactibilidadesAmbientalesToJSON() {
        Gson gson = new Gson();
        String jsonObj = gson.toJson(this);
        System.out.println(jsonObj);
        return jsonObj;
    }
}
