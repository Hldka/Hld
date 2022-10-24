package Hl.day0910;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz
        for (int i=3;i<11;i++){
            System.out.print(i+" ");
        }
        System.out.println();
int i=3;
        while (i<11){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int k=2;
        while (k<18){
            if(k%2==0){
                System.out.print(k+" ");
            }k++;
        }
        System.out.println();
        //Example 3: 12 den 14 e kadar sayilarin toplamini veren kodu yaziniz
int h1=0;
int h=12;
        while (h<15){
            h1=h1+h;

            h++;
        }System.out.print(h1);
        System.out.println();

        //Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz
        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir rakam giriniz...");
        int sy=scan.nextInt();
        int snc=0;
        int m=sy;
        while (sy>0){
            snc=snc+sy%10;
sy=sy/10;
        }
        System.out.print(snc);
        System.out.println();
        //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        //          3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30
        System.out.println("Lütfen bir sayi giriniz...");
        int num=scan.nextInt();
        int l=1;

        while (l<11){

            System.out.print(num+"*"+l+"="+ l*num+" ");
            l++;
        }












    }
}
