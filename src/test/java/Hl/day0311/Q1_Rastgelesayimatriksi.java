package Hl.day0311;

import java.util.Scanner;

public class Q1_Rastgelesayimatriksi {/*

 Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.

 Input: 10

 Output:
 1 0 0 1 1 0 0 0 1 1
 0 0 1 0 1 0 1 0 0 0
 0 1 0 1 0 0 0 0 0 1
 1 1 1 0 0 0 0 1 1 1
 1 1 0 1 1 1 0 1 0 0
 1 0 0 0 1 1 0 0 0 0
 0 0 1 0 0 0 0 1 1 1
 1 1 0 1 0 1 0 0 1 0
 0 0 1 0 0 0 0 1 1 0
 1 1 1 0 0 1 1 1 1 0
 */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz...");
        int sa= scan.nextInt();

        for (int i=0;i<sa;i++){
            for (int k=0;k<sa;k++){
                System.out.print((int)(Math.random()*2)+" ");
            }System.out.println();
        }


    }
}
