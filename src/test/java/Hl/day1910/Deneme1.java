package Hl.day1910;

import java.util.Scanner;

public class Deneme1 {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen -128 ile 127 arasında bir sayı giriniz");
        Byte sayı = scan.nextByte();
        System.out.println(5*sayı);
*/
        int sayı11 = 320000000;
        short sayı22 = (short) sayı11;
        System.out.println(sayı22);
        int i = 1; int j = 0; switch (i) {
            case 2 :
                j += 6;
            case 4 :
                j += 1;
            case 1 :
                j += 4;
            default :
                j += 2;
        }
        System.out.println("j = " + j);


    }
}
