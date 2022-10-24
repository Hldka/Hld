package Hl.day0810;

import java.util.Scanner;

public class Repli02 {
    public static void main(String[] args) {

        /*
        Write a Java program to compute and print sum of two given numbers (more than or equal to zero).

If given integers or the sum have more than 10 digits, print "overflow".

EXAMPLE:

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen  sifirdan büyük veya esit bir  sayi girniz");
        long sayi1= scan.nextLong();
        System.out.println("lütfen tekrar  sifirdan büyük veya esit  bir sayi giriniz ");
        long sayi2=scan.nextLong();
        long islem=sayi1+sayi2;
   if (sayi1<0||sayi2<0){
       System.out.println("lütfen gecerli bir sayi giriniz");
   } else if (sayi1>999999999||sayi2>999999999) {
       System.out.println("overflow");
       
   } else {if (islem>999999999){
       System.out.println("Overflow");
   }else {
       System.out.println(islem);
   }}











    }
}
