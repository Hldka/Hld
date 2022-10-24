package Hl.day0410;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Tam isminizi giriniz");
        String s=scan.nextLine();

        char cilk =s.charAt(0);//
        char cort=s.split(" ")[1].charAt(0);
        char cson=s.split(" ")[2].charAt(0);

        if (s.contains(" "+" ")){
            System.out.println("Isminizin ilk harfleri : "+cilk+""+cort+""+cson);
        }
        else {
            System.out.println("Isminizin ilk harfleri : "+""+cilk+" "+""+cson);
        }*/
        String metin = "Sabiha Gül Çetin Altan";

        char karakter = ' ';

        int tane = 0;

        for(int i = 0; i < metin.length(); i++) {

            if(karakter == metin.charAt(i)) {

                ++tane;
            }
        }
        System.out.println( karakter + " yazı içinde  " + tane +" tanedir");
    }
}



