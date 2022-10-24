package Hl.day2410;

import java.util.Scanner;

public class Oyundo_while {
    public static void main(String[] args) {
        // 0 ile 1000 arasinda rastgele numara tahmini yapan bir kod yazin
        // ipucu: Girdiginiu numara rastgelenumaradan kücük ise ==>daha büyük bir numara giriniz
        // Girdiginiz numara rastgeleNumaradan büyükse==>daha kücük bir numara giriniz
        // girdiginiz numara rastgeleNumaraya esitse ==> tebrikler!!!
        Scanner scan =new Scanner(System.in);


        int num =(int) (Math.random()*100+1);
        System.out.println(num);

int counter=0;
int say;
        System.out.println("Sayi oyunumuza hos geldiniz ... 4 hakkiniz var");
        do {
            if (counter==4){
                System.out.println("dörtten deneme yaptiniz...oyun bitti");break;
            }

            System.out.println("Lütfen bir sayi giriniz... ");
             say = scan.nextInt();
             if (num==say){
                 System.out.println("tebrikler kazandiniz!!");
             } else if (num<say) { System.out.println("lütfen daha kücük  bir numara giriniz");}

             else   {
            System.out.println("Lütfen daha büyük bir numara giriniz");

        }
counter++;
            System.out.println(4-counter+" hakkiniz kaldi");

         }while  (num!=say);






    }
}
