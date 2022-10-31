package Hl.manav;

import java.util.Scanner;

public class Kasa {
    public static void main(String[] args) {

        String elma="1";
        String Armut="2";
        String Kiraz="3";
        String havuc="4";
        String salatalik="5";

        Scanner scan=new Scanner(System.in);
        System.out.println("The Last Code Benders Manav'a Hosgeldiniz..." +
                "\n\t\t *****Ürünlerimiz***"+
                "\n\t 1)Elma        kg 5$"+
                "\n\t 2)Armut       kg 6$"+
                "\n\t 3)Kiraz       kg 7$ "+
                "\n\t 4)Havuc       kg 3$"+
                "\n\t 5)Salatalik   kg 1$");
        String tercih;
        double miktar;
        System.out.println("cikmak veya alisverisinizi bitirmek siterseniz Q tuslayin");
      do {
          System.out.println("Ürün listemizden ürün seciniz ve kac kilo oldugunu belirtiniz");
          tercih=scan.nextLine();
          miktar=scan.nextDouble();
          switch (tercih){
              case "1": kasa(tercih,miktar);
                  break;
              case "2":
                  kasa(tercih,miktar);
                  break;
              case "3":break;
              case "4":break;
              case "5":break;
              default:
                  System.out.println("lütfen gecerli bir secim yapinizz ");
          }
      }while (!tercih.equalsIgnoreCase("q"));


    }public static void  kasa(String sebze ,double miktar){
        switch (sebze){
            case "1":
                System.out.println(miktar*5);
            break;
            case "2":
                System.out.println(miktar*6);
                break;
            case "3":
                System.out.println(miktar*7);
                break;
            case "4":
                System.out.println(miktar*3);
                break;
            case "5":
                System.out.println(miktar*1);
                break;
            default:
                System.out.println("gecerli secim yapiniz");break;
        }


    }
}
