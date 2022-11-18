package Hl.day1811Maps.practice;

import java.util.Scanner;

public class Q01_Stringmanipulations {
    /*
    Kullanicidan 4 kelime isteyin ve cümle olarak yazdirip sonuna . koyun

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dört kelime giriniz");
        String s1=scan.next();
        String s2= scan.next();
        String s3= scan.next();
        String s4= scan.next();
        System.out.println(s1+" "+s2+" "+s3+" "+s4+".");

    }
}
