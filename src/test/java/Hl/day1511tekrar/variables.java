package Hl.day1511tekrar;

import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        System.out.println("sayi1 = "+sayi1);
        System.out.println("Sayi 2= "+sayi2);

        int c=0;
        c=sayi1;
        sayi1=sayi2;
        sayi2=c;
        System.out.println("sayi1 = "+sayi1);
        System.out.println("Sayi 2= "+sayi2);
 Scanner scan =new Scanner(System.in);
        System.out.println("Bir tane string giriniz");
        String str=scan.nextLine();
String sum="";
         for (int i=str.length()-1;i>-1;i--){

             sum=sum+str.charAt(i);


         }
        System.out.println(sum);

    }

}
