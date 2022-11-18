package Hl.day1811Maps.practice;

import java.util.Scanner;

public class Q02_WhileLoop {
    /*
    Girilen bir sayiya kadar olan sayilardan sadce tek olanlarini ekrana yazdiraiz
    girlen sayi dahil tek ise
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scan.nextInt();
        tekmi(sayi);

    }

    private static void tekmi(int sayi) {
        int count=0;
        while (sayi>0){
            if (sayi%2!=0){
                System.out.print(sayi+" ");

            }sayi--;
            count++;
        }
        System.out.println("count"+count);
    }
}
