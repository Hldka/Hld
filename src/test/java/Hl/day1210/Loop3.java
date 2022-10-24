package Hl.day1210;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {

/*
26) Kullanıcıdan bir String ve bir karakter alınız.
String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter sayısını sayınız.
Boşluk karakterlerini saymayınız.
Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda -1, Kod, kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.
Örneğin; "Java is easy" - 'a' ==> 5 "Java is easy" - 'w' ==> -1
"Java is easy" - 'e' ==> -1
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birseyöer yaziniz... ");
        String str=scan.nextLine();
        System.out.println("lütfen bir karakter giriniz");
        char ch=scan.next().charAt(0);
        int ilkindex=str.indexOf(ch);
        int sonindex=str.lastIndexOf(ch);
        int snc=0;
        if (ilkindex==sonindex){
            System.out.println(-1);
        }else {for (int i=0;i<str.length();i++)
        if (str.charAt(i)!=' '){snc++;}}
        System.out.println(snc);

/*
28) Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.
 */



    }
}
