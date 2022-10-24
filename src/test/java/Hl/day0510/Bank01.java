package Hl.day0510;

import java.util.Scanner;

public class Bank01 {
    public static void main(String[] args) {
/*
Butik bankamiz var 10 müsterimiz var
==>hesap no:
password
bakiye
havale bilgileri gönderen ve alici
 yeni müsteri
 kayit formu
 hesap no
 password
 bakiye
 havale bilgileri gönderen ve alici
05.10 carsamba 2022 :
10 eski kullanici bilgisi girme
güvenli password olusturma
- en az 8 haneli
-en az 2 sembol icermeli
-en az 1 büyük ve 1 kücük harf icermeli
- bosluk icermemeli
-en az 1 rakam icermeli
havale bilgileri
1 tane havale gerceklestirme
 */
        String userAli= "Ali Tok";
        String userHesapNoAli="987654321";
        String userPassAli="Abcd.123";
        double userBakiyeAli= 500.50;

        String userCem="Cem Pak";
        String userHesapNoCem="123456789";
        String userPassCem="123.Abcd";
        double userBakiyeCem=255;

        Scanner scan=new Scanner(System.in);
        System.out.println("Java Bank Mutlu Günler Diler");
        System.out.println("Bankamizin konforlu hizmet alani icinde iseniz"+"*"+"Tiklayiniz");
        char yildiz=scan.next().charAt(0);
        if (yildiz=='*'){
            System.out.println("Bankamizin keyfini sürün");
        } else if (yildiz!='*') {
            System.out.println("Bankamizin ayricalikli dünyasini kesfedin ...");
        }
        else{
            System.out.println("Lütfen uygun butona basiniz...");
        }
        String user1="Ali Tok";
        String user1HesapNo="987654321";
        String user1Pass="Abcd.123";
        double user1Bakiye= 500.50;

        String user2= "Ali Tok";
        String user2HesapNo="987654321";
        String user2Pass="Abcd.123";
        double user2Bakiye= 500.50;

        String user3= "Ali Tok";
        String user3HesapNo="987654321";
        String user3Pass="Abcd.123";
        double user3Bakiye= 500.50;

        String user4= "Ali Tok";
        String user4HesapNo="987654321";
        String user4Pass="Abcd.123";
        double user4Bakiye= 500.50;

        String user5= "Ali Tok";
        String user5HesapNo="987654321";
        String user5Pass="Abcd.123";
        double user5Bakiye= 500.50;

        String user6= "Ali Tok";
        String user6HesapNo="987654321";
        String user6Pass="Abcd.123";
        double user6Bakiye= 500.50;

        String user7= "Ali Tok";
        String user7HesapNo="987654321";
        String user7Pass="Abcd.123";
        double user7Bakiye= 500.50;

        String user8= "Ali Tok";
        String user8HesapNo="987654321";
        String user8Pass="Abcd.123";
        double user8Bakiye= 500.50;

        String user9= "Ali Tok";
        String user9HesapNo="987654321";
        String user9Pass="Abcd.123";
        double user9Bakiye= 500.50;

        String user10= "Ali Tok";
        String user10HesapNo="987654321";
        String user10Pass="Abcd.123";
        double user10Bakiye= 500.50;




    }
}
