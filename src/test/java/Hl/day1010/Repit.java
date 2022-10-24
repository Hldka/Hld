package Hl.day1010;

import java.util.Scanner;

public class Repit {
    public static void main(String[] args) {

        /*
        Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

e.g:

char ch1= 'a' ;

String name =“John came late"

Expected Output: Number of a = 2
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir karakter bir de isim giriniz");
        char c=scan.next().charAt(0);
        String s= scan.nextLine();
        String s1=s.trim();
        int sayac=0;
       for (int i=0; i<s.length();i++){
        char c2=s1.charAt(i);
           if(c2==c){
               System.out.println(s1.length()-s1.replaceAll("c2","").length());


           } sayac=sayac+i;

       }
        System.out.println(sayac);




    }
}
