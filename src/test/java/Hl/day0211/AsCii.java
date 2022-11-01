package Hl.day0211;

import java.util.Scanner;

public class AsCii {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen karakter giriniz");
        char ch1=scan.next().charAt(0);
        char ch2=scan.next().charAt(0);
        int minch = Math.min(ch2,ch1);
        int macch=Math.max(ch1,ch2);
        for (int i=minch;i<macch;i++){
            System.out.print((char)i+"");
        }
    }
}
