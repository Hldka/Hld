package Hl.day2111okulproje;

public class Ogretmen extends Kisi{
    private String bolum;
    private  String sicilNo;

    public Ogretmen() {
       super();
    }

    public Ogretmen(String adSoyAd, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyAd, kimlikNo, yas);
        this.bolum=bolum;
        this.sicilNo=sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}'+super.toString();
    }
}

