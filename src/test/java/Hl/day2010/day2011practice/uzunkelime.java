package Hl.day2010.day2011practice;

import java.util.Scanner;

public class uzunkelime {
/*
Kullanicidan gelen cümleyi parametre olarak olan ve cümledeki en uzun kelimeyi return eden LongsteWord(sentence )
method'u create ediniz. */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir cümle giriniz...");
        String cumle = scan.nextLine();
        enUzunkleime(cumle);
        //ben bugün javayi cok sevdim ama cok zorlandim.

        System.out.println(enUzunkleime(cumle));

    }

    private static String enUzunkleime(String cumle) {
String arr[]=cumle.split(" ");
int max=0;
String longstword="";
    for (int i=0;i< arr.length;i++){
        if (arr[i].length()>max){
            max=arr[i].length();
            longstword=arr[i];
        }
    }return longstword;
    }
}
