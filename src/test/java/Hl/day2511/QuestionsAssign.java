package Hl.day2511;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionsAssign {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir list olusturunuz ve Cikmak istediginiz de Q tiklayiniz ");

        List<Integer> sayi=new ArrayList<>();
        int counter =0;
        while (counter <5){
            System.out.println("Lütfen bir list elemani giriniz...");
            sayi.add(scan.nextInt());

            counter++;
        }
        System.out.println(sayi);

        System.out.println("listinizi güncellemek istermisiniz  E veya H");
        char ch=scan.next().toLowerCase().charAt(0);
        if (ch=='e'){
            System.out.println("hangi elemani silemek istersiniz  "+sayi);
            sayi.remove(scan.nextInt());
            System.out.println(" hangi elemani ekelmek istersiniz ");
            sayi.add(scan.nextInt());
            System.out.println(sayi);
        } else if (ch=='h') {
            System.out.println("iyi günler");

        }else System.out.println("yanlis giris yaptiniz....");
    }
}
