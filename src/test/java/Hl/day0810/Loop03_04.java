package Hl.day0810;

import java.util.Scanner;

public class Loop03_04 {
    public static void main(String[] args) {
        //Example 1: Bir String'deki "m" karakteri haric tum karakterleri yazdiriniz
        //Andromeda ==> Androeda

//Example 1: Sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz

        Scanner input = new Scanner(System.in);
/*
        System.out.println("Lütfen ilk sayıyı giriniz...");

        double sayi1 = input.nextDouble();

        System.out.println("Lütfen ikinci sayıyı giriniz...");

        double sayi2 = input.nextDouble();

        System.out.println(sayi1+sayi2);
*/


//6) kullanicidan 100 den kucuk bir tam sayi isteyin. 1 den baslayarak
// girilen sayi kadar tum sayilari yazdirin,
// ancak
// -sayi3 un kati sie "Java  " yazdirin.
// - sayi 5 in kati ise "Guzeldir" yazdirin.
// -Sayi 3un ve 5in kati ise "Java Guzeldir" yazdirin

        System.out.println("Lutfen 100 den kucuk bir tamsayi giriniz");
        byte s5= input.nextByte();
        double s6=0;

        for (int i=1; i<s5+1; i++){
         s6=s6+i;
         if(s6%3==0){ if(s6%3==0&&s6%5==0){
             System.out.println("Java güzeldir");
         }
         }else if (s6%5==0){
             System.out.println("Güzeldir");}

            System.out.print(""+s6);

        }

//( i3%===0?:(i5%==0?"java Guzeldir":"java"):i%5==0?"Güzel":burasi bos kaliyor onun icin calismaz)







    }
}
