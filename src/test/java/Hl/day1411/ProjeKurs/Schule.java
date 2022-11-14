package Hl.day1411.ProjeKurs;

import java.util.ArrayList;
import java.util.List;

public class Schule {
    private String schuleName;
    private int maxSchüler;
    private   List<Schüler> schülerin=new ArrayList<>();
    public Schule(String schuleName, int maxSchüler) {
        setSchuleName(schuleName);
        setMaxSchüler(maxSchüler);

    }

    public void setSchuleName(String schuleName) {
        this.schuleName = schuleName;
    }

    public void setMaxSchüler(int maxSchüler) {
        this.maxSchüler = maxSchüler;
    }

    public void setSchülerin(List<Schüler> schülerin) {
        this.schülerin = schülerin;
    }

    public String getSchuleName() {
        return schuleName;
    }

    public int getMaxSchüler() {
        return maxSchüler;
    }

    public List<Schüler> getSchülerin() {
        return schülerin;
    }
}
