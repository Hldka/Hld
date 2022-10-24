package Hl.day0610;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
/*
1) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
 */

String pwd="123dhsnHd";
        System.out.println(pwd.replaceAll(" ","").length()>8?"Gecerli parola":"Gecersiz parola");
/*
2) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
 */
Scanner scan= new Scanner(System.in );
        System.out.println("Ücgeni kenar uzunluklarini sirasiyla giriniz... \n a: \n b:\n c:");
        double a=scan.nextDouble();
        double b= scan.nextDouble();
        double c= scan.nextDouble();
        System.out.println((a==b&& b==c && c==a) ?"Eskenar ücgen ":a!=b&& b==c|| a==b&&b!=c|| c==a&&b!=c?"Ikizkenar ücgen":"cesit kenar ücgen");

/*
3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalı-
ğa yuvarla”
b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
Örneğin;
127 yukarı yuvarlanacak ve değer 130 olacaktır.
125 yukarı yuvarlanacak ve değer 130 olacaktır.
123 aşağı yuvarlanacak ve değer 120 olacaktır.
 */


int sayi= 12345;
        System.out.println(sayi%10>=5?(sayi/10+1)*10:(sayi/10)*10);

/*
4) Nested Ternary kullanarak Apex kodunu yazınız.
Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir. Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
 */
int y= 1987;
        System.out.println( y%100==0 ? y%400==0?"Artik yil":"Artik yil degildir  ":y%4==0?"Artik yil":"artik yil degildir");
        /*
        5) Nested Ternary kullanarak;
Şifreyi kontrol etmek için kodu yazınız.
8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.

6) Bir sayının mutlak değerini hesaplamak için kodu yazınız. Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.

         */


        String p="12345gvdf";
        System.out.println( p.length()>8?p.charAt(0)=='i':p.charAt(0)=='K');

    }
}
