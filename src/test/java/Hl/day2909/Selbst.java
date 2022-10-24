package Hl.day2909;

import java.util.Scanner;

public class Selbst {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz...");

        byte yas= scan.nextByte();

        if( yas>18){
            System.out.println("Resit ");
        } else{
            System.out.println((18-yas)+"Yill sonra Resit olacaksiniz");
        }








    }
}
