package Hl.day3110.manavproject;

import java.util.Scanner;

public class Depo {
   static Scanner input =new Scanner(System.in);



    public static void anaMenu(){
        String tercih="";
        do {
    System.out.println("************THe last code benders manav************\n"+"***********Ana Menu***********\n"+"\n"+
            "\t 1. Elma\t\t\t"+"\n"+
            "\t 2. Armut\t\t\t"+"\n"+
            "\t 3. Havuc\t\t\t"+"\n"+
            "\t 4. Kiraz\t\t\t"+"\n"+
            "\t 5. Salatalik\t\t\t"+"\n"+
            "\t Q cikis\t\t\t");
            System.out.println("Lütfen menüden tercihinizi yapiniz");
        tercih=input.nextLine();
        switch (tercih){
            case "1":Depo.ElmaBilgileriniYazdir();
                break;

            case  "2":break;

            case "3":break;
            case "4":break;
            case "5":break;
            case "q":break;
            default:
                System.out.println("Lütfen gecerli br secim yapiniz");
        }

        }while (!tercih.equalsIgnoreCase("Q"));
        Depo.projeDurdur();


    }public static void ElmaBilgileriniYazdir(){
        System.out.println("\t\tElma adi:"+Elma.elma+"\n\t\t Elma kg Fiyati"+Elma.elmafiyat);
    }
public static void projeDurdur(){
        System.out.println("Manavdan ciktiniz");
    }
}
