package Hl.day3009;

import java.util.Locale;
import java.util.Scanner;

public class Seite1IfStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ay isimlerini yaziniz ...");

    String me= scan.nextLine().toLowerCase();
// If statement 1
        if (me.equalsIgnoreCase("aralik,ocak,subat")){
            System.out.println("Kis");
        } else if (me.equalsIgnoreCase("mart,nisan,mayis")) {
            System.out.println("Ilkbahar");

        } else if (me.equalsIgnoreCase("Haziran,temmuz,agustos")) {
            System.out.println("Yaz");

        } else if (me.equalsIgnoreCase("eylül,ekim,kasim")) {
            System.out.println("Sonbahar");

        }else {
            System.out.println("gecersiz mevsim adi");
        }
        System.out.println("Ay ismi yaziniz");
        String ayadi=scan.nextLine().toLowerCase();
        if(ayadi.equals("aralik")||ayadi.equals("ocak")||ayadi.equals("subat")){
            System.out.println("KIs");
        } else if (ayadi.equals("mart")||ayadi.equals("nisan")||ayadi.equals("mayis")) {
            System.out.println("Ilkbahar");

        } else if (ayadi.equals("haziran")||ayadi.equals("temmuz")||ayadi.equals("agusto")){
            System.out.println("Yaz");

        } else if (ayadi.equals("eylül")||ayadi.equals("ekim")||ayadi.equals("kasim")) {
            System.out.println("Sonbahar");


        }else {
            System.out.println("gecersiz ay ismi girdiniz");
        }

        System.out.println("Lütfen bir sayi giriniz");
byte ayn=scan.nextByte();
        if (ayn==1){
            System.out.println("Ocak");
        } else if (ayn==2) {
            System.out.println("Subat");
        } else if (ayn==3) {
            System.out.println("Mart");
        } else if (ayn==4) {
            System.out.println("Nisan");
        } else if (ayn==5) {
            System.out.println("Mayis");
        }else if (ayn==6) {
            System.out.println("Haziran");
        } else if (ayn==7) {
            System.out.println("Temmuz");
        } else if (ayn==8) {
            System.out.println("Agustos");
        } else if (ayn==9) {
            System.out.println("Eylül");
        }else if (ayn==10) {
            System.out.println("Ekim");
        } else if (ayn==11) {
            System.out.println("Kasim");
        } else if (ayn==12) {
            System.out.println("Aralik");
        }else {
            System.out.println("gecerli bir sayi girirniz");
        }

    }}
