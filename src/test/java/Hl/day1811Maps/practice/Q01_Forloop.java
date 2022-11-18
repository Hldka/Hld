package Hl.day1811Maps.practice;

import java.util.Scanner;

public class Q01_Forloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        String ch=scan.next().toLowerCase();

String sesliharfler="aeiou";
String sessizharfler="bcdfghjklmnpqrstxvwyz";
for (int i=0;i<sessizharfler.length();i++){
    if (sesliharfler.contains(ch)){
        System.out.println(ch+" sesiyharf");
        break;
    } else if (sessizharfler.contains(ch)) {
        System.out.println(ch+"sesli harf");
        break;
    } else if (ch.length()>2) {
        System.out.println("yanlis karakter girdiniz");

    } else System.out.println("lütfen harf giriniz");
}

    }
}
