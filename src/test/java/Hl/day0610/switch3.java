package Hl.day0610;

import java.util.Scanner;

public class switch3 {
    public static void main(String[] args) {
        /*
    5) Belirli bir yılın belirli bir
    ayındaki gün sayısını görüntülemek için bir kod yazınız.
    Örnek: 2000 yılının Şubat ayında gün sayısı 29.
    case 1,3,5,7,8,10,12 : 31 ceken aylar
    case 2 subat 29 ve 28 cekmesi
    case 4,6,9,11 30 ceken aylar
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Ay bilgilerini giriniz");
        int ay= scan.nextInt();
        System.out.println("Lütfen Yil bilgilerini giriniz");
        int yil= scan.nextInt();
        switch (ay){
            case 2:
                System.out.println(yil%100==0?(yil%400==0?29:28):(yil%4==0?29:28));
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("Gecerli bir ay giriniz");
                break;

        }







    }
}

