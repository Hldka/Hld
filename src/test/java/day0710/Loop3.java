package day0710;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        /*
        3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
         Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz...");
        String s=scan.nextLine();
        String s5="";
for (int i=0;i<s.length();i++){
       String nw=s.substring(s.length()-1-i,s.length()-i);
        s5=s5+nw;


}
        System.out.println(s5);
        if (s5.equalsIgnoreCase(s)) {
            System.out.println("Palindrom");
        }
        else {System.out.println("Palindrom degildir");}













        }

    }

