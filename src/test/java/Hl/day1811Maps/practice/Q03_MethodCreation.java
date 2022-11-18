package Hl.day1811Maps.practice;

import java.util.Scanner;

public class Q03_MethodCreation {
    /*
    kullanicidan alinan bir tam sayi kadar (47 den kücük ) fibonnacci dizisi olusturunuz

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("47 den kücük bir tamsayi giriniz ...");
        int sayi=scan.nextInt();
        fibonnacci(sayi);
    }

    private static void fibonnacci(int sayi) {

      int sayi1=0;
      int sayi2=1;
      int sayi3;
        System.out.println(sayi1+" ");
        System.out.println(sayi2+" ");
        if (sayi<47){for (int i=0;i<sayi;i++){sayi3=sayi1+sayi2;

            System.out.print(sayi3+" ");
        sayi1=sayi2;
        sayi2=sayi3;
        }





        }else System.out.println("47'den kücük bir sayi giriniz...");









    }
}
