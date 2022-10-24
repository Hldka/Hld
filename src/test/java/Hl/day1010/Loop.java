package Hl.day1010;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //Example 1: Kullanicidan bir sayi aliniz, sayi 100 den kucuk ise ekrana "Kazandiniz!" yazdiriniz
        //           Aksi halde ekrana "Kaybettiniz!" yazdiriniz.
        //           Kullanici kazandikca oyun devam etmeli.

        Scanner scan=new Scanner(System.in);

        int sayi = 0;
        do{
            System.out.println("Bir sayi giriniz");
            sayi = scan.nextInt();
            if(sayi<100){
                System.out.println("Kazandiniz!");
            }
        }while(sayi<100);
        System.out.println("Kaybettiniz!");
        //Example 2: Kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz


        System.out.println("isimler giriniz...");
        do {
            System.out.println("lütfen isim giriniz...");
            char ilkharf=scan.next().charAt(0);
            if (ilkharf>'A'&& ilkharf<'Z'){
                System.out.println("ismi basariyla girdiniz...");
            }else {
                System.out.println("ismi yanlis girniz");
            }break;
        }while (true);



    }
}
