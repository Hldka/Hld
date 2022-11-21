package Hl.day2111okulproje.InterviewQuestion;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
        armstrog(sayi);

        //amstrog sayi

    }

    private static void armstrog(int sayi) {
        int sayiKuplerToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=0;
while (sayi>0){
    basamaktakiSayi=sayi%10;
    sayiKuplerToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
    sayi=sayi/10;
}if (girilenSayi==sayiKuplerToplami){
            System.out.println("girilenSayi armstrong sayidir="+girilenSayi);
        }else System.out.println("girilen sayi armstrong degildir"+girilenSayi);
    }
}
