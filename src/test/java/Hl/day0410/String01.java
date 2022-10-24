package Hl.day0410;

public class String01 {
    public static void main(String[] args) {



        String b = "Ali 12?_";
        System.out.println(b.replaceAll("\\d", "*"));
/*
String str = "Ayhan Beyhan"; Aşağıdakilerden hangisi yanlıştır?
A) System.out.println(str.toLowerCase()); Ekrana ayhan beyhan yazdırır.
B) System.out.println(str.replace("h", "")); Ekrana Ayan Beyan yazdırır.
C) System.out.println(str.replace("han", "ol"));
Compile Time Error verir çünkü 3 harf yerine 2 harf konulamaz
D) System.out.println(str.length()); Ekrana 12 yazdırır.
 */

        String str = "Ayhan Beyhan";
        System.out.println(str.toLowerCase());
        System.out.println(str.length());


/*
4. String str = "Java ah java";
Yukarıda verilen String'e göre aşağıdakilerden hangisi yanlıştır?
A) System.out.println(str.contains("J")); Ekrana true yazdırır
B) System.out.println(str.contains("x")); Ekrana -1 yazdırır
C) System.out.println(str.contains("ja")); Ekrana true yazdırır
 */


        String str1 = "Java ah java";
        System.out.println(str1.contains("x"));


/*
String str1 = "Ali"; String str2 = "ali";
Yukarıda verilen String'lere göre aşağıdakilerden hangisi yanlıştır?
A) System.out.println(str1.equals(str2)); Ekrana true yazdırır
B) System.out.println(str1.equalsIgnoreCase(str2)); Ekrana true yazdırır
C) System.out.println(str2.equals(str1)); Ekrana false yazdırır
D) System.out.println(str2.equalsIgnoreCase(str1)); Ekrana true yazdırır
6. Aşağıdakilerden hangisi yanlıştır?
A) !(false) = true
B) !(!true) = true
C) !(4<5) = false
D) !(2>3) = false
7. String str1 = "ali"; String str2 = "Ali";

Yukarıda verilen String'lere göre aşağıdakilerden hangileri yanlıştır?

A) System.out.println(str1.equalsIgnoreCase(str2)); Ekrana true yazdırır
B) System.out.println(str1==str1); Ekrana true yazdırır
C) System.out.println(str1.equals(str2)); Ekrana true yazdırır
D) System.out.println((str1+str2).equals(str2+str1)); Ekrana true yazdırır
8. String str = "şeyhan yavuz";
Yukarıdaki Stringde "s" ve "y" harflerini büyük harf yapmak için hangileri doğrudur?
A) System.out.println(str.replace("s", "S")); System.out.println(str.replace("y", "Y"));
B) System.out.println(str.replaceAll("s", "S")); System.out.println(str.replaceAll("y", "Y"));
C) System.out.println(str.replace('s', 'S')); System.out.println(str.replace('y', 'Y'));
D) System.out.println(str.replaceAll('s', 'S')); System.out.println(str.replaceAll('y', 'Y'));

 */


        String str3 = "seyhan yavuz";
        //A)
        System.out.print(str3.replace("s", "S"));
        System.out.println(str3.replace("y", "Y"));
        //B)
        System.out.print(str3.replace("s","S"));
        System.out.println(str3.replace("y","Y"));
//C)
        System.out.print(str3.replace("s","S"));
        System.out.println(str3.replace("y","Y"));

        //D
        System.out.print(str3.replaceAll("s", "S"));
        System.out.println(str3.replaceAll("y", "Y"));

String str4=str3.replace("s","S");
String str5=str4.split(" ")[1].replace("y","Y");
        System.out.println(str5);


        String str7 = "seyhan yavuz";





    }
}