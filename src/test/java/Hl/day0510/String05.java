package Hl.day0510;

public class String05 {
    public static void main(String[] args) {
        /*
        15) String gomlekFiyat = ‘$12.99’;
String kitapFiyat = ‘$35.99’;
Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
         */

        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";
        String g=gomlekFiyat.replace("$","");
        String k=kitapFiyat.replace("$","");
        double gd=Double.valueOf(g);
        double kd=Double.valueOf(k);
        System.out.println(gd+kd);

/*
16) Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız. Not: İkinci isim kapsam dışındadır.
Örnek: Tom Hanks ==> TH, Mary Star ==> MS
 */
       //  1.Yol:
        String isim = "Tom Hanks";
        String adIlkHarf = isim.substring(0,1);
        int soyadIlkHarfIndex = isim.indexOf(" ") + 1;
        System.out.println(soyadIlkHarfIndex);
        String soyadIlkHarf= isim.substring(soyadIlkHarfIndex, soyadIlkHarfIndex +1); System.out.println(adIlkHarf + soyadIlkHarf );
       // 2.Yol:
        /*
        String isim = "Tom Hanks";
        String adIlkHarf = isim.substring(0,1);
        String soyadIlkHarf = isim.split(" ")[1].substring(0, 1); System.out.println(adIlkHarf + soyadIlkHarf );
*/

    }
}
