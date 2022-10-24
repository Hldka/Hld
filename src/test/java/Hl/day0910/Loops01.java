package Hl.day0910;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        //Example 1: Asagidaki sekli ekrana yazdiran kodu yaziniz
        //          ****
        //          ****
        //          ****


        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir simge giriniz...");
        char c=scan.next().charAt(0);
        System.out.println("Lütfen satir sayisini giriniz...");
        int str=scan.nextInt();
        System.out.println("lütfen sutün sayisini giriniz...");
        int stn=scan.nextInt();

        for (int i=1;i<str+1;i++){
            for (int k=1;k<stn+1;k++){
            System.out.print(c);
        }
            System.out.println();


            }

 /*
                Example 2: Asagidaki sekil cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */


for (int i=1;i<6;i++){
    for (int k=1;k<=i;k++){
        System.out.print(k+" ");
    }
    System.out.println();
}
/*
                Example 3: Asagidaki sekil cizen kodu yaziniz
                            * * * *
                            * * *
                            * *
                            *
         */
     int row=4;
        for (int i=1;i<=4;i++){
            for (int k=4;k>=i;k--){
                System.out.print('*'+ " ");

            }
            System.out.println();
        }














    }
}
