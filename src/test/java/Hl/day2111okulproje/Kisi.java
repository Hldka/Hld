package Hl.day2111okulproje;

public class Kisi {
   private String adSoyAd;
   private String kimlikNo;
    private int yas;

    public Kisi(String adSoyAd, String kimlikNo, int yas) {
        this.adSoyAd = adSoyAd;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {

    }

    public String getAdSoyAd() {
        return adSoyAd;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setAdSoyAd(String adSoyAd) {
        this.adSoyAd = adSoyAd;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyAd='" + adSoyAd + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
