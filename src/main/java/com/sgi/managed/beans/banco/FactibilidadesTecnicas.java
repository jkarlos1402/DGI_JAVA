package com.sgi.managed.beans.banco;

import com.google.gson.Gson;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "factibilidadesTecnicas")
@ViewScoped
public class FactibilidadesTecnicas implements Serializable{
    
    //factibilidades tecnicas
    private short antpry = 4;
    private short pryeje = 4;
    private short mecsue = 4;
    private short esth = 4;
    private short estt = 4;
    private short estit = 4;
    private short terref = 4;

    public FactibilidadesTecnicas() {
    }
    
    public short getAntpry() {
        return antpry;
    }

    public void setAntpry(short antpry) {
        this.antpry = antpry;
    }

    public short getPryeje() {
        return pryeje;
    }

    public void setPryeje(short pryeje) {
        this.pryeje = pryeje;
    }

    public short getMecsue() {
        return mecsue;
    }

    public void setMecsue(short mecsue) {
        this.mecsue = mecsue;
    }

    public short getEsth() {
        return esth;
    }

    public void setEsth(short esth) {
        this.esth = esth;
    }

    public short getEstt() {
        return estt;
    }

    public void setEstt(short estt) {
        this.estt = estt;
    }

    public short getEstit() {
        return estit;
    }

    public void setEstit(short estit) {
        this.estit = estit;
    }

    public short getTerref() {
        return terref;
    }

    public void setTerref(short terref) {
        this.terref = terref;
    }
    
    public String getFactibilidadesTecnicasToJSON() {
        Gson gson = new Gson();
        String jsonObj = gson.toJson(this);
        System.out.println(jsonObj);
        return jsonObj;
    }
}
