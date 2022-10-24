package Hl.day0610;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

/*
2) Ayın numarasını girdiğinizde ayın adını yazdırmak için bir switch ifadesi kullanınız. Örneğin;
kullanıcı 1 girerse kodunuz "Ocak" yazmalıdır,
kullanıcı 2 girerse kodunuz "Şubat" yazmalıdır vb.
Kullanıcı geçersiz ay numarası girerse kodunuz "Geçersiz numara" yazmalıdır.
 */

       Scanner scan= new Scanner(System.in);
       int ayn=scan.nextInt();
       int ayn1=ayn%12;
               String ay;


        switch (ayn1 ) {
          //  case 0: ay="Aralik"; break;
            case 1: ay = "Ocak"; break;
            case 2: ay = "Subat"; break;
            case 3: ay = "Mart"; break;
            case 4: ay = "Nisan"; break;
            case 5: ay = "Mayis"; break;
            case 6: ay = "Haziran"; break;
            case 7: ay= "Temmuz"; break;
            case 8: ay= "Agustos"; break;
            case 9: ay= "Eylul"; break;
            case 10: ay = "Ekim"; break;
            case 11: ay= "Kasim"; break;
            case 12&0: ay = "Aralik"; break;
            default: ay= " Gecersiz numara "; break;
        } System.out.println(ay);

    }
}
