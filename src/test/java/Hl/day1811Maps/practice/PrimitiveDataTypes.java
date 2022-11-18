package Hl.day1811Maps.practice;

import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args) {


    int intmax=Integer.MAX_VALUE;
    int intmin=Integer.MIN_VALUE;
        System.out.println("intmin = " + intmin);
        System.out.println("intmax = " + intmax);

        System.out.println("Hello world");
        System.out.println("\n metni bir alt satirdan itibaren yazdirir");
        System.out.println("\t metni bir tab miktari kaydiri");// metni bir tab miktari kaydiri
        System.out.println("\\ tersslash yazdiri");//\ tersslash yazdiri
        System.out.println("\' tek tirnak yazdiri");//' tek tirnak yazdiri
        System.out.println("\" cift tirnak yazdirir");//" cift tirnak yazdirir
/*
        Scanner scan =new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad=scan.nextLine();
        System.out.println("Memleketinizi giriniz");
        String memleket =scan.nextLine();
        System.out.println("Suan yasadiginiz yeri giriniz");
        String sunKonum= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println("Lütfen boyunuzu giriniz..");
        int boy= scan.nextInt();
        System.out.println("yasadiginiz yeri seviyorsaniz e yaziniz , sevmiyorsaniz h yaziniz");
        String kr=scan.next();
        if (kr.equalsIgnoreCase("e")){
            System.out.println("\n Adiniz : "+ad+"\n Memleketiniz: "+memleket+"\n Suanki konumuz: "+sunKonum+"\n Yasiniz: "+yas+"\n Boyunuz: "+boy);

        }else System.out.println(" tesekkürler bilginiz iicn");
*/
        String str1="$13.99";
        String str2="$10.55";
       str1= str1.substring(1);
       str2= str2.substring(1);
       double str11=Double.valueOf(str1);
       double str22=Double.parseDouble(str2);
        System.out.println(str11);
        System.out.println(str22);
        System.out.println((str11+str22));




}}
