package Hl.day1110;

import java.util.Scanner;

public class Loop16 {
    public static void main(String[] args) {



//21) Bir tamsayının benzersiz(tekrarsız) basamaklarının
// toplamını bulmak için kodu yazınız. Örnek:12133455  ́ 2+4=6

        String s="12133455";
        String bos="";
        int snc=0;

for (int i=s.length()-1;i>0;i--){

    String s1=s.substring(i,i+1);
    if (s.indexOf(s1)==s.lastIndexOf(s1)){snc=snc+Integer.valueOf(s1);

    }


}System.out.print(snc);

//22) 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.

        for(Integer i=3; i<10; i++){
            if(i==5){ continue;
            }
            System.out.print(i + " "); }


/*
23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
 Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir” olur,
kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı yönlendiriniz.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz...");
        int zahl=scan.nextInt();
        int resultat=0;




    }
}
