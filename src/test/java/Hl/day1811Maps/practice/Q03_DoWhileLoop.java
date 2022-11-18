package Hl.day1811Maps.practice;

import java.util.Scanner;

public class Q03_DoWhileLoop {
    /*
    Kullanicidan x girilene kadar ekrana "Program calisiyor " yazan ve x girdiginde "program bitti yazan "
programi yaziniz     */
    public static void main(String[] args) {
        Scanner scaan=new Scanner(System.in);
        String okunan ="";
        do {
            System.out.println("harf giriniz...");
            okunan=scaan.next();
            System.out.println("program calisiyor");
        }while (!okunan.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }

}
