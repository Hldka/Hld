package Hl.Day04RepeatIfStatement;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);




        System.out.println("Tam isminizi giriniz...");
        String tamIsim = input.nextLine();
        char ilkharf= tamIsim.charAt(0);
        System.out.print(ilkharf);
      char soyIsminIlkHarfi= tamIsim.split( " ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);


    }
}
