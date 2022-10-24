package Hl.day1110;

import java.util.Scanner;

public class Loop14 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" lütfen bir kelime giriniz...");
        String s=scan.nextLine();
        String snc="";
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='m'){break;}
            snc=snc+c;
        }
        System.out.println(snc);


// 17) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
        System.out.println("Bir tamsayi giriniz...");
        int num=scan.nextInt();
        num=Math.abs(num);
        int bos=0;
        for (int i=num ;i>0;i=i/10){
            bos=bos+i%10;
        }
        System.out.println(bos);

//20
        String lk="";
        for (int i=0;i<6;i++){
            for (int k=0;k<i;i--){ lk=lk+"*";
               }
        }System.out.println(lk);


    }
}
