package Hl.day0410;

public class String9 {
    public static void main(String[] args) {
        String country = "kuTaHYa";
        country = country.substring(0,1).toUpperCase() + country.substring(1).toLowerCase();
        System.out.println(country);

/*
Kişi isimleri için 3 String değişken oluşturunuz.
 Boşluk karakterleri hariç 3 isimdeki karakter sayısının toplamını yazdırınız.
Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
 */
String a="Ali Can";
String b="Merve Star";
String c="Mark Tom";
int an=a.replace(" ","").length();
int bn=b.replace(" ","").length();
int cn=c.replace(" ","").length();

        System.out.println(an+bn+cn);


/*

String isim1 = "Ali Can";
String isim2 = "Aliye Canan";
String isim3 = "Aliyev Can Cananov";
Integer c1 = isim1.replaceAll("\\s","").length();
Integer c2 = isim2.replaceAll("\\s","").length();
Integer c3 = isim3.replaceAll("\\s","").length();
System.out.println("Bosluk karakteri olmadan 3 ismin toplam karakter sayisi: " + (c1 + c2 + c3));
 */
/*
3) Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını konsolda yazdırınız.
Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
 */

        String degisken = " Miami 33018!!! ";
        int length = degisken.replaceAll("[^0-9a-zA-Z]" , "").length();
        System.out.println(length);

/*
String s = " Miami 33018!!! ";
Integer karakterSayisi = s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
 System.out.println("Toplam alfabetik ve sayısal karakter sayisi:" + karakterSayisi);
 */

/*
Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
 */String str3= "1a3Bcf4!...";
 int s=str3.replaceAll("[1-9]","").length();
        System.out.println("s = " + s);

/*
5) Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son karakteri yazdırınız.
Örnek: 'Ali Can' için n yazdırmalısınız. ‘Miami’ için i yazdırmalısınız.
 */
String  kl= " Hava Güzel ";
String kl1=kl.trim();
String snh=kl1.substring(kl1.length()-1);
        System.out.println("snh = " + snh);
/*
        String s = "Miami ";
        int boslukOlmayanSonKrkIndex= s.trim().length()-1;
        String boslukOlmayanSonKrk = s.substring(boslukOlmayanSonKrkIndex, boslukOlmayanSonKrkIndex +1);
        System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);

        */


//6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin toplamını bulunuz.

        String jk="Pastirma sicaklari";
        int snkr=jk.charAt(jk.length()-1);
        int ilkk=jk.charAt(0);
        int toplma=snkr+ilkk;
        System.out.println("toplma = " + toplma);
        System.out.println('P'+0);
        System.out.println('i'+0);
        System.out.println('a'+0);
        System.out.println('z'+0);
        String kelime = "zehra";
        int ilkh = kelime.charAt(0);
        int sonh = kelime.charAt(kelime.length()-1);
        int topl = ilkh + sonh;
        System.out.println("topl " + topl);
        //Note :compareto : ilk harflerin ASCIII farkini bulur.







    }

}
