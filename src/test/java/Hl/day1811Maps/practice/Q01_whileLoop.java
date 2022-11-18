package Hl.day1811Maps.practice;

import java.util.Scanner;

public class Q01_whileLoop { //girilen sayinin basamaklri toplamini bulunuuz

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        basamakTopla(sayi);
        System.out.println(basamakTopla(sayi));

    }

    private static int basamakTopla(int sayi) {
        int toplam=0;

        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }return toplam;
    }


}
