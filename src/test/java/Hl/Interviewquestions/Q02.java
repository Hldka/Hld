package Hl.Interviewquestions;

import java.util.Scanner;

public class Q02 {
    /*
    Kullanicidan alinan bir Srringin ilk ve son harfini yine kullanicidan alinan sayi kadar return eden metod yaziniz
    ornek:input      output
          elma 2      eaea
          army  3      ayayay
     */
    public static void main(String[] args) {

        //1. yol
        Scanner scan=new Scanner(System.in);
        System.out.println(" können Sie eine String eingeben");
        String str=scan.nextLine();
        String str2=str.substring(0,1)+str.substring(str.length()-1);
        System.out.println(str2);
        System.out.println("Bitte können Sie eien zahl ein geben");
        int zahl= scan.nextInt();
        for (int i=1;i<=zahl;i++){
            System.out.print(str2);
        }
    }
}
