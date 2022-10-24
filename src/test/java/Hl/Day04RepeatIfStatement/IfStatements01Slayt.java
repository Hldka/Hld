package Hl.Day04RepeatIfStatement;

import java.util.Scanner;

public class IfStatements01Slayt {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
// Example 1:Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin.

        System.out.println("Tam Sayi Yaziniz...");
        int a= input.nextInt();
        if (a%2==0){
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayi");
        }
//Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gün isimlerini yazdirin

        System.out.println("Gün isimlerini yaziniz");
        char ah=input.next().toUpperCase().charAt(0);


        if (ah=='P'){
            System.out.println("Pazar,Pazartesi ve Persembe");
        }
        if(ah=='S'){
            System.out.println("Sali");
        }
        if (ah=='C'){
            System.out.println("Cuma ,Cumartesi");
        }//Kullanicidan gün ismini alin ve hafta ici veya hafta sonu oldugunu yazdirin
        System.out.println("Haftanin Günlerini yaziniz...");

        

    }
}
