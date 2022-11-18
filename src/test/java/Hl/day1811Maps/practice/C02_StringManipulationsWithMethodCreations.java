package Hl.day1811Maps.practice;

import java.util.Scanner;

public class C02_StringManipulationsWithMethodCreations {

    /*
    Girilen Strin icinde "xyz" dizimi var ise true degilse false return eden method yaziniz
    input  aoutpu

    axyzm= true
    xyz=   true
    x.yz=  false
    xyaz= false

     */


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println( "Bir string giriniz");
        String kelime= scan.nextLine().toLowerCase();
        xyzVarmi(kelime);
        System.out.println(xyzVarmi(kelime));
    }

    private static  boolean xyzVarmi(String kelime){if (kelime.contains("xyz")){return true;}else return false;
    }

}
