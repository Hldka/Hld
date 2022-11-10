package Hl.day0911;

import java.util.Scanner;

public class ReplitScanner {
    public static void main(String[] args) {


        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz...");
        int sayi= scan.nextInt();
        System.out.println((sayi*sayi*sayi)/2);


    }
}
