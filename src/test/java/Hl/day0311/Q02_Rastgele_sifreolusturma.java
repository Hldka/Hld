package Hl.day0311;

import java.util.Scanner;

public class Q02_Rastgele_sifreolusturma {
    //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Karakter sayisini giriniz");
        int karakterSayisi=scan.nextInt();
        String karakterler="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
     String sifre="";
     int sayac=0;
     int maxIndeks=karakterler.length();

     while (sayac<karakterSayisi){
       int rastgeleIndeks= (int)( Math.random()*maxIndeks);
       sifre+=karakterler.charAt(rastgeleIndeks);
       sayac++;
     } System.out.println("Sifre = "+sifre);

    }
}
