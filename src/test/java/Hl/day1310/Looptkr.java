package Hl.day1310;

import java.util.Scanner;

public class Looptkr {
    public static void main(String[] args) {

//Example 1 kullanicadan bir sayi aliniz sayi<100 kazandin aksi halde ekrana kaybettin yazdiriniz
        Scanner scan =new Scanner(System.in);
       int num=0;
      do {
          System.out.println("Lütfen bir sayi giriniz...");
           num=scan.nextInt();
          if(num<100){
              System.out.println("kazandiniz...");
          }
      }while (num<100);
        System.out.println("kaybettiniz!");

//Example 2: ilk harfinin büyük harf olup olmadigini kontrol ediniz
      do {
          System.out.println("isim giriniz");

          char ilk = scan.next().charAt(0);
          if (ilk >= 'A' && ilk <= 'Z') {
              System.out.println("ismi basariyla girdiniz");
          } else {
              System.out.println("Isminizi yanlis girdiniz icin islem iniz iptal edilmistit ");
              break;
          }
      }while (true);















    }
}
