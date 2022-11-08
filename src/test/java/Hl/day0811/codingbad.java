package Hl.day0811;


import java.util.Scanner;

public class codingbad {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütefn 2 harfden büyük kelime giriniz...");
        String str=scan.next();

        System.out.println(str+" "+right2(str));


    }

    public static String right2(String str) {

        String a = "";
        if (str.length() > 1) {
            for (int i = str.length()-1; i > -1; i--) {
                char b=str.charAt(i);
                a = a + b;
            }
        }
        return a;
    }
}
