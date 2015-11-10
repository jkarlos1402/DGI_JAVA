package com.sgi.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "psolicitud")
public class Psolicitud implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSol")
    private Integer idSol;

    @Column(name = "EvaSoc")
    private Short evaSoc;

    @Column(name = "ObjEstSoc")
    private Short objEstSoc;

    @Column(name = "ObjPryEje")
    private Short objPryEje;

    @Column(name = "ObjDerVia")
    private Short objDerVia;

    @Column(name = "ObjMIA")
    private Short objMIA;

    @Column(name = "ObjObr")
    private Short objObr;

    @Column(name = "ObjAcc")
    private Short objAcc;

    @Column(name = "ObjOtr")
    private Short objOtr;

    @Lob
    @Size(max = 65535)
    @Column(name = "ObjOtrObs")
    private String objOtrObs;

    @Column(name = "IdObr")
    private Integer idObr;

    @Lob
    @Size(max = 65535)
    @Column(name = "NomObr")
    private String nomObr;

    @Column(name = "Monto")
    private BigDecimal monto;

    @Column(name = "MonMun")
    private BigDecimal monMun;

    @Size(max = 40)
    @Column(name = "FteMun")
    private String fteMun;

    @Lob
    @Size(max = 65535)
    @Column(name = "PriCar")
    private String priCar;

    @Lob
    @Size(max = 65535)
    @Column(name = "NomLoc")
    private String nomLoc;

    @Column(name = "CooGeo")
    private Short cooGeo;

    @Lob
    @Size(max = 65535)
    @Column(name = "ObsCoo")
    private String obsCoo;

    @Column(name = "LatIni")
    private BigDecimal latIni;

    @Column(name = "LonIni")
    private BigDecimal lonIni;

    @Column(name = "LatFin")
    private BigDecimal latFin;

    @Column(name = "LonFin")
    private BigDecimal lonFin;

    @Lob
    @Size(max = 65535)
    @Column(name = "Imagen")
    private String imagen;

    @Column(name = "Ene")
    private BigDecimal ene;

    @Column(name = "Feb")
    private BigDecimal feb;

    @Column(name = "Mar")
    private BigDecimal mar;

    @Column(name = "Abr")
    private BigDecimal abr;

    @Column(name = "May")
    private BigDecimal may;

    @Column(name = "Jun")
    private BigDecimal jun;

    @Column(name = "Jul")
    private BigDecimal jul;

    @Column(name = "Ago")
    private BigDecimal ago;

    @Column(name = "Sep")
    private BigDecimal sep;

    @Column(name = "Oct")
    private BigDecimal oct;

    @Column(name = "Nov")
    private BigDecimal nov;

    @Column(name = "Dic")
    private BigDecimal dic;

    @Lob
    @Size(max = 65535)
    @Column(name = "ObsUE")
    private String obsUE;

    @Lob
    @Size(max = 65535)
    @Column(name = "ObsDgi")
    private String obsDgi;

    @Lob
    @Size(max = 65535)
    @Column(name = "CriSoc")
    private String criSoc;

    @Lob
    @Size(max = 65535)
    @Column(name = "DepNor")
    private String depNor;

    @Lob
    @Size(max = 65535)
    @Column(name = "Justifi")
    private String justifi;

    @Column(name = "DurAgs")
    private Short durAgs;

    @Column(name = "DurMes")
    private Short durMes;

    @Column(name = "FecCap")
    @Temporal(TemporalType.DATE)
    private Date fecCap;

    @Column(name = "IdUsu")
    private Short idUsu;

    @Column(name = "FecVig")
    @Temporal(TemporalType.DATE)
    private Date fecVig;

    @Column(name = "EstSoc")
    private Boolean estSoc;

    @Column(name = "PryEje")
    private Boolean pryEje;

    @Column(name = "LibTer")
    private Boolean libTer;

    @Column(name = "DocProp")
    private Boolean docProp;

    @Lob
    @Size(max = 16777215)
    @Column(name = "FactLeg")
    private String factLeg;

    @Lob
    @Size(max = 16777215)
    @Column(name = "FactAmb")
    private String factAmb;

    @Lob
    @Size(max = 16777215)
    @Column(name = "FactTec")
    private String factTec;

    @Column(name = "PryImObr")
    private Boolean pryImObr;

    @Column(name = "TerRef")
    private Boolean terRef;

    @Column(name = "DerVia")
    private Boolean derVia;

    @Column(name = "MecSue")
    private Boolean mecSue;

    @Column(name = "TotalPre")
    private BigDecimal totalPre;

    @Column(name = "CanMet")
    private BigDecimal canMet;

    @Column(name = "CanBen")
    private Integer canBen;

    @Column(name = "FecMod")
    @Temporal(TemporalType.DATE)
    private Date fecMod;

    @Column(name = "FecEnv")
    @Temporal(TemporalType.DATE)
    private Date fecEnv;

    @Column(name = "FecIng")
    @Temporal(TemporalType.DATE)
    private Date fecIng;

    @Column(name = "FecEval")
    @Temporal(TemporalType.DATE)
    private Date fecEval;

    @Column(name = "idTurExp")
    private Integer idTurExp;

    @Column(name = "vidaPry")
    private Integer vidaPry;

    @JoinColumn(name = "IdSolPre", referencedColumnName = "IdSolPre")
    @ManyToOne
    private Catsolpre idSolPre;

    @JoinColumn(name = "Ejercicio", referencedColumnName = "Ejercicio")
    @ManyToOne
    private Catejercicio ejercicio;

    @JoinColumn(name = "IdEdoSol", referencedColumnName = "IdEdoSol")
    @ManyToOne
    private Catedosol idEdoSol;

    @JoinColumn(name = "idTipLoc", referencedColumnName = "idTipLoc")
    @ManyToOne
    private Ctiploc idTipLoc;

    @JoinColumn(name = "IdBen", referencedColumnName = "IdBen")
    @ManyToOne
    private Catbeneficiario idBen;

    @JoinColumn(name = "IdMet", referencedColumnName = "IdMet")
    @ManyToOne
    private Catmeta idMet;

    @JoinColumn(name = "IdUE", referencedColumnName = "IdUE")
    @ManyToOne
    private Catue idUE;

    @JoinColumn(name = "IdGpo", referencedColumnName = "IdGpo")
    @ManyToOne
    private Catgposoc idGpo;

    @JoinColumn(name = "IdSec", referencedColumnName = "IdSec")
    @ManyToOne
    private Catsector idSec;

    @JoinColumn(name = "IdModEje", referencedColumnName = "idModEje")
    @ManyToOne
    private Cmodeje idModEje;

    @JoinColumn(name = "IdTipObr", referencedColumnName = "idTipObr")
    @ManyToOne
    private Ctipobr idTipObr;

    @JoinColumn(name = "IdCob", referencedColumnName = "IdCob")
    @ManyToOne
    private Catcobertura idCob;

    @JoinColumn(name = "IdTipEva", referencedColumnName = "IdTipEva")
    @ManyToOne
    private Cattipeva idTipEva;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "idSol",orphanRemoval = true)    
    private List<Relsolfte> relsolfteList;

    @ManyToMany(cascade = {CascadeType.REFRESH})
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(name = "relacusol", joinColumns = {
        @JoinColumn(name = "IdSol")}, inverseJoinColumns = {
        @JoinColumn(name = "IdAcu")})
    private List<Catacuerdo> acuerdos = new ArrayList();
    
    @ManyToMany(cascade = {CascadeType.REFRESH})
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(name = "relregsol", joinColumns = {
        @JoinColumn(name = "IdSol")}, inverseJoinColumns = {
        @JoinColumn(name = "IdReg")})
    private List<Catregion> regiones = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idSol")
    private Relsolbco relsolbco;

    public Psolicitud() {
    }

    public Psolicitud(Integer idSol) {
        this.idSol = idSol;
    }

    public List<Catregion> getRegiones() {
        return regiones;
    }

    public void setRegiones(List<Catregion> regiones) {
        this.regiones = regiones;
    }

    public Relsolbco getRelsolbco() {
        return relsolbco;
    }

    public void setRelsolbco(Relsolbco relsolbco) {
        this.relsolbco = relsolbco;
    }

    public List<Catacuerdo> getAcuerdos() {
        return acuerdos;
    }

    public void setAcuerdos(List<Catacuerdo> acuerdos) {
        this.acuerdos = acuerdos;
    }

    public void addAcuerdo(Catacuerdo acuerdo) {
        acuerdos.add(acuerdo);
    }

    public Integer getIdSol() {
        return idSol;
    }

    public void setIdSol(Integer idSol) {
        this.idSol = idSol;
    }

    public Short getEvaSoc() {
        return evaSoc;
    }

    public void setEvaSoc(Short evaSoc) {
        this.evaSoc = evaSoc;
    }

    public Short getObjEstSoc() {
        return objEstSoc;
    }

    public void setObjEstSoc(Short objEstSoc) {
        this.objEstSoc = objEstSoc;
    }

    public Short getObjPryEje() {
        return objPryEje;
    }

    public void setObjPryEje(Short objPryEje) {
        this.objPryEje = objPryEje;
    }

    public Short getObjDerVia() {
        return objDerVia;
    }

    public void setObjDerVia(Short objDerVia) {
        this.objDerVia = objDerVia;
    }

    public Short getObjMIA() {
        return objMIA;
    }

    public void setObjMIA(Short objMIA) {
        this.objMIA = objMIA;
    }

    public Short getObjObr() {
        return objObr;
    }

    public void setObjObr(Short objObr) {
        this.objObr = objObr;
    }

    public Short getObjAcc() {
        return objAcc;
    }

    public void setObjAcc(Short objAcc) {
        this.objAcc = objAcc;
    }

    public Short getObjOtr() {
        return objOtr;
    }

    public void setObjOtr(Short objOtr) {
        this.objOtr = objOtr;
    }

    public String getObjOtrObs() {
        return objOtrObs;
    }

    public void setObjOtrObs(String objOtrObs) {
        this.objOtrObs = objOtrObs;
    }

    public Integer getIdObr() {
        return idObr;
    }

    public void setIdObr(Integer idObr) {
        this.idObr = idObr;
    }

    public String getNomObr() {
        return nomObr;
    }

    public void setNomObr(String nomObr) {
        this.nomObr = nomObr;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMonMun() {
        return monMun;
    }

    public void setMonMun(BigDecimal monMun) {
        this.monMun = monMun;
    }

    public String getFteMun() {
        return fteMun;
    }

    public void setFteMun(String fteMun) {
        this.fteMun = fteMun;
    }

    public String getPriCar() {
        return priCar;
    }

    public void setPriCar(String priCar) {
        this.priCar = priCar;
    }

    public String getNomLoc() {
        return nomLoc;
    }

    public void setNomLoc(String nomLoc) {
        this.nomLoc = nomLoc;
    }

    public Short getCooGeo() {
        return cooGeo;
    }

    public void setCooGeo(Short cooGeo) {
        this.cooGeo = cooGeo;
    }

    public String getObsCoo() {
        return obsCoo;
    }

    public void setObsCoo(String obsCoo) {
        this.obsCoo = obsCoo;
    }

    public BigDecimal getLatIni() {
        return latIni;
    }

    public void setLatIni(BigDecimal latIni) {
        this.latIni = latIni;
    }

    public BigDecimal getLonIni() {
        return lonIni;
    }

    public void setLonIni(BigDecimal lonIni) {
        this.lonIni = lonIni;
    }

    public BigDecimal getLatFin() {
        return latFin;
    }

    public void setLatFin(BigDecimal latFin) {
        this.latFin = latFin;
    }

    public BigDecimal getLonFin() {
        return lonFin;
    }

    public void setLonFin(BigDecimal lonFin) {
        this.lonFin = lonFin;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public BigDecimal getEne() {
        return ene;
    }

    public void setEne(BigDecimal ene) {
        this.ene = ene;
    }

    public BigDecimal getFeb() {
        return feb;
    }

    public void setFeb(BigDecimal feb) {
        this.feb = feb;
    }

    public BigDecimal getMar() {
        return mar;
    }

    public void setMar(BigDecimal mar) {
        this.mar = mar;
    }

    public BigDecimal getAbr() {
        return abr;
    }

    public void setAbr(BigDecimal abr) {
        this.abr = abr;
    }

    public BigDecimal getMay() {
        return may;
    }

    public void setMay(BigDecimal may) {
        this.may = may;
    }

    public BigDecimal getJun() {
        return jun;
    }

    public void setJun(BigDecimal jun) {
        this.jun = jun;
    }

    public BigDecimal getJul() {
        return jul;
    }

    public void setJul(BigDecimal jul) {
        this.jul = jul;
    }

    public BigDecimal getAgo() {
        return ago;
    }

    public void setAgo(BigDecimal ago) {
        this.ago = ago;
    }

    public BigDecimal getSep() {
        return sep;
    }

    public void setSep(BigDecimal sep) {
        this.sep = sep;
    }

    public BigDecimal getOct() {
        return oct;
    }

    public void setOct(BigDecimal oct) {
        this.oct = oct;
    }

    public BigDecimal getNov() {
        return nov;
    }

    public void setNov(BigDecimal nov) {
        this.nov = nov;
    }

    public BigDecimal getDic() {
        return dic;
    }

    public void setDic(BigDecimal dic) {
        this.dic = dic;
    }

    public String getObsUE() {
        return obsUE;
    }

    public void setObsUE(String obsUE) {
        this.obsUE = obsUE;
    }

    public String getObsDgi() {
        return obsDgi;
    }

    public void setObsDgi(String obsDgi) {
        this.obsDgi = obsDgi;
    }

    public String getCriSoc() {
        return criSoc;
    }

    public void setCriSoc(String criSoc) {
        this.criSoc = criSoc;
    }

    public String getDepNor() {
        return depNor;
    }

    public void setDepNor(String depNor) {
        this.depNor = depNor;
    }

    public String getJustifi() {
        return justifi;
    }

    public void setJustifi(String justifi) {
        this.justifi = justifi;
    }

    public Short getDurAgs() {
        return durAgs;
    }

    public void setDurAgs(Short durAgs) {
        this.durAgs = durAgs;
    }

    public Short getDurMes() {
        return durMes;
    }

    public void setDurMes(Short durMes) {
        this.durMes = durMes;
    }

    public Date getFecCap() {
        return fecCap;
    }

    public void setFecCap(Date fecCap) {
        this.fecCap = fecCap;
    }

    public Short getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(Short idUsu) {
        this.idUsu = idUsu;
    }

    public Date getFecVig() {
        return fecVig;
    }

    public void setFecVig(Date fecVig) {
        this.fecVig = fecVig;
    }

    public Boolean getEstSoc() {
        return estSoc;
    }

    public void setEstSoc(Boolean estSoc) {
        this.estSoc = estSoc;
    }

    public Boolean getPryEje() {
        return pryEje;
    }

    public void setPryEje(Boolean pryEje) {
        this.pryEje = pryEje;
    }

    public Boolean getLibTer() {
        return libTer;
    }

    public void setLibTer(Boolean libTer) {
        this.libTer = libTer;
    }

    public Boolean getDocProp() {
        return docProp;
    }

    public void setDocProp(Boolean docProp) {
        this.docProp = docProp;
    }

    public String getFactLeg() {
        return factLeg;
    }

    public void setFactLeg(String factLeg) {
        this.factLeg = factLeg;
    }

    public String getFactAmb() {
        return factAmb;
    }

    public void setFactAmb(String factAmb) {
        this.factAmb = factAmb;
    }

    public String getFactTec() {
        return factTec;
    }

    public void setFactTec(String factTec) {
        this.factTec = factTec;
    }

    public Boolean getPryImObr() {
        return pryImObr;
    }

    public void setPryImObr(Boolean pryImObr) {
        this.pryImObr = pryImObr;
    }

    public Boolean getTerRef() {
        return terRef;
    }

    public void setTerRef(Boolean terRef) {
        this.terRef = terRef;
    }

    public Boolean getDerVia() {
        return derVia;
    }

    public void setDerVia(Boolean derVia) {
        this.derVia = derVia;
    }

    public Boolean getMecSue() {
        return mecSue;
    }

    public void setMecSue(Boolean mecSue) {
        this.mecSue = mecSue;
    }

    public BigDecimal getTotalPre() {
        return totalPre;
    }

    public void setTotalPre(BigDecimal totalPre) {
        this.totalPre = totalPre;
    }

    public BigDecimal getCanMet() {
        return canMet;
    }

    public void setCanMet(BigDecimal canMet) {
        this.canMet = canMet;
    }

    public Integer getCanBen() {
        return canBen;
    }

    public void setCanBen(Integer canBen) {
        this.canBen = canBen;
    }

    public Date getFecMod() {
        return fecMod;
    }

    public void setFecMod(Date fecMod) {
        this.fecMod = fecMod;
    }

    public Date getFecEnv() {
        return fecEnv;
    }

    public void setFecEnv(Date fecEnv) {
        this.fecEnv = fecEnv;
    }

    public Date getFecIng() {
        return fecIng;
    }

    public void setFecIng(Date fecIng) {
        this.fecIng = fecIng;
    }

    public Date getFecEval() {
        return fecEval;
    }

    public void setFecEval(Date fecEval) {
        this.fecEval = fecEval;
    }

    public Integer getIdTurExp() {
        return idTurExp;
    }

    public void setIdTurExp(Integer idTurExp) {
        this.idTurExp = idTurExp;
    }

    public Integer getVidaPry() {
        return vidaPry;
    }

    public void setVidaPry(Integer vidaPry) {
        this.vidaPry = vidaPry;
    }

    public Catsolpre getIdSolPre() {
        return idSolPre;
    }

    public void setIdSolPre(Catsolpre idSolPre) {
        this.idSolPre = idSolPre;
    }

    public Catejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Catejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Catedosol getIdEdoSol() {
        return idEdoSol;
    }

    public void setIdEdoSol(Catedosol idEdoSol) {
        this.idEdoSol = idEdoSol;
    }

    public Ctiploc getIdTipLoc() {
        return idTipLoc;
    }

    public void setIdTipLoc(Ctiploc idTipLoc) {
        this.idTipLoc = idTipLoc;
    }

    public Catbeneficiario getIdBen() {
        return idBen;
    }

    public void setIdBen(Catbeneficiario idBen) {
        this.idBen = idBen;
    }

    public Catmeta getIdMet() {
        return idMet;
    }

    public void setIdMet(Catmeta idMet) {
        this.idMet = idMet;
    }

    public Catue getIdUE() {
        return idUE;
    }

    public void setIdUE(Catue idUE) {
        this.idUE = idUE;
    }

    public Catgposoc getIdGpo() {
        return idGpo;
    }

    public void setIdGpo(Catgposoc idGpo) {
        this.idGpo = idGpo;
    }

    public Catsector getIdSec() {
        return idSec;
    }

    public void setIdSec(Catsector idSec) {
        this.idSec = idSec;
    }

    public Cmodeje getIdModEje() {
        return idModEje;
    }

    public void setIdModEje(Cmodeje idModEje) {
        this.idModEje = idModEje;
    }

    public Ctipobr getIdTipObr() {
        return idTipObr;
    }

    public void setIdTipObr(Ctipobr idTipObr) {
        this.idTipObr = idTipObr;
    }

    public Catcobertura getIdCob() {
        return idCob;
    }

    public void setIdCob(Catcobertura idCob) {
        this.idCob = idCob;
    }

    public Cattipeva getIdTipEva() {
        return idTipEva;
    }

    public void setIdTipEva(Cattipeva idTipEva) {
        this.idTipEva = idTipEva;
    }

    public List<Relsolfte> getRelsolfteList() {
        return relsolfteList;
    }

    public void setRelsolfteList(List<Relsolfte> relsolfteList) {
        this.relsolfteList = relsolfteList;
    }

    public void addRelsolfte(Relsolfte relsolfte) {
        if (relsolfteList == null) {
            relsolfteList = new ArrayList<Relsolfte>();
        }
        relsolfteList.add(relsolfte);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSol != null ? idSol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Psolicitud)) {
            return false;
        }
        Psolicitud other = (Psolicitud) object;
        if ((this.idSol == null && other.idSol != null) || (this.idSol != null && !this.idSol.equals(other.idSol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sgi.pojos.Psolicitud[ idSol=" + idSol + " ]";
    }

}
