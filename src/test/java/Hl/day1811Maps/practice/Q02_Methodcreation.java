package Hl.day1811Maps.practice;

import java.util.Scanner;

public class Q02_Methodcreation {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();
        convertCm(sayi);
    }

    private static void convertCm(double sayi) {
        double meter=sayi/100;
        double kMeter=sayi/100000;
        System.out.println("Girdiginiz santimetre degeri"+sayi+":"+ meter+"meter"+kMeter+"Kmeter");
    }


}
