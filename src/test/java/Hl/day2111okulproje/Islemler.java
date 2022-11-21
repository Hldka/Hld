package Hl.day2111okulproje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Kisi> ogrtmnList=new ArrayList<>();
    static List<Kisi> ogrenciList=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;

   public static void girisPaneli(){
       System.out.println("==========================");
       System.out.println("OGRENCI VE ÖGRETMEN YÖNETIM PANELI");
       System.out.println("===========================");
       System.out.println("1-ÖGRENCI ISLEMLERI");
       System.out.println("2- ÖGRETEN ISLEMLERI");
       System.out.println("Q-Cikis");
       String secim=scan.nextLine().toUpperCase();
       switch (secim){
           case "1":
               kisiTuru="ÖGRENCI";
               islemMenusu();


           case "2":
               kisiTuru="ÖGRETMEN";
               islemMenusu();


           case "Q":
           default:
               System.out.println("hatali giris :(");
               girisPaneli();
               break;
       }


   }

    private static void islemMenusu() {

        System.out.println("sectiginiz kisi turu "+ kisiTuru+"Lütfen asagidaki eslemleri seciniz ");
        System.out.println("ニニニニニニニニニニニニニニニニニニニニ ISLEMLER ニニニニニニニニニニニニニニ\n"+
               "\n 1-EKLEME\n"+
                "\n2-ARAMA\n"+
                "\n 3-LISTELEME\n"+
                "\n 4-SILME\n"+
               "\n 5-ANA MENU\n"+
                "\nQ-CIKIS\n");
        System.out.println("islem tercihinizi giriniz:");
        int seceilenIslem=scan.nextInt();
        switch (seceilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2://arama();
            break;
            case 3://Listeleme()
                islemMenusu();
            break;
            case 4://silme();
            islemMenusu();
            break;
            case 5:girisPaneli();
            break;
            case 0: //cikis();
            break;
            default:
                System.out.println("Güzel birsey gir");
                islemMenusu();
                break;

    }
}

    private static void ekle() {//bu method hem ögrtmen hem ögrtmen icin tasarlandi
        System.out.println("******"+ kisiTuru +"ekleme saygasina hosgeldin");
        System.out.println("isim soyisim gir");
        String adSoyad=scan.nextLine();
        scan.nextLine();

        System.out.println("Kimlik gir");
        String kimnlikNo=scan.nextLine();

        System.out.println("yas gir");
        int yas= scan.nextInt();

if (kisiTuru.equals("ÖGRENCI")){
    System.out.println("sonra doldur");
}else{
    System.out.println("Bölüm gir");
String bölüm=scan.nextLine();
scan.nextLine();

    System.out.println("sicil no gir");
String sicilNo=scan.nextLine();

Ogretmen ogretmen=new Ogretmen(adSoyad,kimnlikNo,yas,bölüm,sicilNo);
ogrtmnList.add(ogretmen);
}



    }
    }
