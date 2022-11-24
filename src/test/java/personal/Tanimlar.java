package personal;

import java.util.HashMap;

public class Tanimlar {
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private boolean flag = true;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    private String Id;
    private String name;
    private String adres;
    private String telno;

    public  Tanimlar(){}
    private HashMap<String,Tanimlar> setListe= new HashMap<>();

    public HashMap<String, Tanimlar> getSetListe() {
        return setListe;
    }

    public void setSetListe(HashMap<String, Tanimlar> setListe) {
        this.setListe = setListe;
    }

    public Tanimlar(String name, String adres, String telno) {
        this.name = name;
        this.adres = adres;
        this.telno = telno;
    }
}
