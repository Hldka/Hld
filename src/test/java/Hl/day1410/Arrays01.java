package Hl.day1410;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //note :Arrays'lerin icine sadece "primitive data type"leri yerlestiriniz
        String str[]=new String[3];
        str[0]="Java";
        str[1]="did";
        str[2]="suprise you" ;
        System.out.println(Arrays.toString(str));
        //String bir array olusturunuz tom dan önceki tüm elemanlari yazdiriniz
        Scanner scan=new Scanner(System.in);
        String str1[]={"Jane","Elli","Leni","Max","Tom","Mark","Lea"};
        for ( String w:str1) {
            System.out.print(w+" ");
            if (w.equals("Tom")){break;}
        }
        System.out.println();
String arr[]={"Jane","Elli","Leni","Max","Tom","Mark","Lea"};
        for (String w:arr) {

            if (w.equals("Tom")||w.equals("Jane")){continue;}System.out.print(w+" ");

        }
        System.out.println();

        System.out.println("Kac tane ögrenci ismi gireceksiniz ...");
        int ögs=scan.nextInt();
        String names[]= new String[ögs];
        System.out.println("Girisi sonlandirmak icin Q harfine basiniz");
        for (int  i=1;i<=ögs;i++){
            System.out.println("Lütfen "+i+" Ögrenci ilk ismini giriniz");
            String stdName=scan.next();

           //names[i-1]=scan.next();
            if (stdName.equalsIgnoreCase("Q")){break;}

            names[i-1]=stdName;



        }
        System.out.println(Arrays.toString(names));


    }
}
