package Hl.day0211;

import java.util.Scanner;

public class Nested_ücgen {
    public static void main(String[] args) {
          /*
  Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız
                 *
                * *
               * * *
              * * * *
             * * * * *
   */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz");
        int satir=scan.nextInt();

        for (int i=0;i<satir;i++){


            for (int bosluk=0;bosluk<=i;bosluk++){

     System.out.print(" ");
            }for (int yildiz=0;yildiz<i;yildiz++){
                System.out.println("*");
            }

        }
        System.out.println();



    }
}
