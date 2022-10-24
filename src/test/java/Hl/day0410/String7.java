package Hl.day0410;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {


//Ornek: "Damlaya damlaya göl olur." cümlesinde kaç  tane "a" olduğunu yazdiriniz.


        Scanner scan= new Scanner(System.in);
        System.out.println("Tam isminizi giriniz...");
        String isim=scan.nextLine();
        String isimbosluk=isim.replaceAll("[a-zA-Z1-9]","");
        int a=isimbosluk.length();
        System.out.println("a = " + a);

        if (a==0){
            System.out.println();
        }


        char cilk =isim.charAt(0);
        char cort=isim.split(" ")[1].charAt(0);
        char cson=isim.split(" ")[2].charAt(0);




    }
}
