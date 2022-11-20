package Hl.day1911practicetekrar.Okul_proje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Hosgeldini okulumuza ....");
        System.out.println("Isim giirniz...");
        String isim= scan.nextLine();
        System.out.println("Soyisim giriniz...");
        String soyisim=scan.nextLine();
        System.out.println("yasinizi giriniz...");
        int yas=scan.nextInt();
        System.out.println("bransinizi giriniz...");
        String brans=scan.next();

        scan.nextLine();//dummy hayalet komut
        System.out.println("tlf numarinizi giriniz...");
        int tel= scan.nextInt();
        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyisim,yas,brans,tel);
         List<OgretmenBilgileri> ogretmenList=new ArrayList<>();
         ogretmenList.add(adayOgretmen);
        System.out.println("ogretmenList ="+ ogretmenList);


    
    
}}
