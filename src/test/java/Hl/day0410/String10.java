package Hl.day0410;

public class String10 {
    public static void main(String[] args) {

        //7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda yazdırınız.
//Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.

String s="Java ";
String s1=s.substring(1);



System.out.println("s1 = " + s1);
//Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda büyük harfle yazdırınız.
//Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
        String fdc="Hava Güzel";
        String fdc1=fdc.substring(0, fdc.length()-1).toUpperCase()+fdc.substring(fdc.length()-1);
        System.out.println(fdc1);

//9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm karakterleri büyük harflerle yazdırınız.
//Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
        String tp="Techpro";
        String tp1=tp.substring(0,1).toLowerCase()+tp.substring(1,tp.length()-1).toUpperCase()+tp.substring(tp.length()-1);
        System.out.println(tp1);
//10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
//Örnek: ‘Ali ‘
//‘
//Can’ için konsolda false yazmalıdır.
//Ali Can ’ için konsolda false yazmalıdır.
//Ali Can ’ için konsolda false yazmalıdır.
// ‘Ali Can’ için konsolda true yazmalıdır. // \p{Punct}



        String li=" Hayat Güzeldir*@ ";
        boolean li1=li.trim().contains(" ");
        System.out.println(li1);
      boolean av= li.trim().replaceAll("[\\p{Punct}A-Za-z0-9]","").length()==1;
        System.out.println(av);
/*
        String si = "Hayat guzeldir*@";
        boolean sil = si.trim().contains(" ");
        System.out.println(sil);


        boolean av1 = si.trim().replaceAll("[0-9A-Za-z\\p{Punct}]", "").length()==1;
        System.out.println(av1);
*/

    }
}
