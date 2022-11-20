package Hl.day1911practicetekrar.Okul_proje;

public class OgretmenBilgileri {
    String isim;
    String soyisim;
    int yas;
    String brans;
    int tel;

    public OgretmenBilgileri(){}
    public OgretmenBilgileri(String isim, String soyisim, int yas, String brans, int tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }



    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "\nisim='" + isim + '\'' +
                ", \nsoyisim='" + soyisim + '\'' +
                ", \nyas=" + yas +
                ", \nbrans='" + brans + '\'' +
                ", \ntel=" + tel +
                '}';
    }
}
