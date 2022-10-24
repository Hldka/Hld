package Hl.day2010;

import java.util.Scanner;

public class Smallstudy {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi girmesini isteyen bir prograam yazin.
        // daha sonra bu sayinin carpim tablosu yazdirmasini isteyin

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz ");
        int sayi=input.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(sayi+"x"+i+"="+i*sayi);
        }
        


    }
}
