package Hl.day1011;

import java.util.Scanner;

public class Q01 {/*

             Alttaki şekli veren bir kod yazınız:

                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6

         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen satir sayisi girin");
        int sayi=scan.nextInt();
        for (int i=1;i<=sayi;i++){
            for (int bosluk=1;bosluk<i;bosluk++){
                System.out.print(" ");}

            for (int yilkdiz=i;yilkdiz<=sayi;yilkdiz++){
                System.out.print(yilkdiz+" ");
            }System.out.println();}
        }

    }

