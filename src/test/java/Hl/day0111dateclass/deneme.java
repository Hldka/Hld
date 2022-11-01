package Hl.day0111dateclass;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        /*
        1. soru
10'un altında 3 veya 5'in katı olan tüm doğal sayıları
sıralarsak 3, 5, 6 ve 9 elde ederiz. Bu katların toplamı 23'tür.
1000'in altındaki 3 veya 5'in tüm katlarının toplamını bulun.


        Scanner input= new Scanner(System.in);
        System.out.println("bitte einen positiven Wert eingeben");
        int wert = input.nextInt();

        if((wert%3==0) ||(wert%5==0)){
            System.out.println(true);
        }else
            System.out.println(false);

        int x1= 5;

        System.out.println(x1>2? x1<4?10:8:7);
        */

        boolean x=true,z=true;
        int y=20;
        x=(y!=10)^(z==false);
        System.out.println(x+","+y+","+z);

    }
}
