package Hl.day0510;

public class String01 {
    public static void main(String[] args) {
        /*
     S10)   Bir String in ortadaki herhangi
        bir konumda yalnızca tek bir boşluk karakteri
         olup olmadığını kontrol etmek için kod yazınız.Örnek : "Ali   can "icin konsola false yazmalidir.
         */
        /*
String a="Ali   can";
int b=a.trim().replaceAll("\\s","").length();
int c=a.trim().length();
boolean kont= c-b==1;
        System.out.println(kont);
*/

        String ka= "Hava  güzeldir";
        boolean kb=ka.trim().replaceAll("[^ ]","").length()==1;
        System.out.println(kb);
    /*
    11) Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır ‘Ali’ için kodunuz konsolda true yazmalıdır
     */

    String d1=" Hava ";
    String d2=d1.trim();
    boolean d3=d1.length()==d2.length();
        System.out.println(d3);

    }
}
