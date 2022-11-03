package Hl.day0311;

public class Kitap {
    String kitapAdi;
    String yazarAdi;
    String sayfaSayisi;
    String seriNo;
    static  int kitapsayisi;

    public Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = String.valueOf(sayfaSayisi);
        kitapsayisi++;
        seriNo=kitapsayisi+yazarAdi.substring(0,2)+kitapAdi.substring(0,2);


    }

    Kitap(String kitapAdi, String yazarAdi, String sayfaSayisi, int seriNo){

}public void kitapbilgileri(){    System.out.println("Kitap Adi: "+kitapAdi+"\nYazar Adi: "+yazarAdi+"\nSayfa Sayisi"+sayfaSayisi+"\nSeri No: "+seriNo);
        System.out.println("==============");

    }




}
