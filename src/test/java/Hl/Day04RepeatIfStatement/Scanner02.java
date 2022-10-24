package Hl.Day04RepeatIfStatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz");
        char ilk= input.next().charAt(0);

        System.out.println("Soy isminizi giriniz");
        char son=input.next().charAt(0);
        System.out.println(""+ilk+son);
        // 2.Yol:
        System.out.println("Tam isminizi giriniz...");
        String tamIsim=input.nextLine();
        char ilkHarf= tamIsim.charAt(1);
        System.out.println(ilkHarf);




    }

}
