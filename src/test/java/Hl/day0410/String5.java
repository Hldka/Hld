package Hl.day0410;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {

/*
1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir ismini,
baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda yazdırınız.
Örnek: mIAMI - Miami miami - Miami MIAMI - Miami
mIaMi - Miami vb.
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("Sehir ismi giriniz" );

        String sehirIsim=scan.nextLine();

        String ySehirIsim=sehirIsim.trim().toLowerCase();
        ySehirIsim=ySehirIsim.substring(0,1).toUpperCase()+ySehirIsim.substring(1);
        System.out.println(ySehirIsim);


                String stringToTrim = "   This is just an example  ";



                stringToTrim = stringToTrim.trim();
                System.out.println("After trimming +++" + stringToTrim + "+++");

     //  Before trimming +++   This is just an example  +++
       //         After trimming +++This is just an example+++

    }
}
