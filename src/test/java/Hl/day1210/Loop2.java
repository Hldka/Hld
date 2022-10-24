package Hl.day1210;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        /*
        24) Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz.
         Ardından bu fibonacci sayılarını yazdıran kodu yazınız.
Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("kactane fobonnacci görmek istersiniz...");
        int fibo1=1;
        int fibo2 =1;
        int fibonnacci =0;
        int num= scan.nextInt();
        System.out.print( "1 "+"1 ");
        for (int i=1;i<num-1;i++){
            fibonnacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonnacci;
            System.out.print(fibonnacci+" ");
        }

        System.out.println();
/*
25) Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
 Örneğin, 153, her basamağın küpüne
eşit olan 153= 1 + 125 + 27 olduğundan bir Armstrong sayısıdır. Verilen numaranın
Armstrong sayısı olup olmadığını kontrol etmek için bir kod yazınız.
 */
        System.out.println("lütfen bir sayi giriniz...");
        int sayi=scan.nextInt();
        int toplamküp=0;
        int küp=0;
        for (int i=sayi;0<sayi;i=sayi/10){
            küp=sayi%10;
            toplamküp=toplamküp+küp*küp*küp;



        }if (sayi==toplamküp){
            System.out.println(sayi+"Armstrong sayidir");
        }else {
            System.out.println(sayi+"Armstrog sayi degildir");
        }


    }
}
