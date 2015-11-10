package com.sgi.managed.beans.banco;

import com.google.gson.Gson;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "factibilidadesLegales")
@ViewScoped
public class FactibilidadesLegales implements Serializable {

    //factibilidades legales
    private short libder = 4;
    private short libter = 4;
    private short cfe = 4;
    private short telmex = 4;
    private short pemex = 4;
    private short inah = 4;
    private short inba = 4;
    private short sep = 4;
    private short isem = 4;
    private short conagua = 4;
    private short marcas = 4;
    private short producto = 4;
    private short caem = 4;
    private short jc = 4;
    private short autmun = 4;        

    public FactibilidadesLegales() {
    }

    public short getLibder() {
        return libder;
    }

    public void setLibder(short libder) {
        this.libder = libder;
    }

    public short getLibter() {
        return libter;
    }

    public void setLibter(short libter) {
        this.libter = libter;
    }

    public short getCfe() {
        return cfe;
    }

    public void setCfe(short cfe) {
        this.cfe = cfe;
    }

    public short getTelmex() {
        return telmex;
    }

    public void setTelmex(short telmex) {
        this.telmex = telmex;
    }

    public short getPemex() {
        return pemex;
    }

    public void setPemex(short pemex) {
        this.pemex = pemex;
    }

    public short getInah() {
        return inah;
    }

    public void setInah(short inah) {
        this.inah = inah;
    }

    public short getInba() {
        return inba;
    }

    public void setInba(short inba) {
        this.inba = inba;
    }

    public short getSep() {
        return sep;
    }

    public void setSep(short sep) {
        this.sep = sep;
    }

    public short getIsem() {
        return isem;
    }

    public void setIsem(short isem) {
        this.isem = isem;
    }

    public short getConagua() {
        return conagua;
    }

    public void setConagua(short conagua) {
        this.conagua = conagua;
    }

    public short getMarcas() {
        return marcas;
    }

    public void setMarcas(short marcas) {
        this.marcas = marcas;
    }

    public short getProducto() {
        return producto;
    }

    public void setProducto(short producto) {
        this.producto = producto;
    }

    public short getCaem() {
        return caem;
    }

    public void setCaem(short caem) {
        this.caem = caem;
    }

    public short getJc() {
        return jc;
    }

    public void setJc(short jc) {
        this.jc = jc;
    }

    public short getAutmun() {
        return autmun;
    }

    public void setAutmun(short autmun) {
        this.autmun = autmun;
    }    

    public String getFactibilidadesLegalesToJSON() {
        Gson gson = new Gson();
        String jsonObj = gson.toJson(this);        
        return jsonObj;
    }
    
    public static FactibilidadesLegales fromJSON(String json){
        Gson gson = new Gson();
        FactibilidadesLegales fact = (FactibilidadesLegales)gson.fromJson(json, FactibilidadesLegales.class);        
        return fact;
    }
}
