package day0710;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        /*
       kullanicinin verdigi sayiyi ters cevirelim
         */


        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Bir sayi giriniz ...");
       String s=scan.nextLine();
       String s1="";
       for (int i=0;i<s.length();i++){
       String  ss=s.substring(s.length()-1-i,s.length()-i);
       s1=s1+ss;
       }
       if(s1.equals(s)){
           System.out.println("ters cevrilebilir");
       }else {
           System.out.println("ters cevrilmez");
       }*/

        int sayi = input.nextInt();
        int boskutu = 0;


        for (;sayi != 0; sayi /= 10) {//int i=sayi tanımlaması mantıksız ve silsem de bir şey değişmiyor

            int basamak = sayi % 10;

            boskutu = boskutu * 10 + basamak;
        }
        System.out.println(boskutu);















    }
}
