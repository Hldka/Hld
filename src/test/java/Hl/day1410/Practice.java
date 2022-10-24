package Hl.day1410;

import java.util.Scanner;
import java.util.StringJoiner;

public class Practice {
    public static void main(String[] args) {
        /*
        Interview Question
        Kullanicidan !00'den kücük bir tamsayi istayin.1'den baslayarak girilen sayiya kadar tüm sayilari yazdirin.
        Ancak;
        -Sayi 3'uj kati ise sayi yerine "java"yazdirin
        -
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz: ");
        String sepet="";
        String str =scan.nextLine();
        for ( int i=str.length()-1;i> -1;i--){char ch=str.charAt(i);
            sepet=sepet+ch;
        }
        System.out.print(sepet);

    }
}
