package Hl.day2111okulproje;

public class ogrenci extends Kisi {
    private String ogrenciNo;
    private String sinif;

    public ogrenci(String adSoyAd, String kimlikNo, int yas,String ogrenciNo,String sinif) {
        super(adSoyAd, kimlikNo, yas);
        this.ogrenciNo=ogrenciNo;
        this.sinif=sinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}'+super.toString();
    }
}
