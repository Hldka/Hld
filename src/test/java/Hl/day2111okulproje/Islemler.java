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

        System.out.println("sectiginiz kisi turu "+ kisiTuru+"Lütfen asagidaki islemleri seciniz ");
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
                islemMenusu();//method call ile islem
                break;
            case 2:arama();
            break;
            case 3:Listeleme();
                islemMenusu();
            break;
            case 4:silme();
            islemMenusu();
            break;
            case 5:girisPaneli();
            break;
            case 0: cikis();
            break;
            default:
                System.out.println("Güzel birsey gir");
                islemMenusu();
                break;

    }
}

    private static void cikis() {
        System.out.println("Yine bekleriz hoscakalin...");
    }

    private static void silme() {
        System.out.println("******"+ kisiTuru +"silme  sayfasina hosgeldin");
        boolean flag=true;
        if (kisiTuru.equalsIgnoreCase("ÖGRENCI")){
            System.out.println("silmek istediginiz kimlik no giriniz...");
            String silinecekKimlikNo=scan.next().replaceAll(" ","");
            for (Kisi w:ogrenciList){if (w.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)){
                System.out.println("silinen ogrenci"+w.getAdSoyAd());
                ogrenciList.remove(w);
                flag=false;
            }if (flag){
                System.out.println("bu tc yok silinmedi...");
            }}
        }else System.out.println("Silmek sitediginiz ögrteme kimlik no giriniz");
        String silinecekogrtmenKimlikNO=scan.next().replaceAll(" ","");
        for (Kisi w:ogrtmnList) { if (w.getKimlikNo().equalsIgnoreCase(silinecekogrtmenKimlikNO)){
            System.out.println("silinen ögretmen "+w.getAdSoyAd());
            ogrtmnList.remove(w);
            flag=false;
        }if (flag){
            System.out.println(" bu tc ile ögretmen bulunamadi");
        }

        }
    }

    private static void Listeleme() {System.out.println("******"+ kisiTuru +"listeleme  sayfasina hosgeldin");
       if (kisiTuru.equalsIgnoreCase("ÖGRENCI")){
           System.out.println("ogrncList="+ogrenciList);
       }else {
           for (Kisi w:ogrtmnList       ) {
               System.out.println("ögretmenList = "+w.toString());

           }
       }
    }

    private static void arama() {
        System.out.println("******"+ kisiTuru +"arama saygasina hosgeldin");
        boolean flag= true;//bayrak yukarad

if (kisiTuru.equalsIgnoreCase("ÖGRENCI")){
    //bu satirda ögrenci icin calisir
    System.out.println("kimlik nio giriniz...");
    String arananKimlikNo=scan.next().replaceAll(" ","");
    for (Kisi w:ogrenciList) { if (w.getKimlikNo().equals(arananKimlikNo)){
        System.out.println("ardaiginiz ögrenci"+w.getAdSoyAd());
        flag=false;
    }

    }if (flag){
        System.out.println("aranan tc ile ögrenci yok...");
    }
}else {
    System.out.println("******"+ kisiTuru +"arama saygasina hosgeldin");
    System.out.println("Kimlik no giriniz...");
    String arananKimlikNo=scan.next().replaceAll(" ","");
    for (Kisi w:ogrtmnList) { if (w.getKimlikNo().equalsIgnoreCase(arananKimlikNo)){
        System.out.println("aradiginiz ögretmen "+w.getAdSoyAd());
        flag=false;
    }if (flag){
        System.out.println("aranan tc ile ögretmen yok");
    }

    }
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
    System.out.println("Ögrenci no giriniz ");
    String alinanogrNo=scan.next().replaceAll(" ","");

    System.out.println("Sinifinizi giriniz ....");
    String alinansinif=scan.next();
    Ogrenci ogrenci=new Ogrenci(adSoyad,kimnlikNo,yas,alinanogrNo,alinansinif);
    ogrenciList.add(ogrenci);
    System.out.println(ogrenciList);
}else{
    System.out.println("Bölüm gir");
String bölüm=scan.nextLine();
scan.nextLine();

    System.out.println("sicil no gir");
String sicilNo=scan.nextLine();

Ogretmen ogretmen=new Ogretmen(adSoyad,kimnlikNo,yas,bölüm,sicilNo);
ogrtmnList.add(ogretmen);
    System.out.println(ogrtmnList);
}



    }
    }
