package Hl.day1011;

import java.util.Scanner;

public class Q03_StringRakamlar {/*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.

     Örn:
     input : J4\/4 1$ 34$¥
     output : 16

     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz...");
String str= scan.nextLine();

rkmlrtoplmai(str);


    }static void rkmlrtoplmai(String str){
        int sum=0;
        for (int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){ sum=sum+Integer.parseInt(""+str.charAt(i));}

        }
        System.out.println("rakamlar toplami:"+sum);
    }
}
