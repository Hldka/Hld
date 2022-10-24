package Hl.day1410;

import java.util.Arrays;

public class ArraysSorular01 {
    public static void main(String[] args) {

        //Array nasil olusturulur?
        String str1[]=new String[5];
       int arr[]={0,1,3,45,56,67};
        int arr1[]=new int[5];

        String str[]={"Java","Yag","Kar","hava","Kis"};


        //Array'lere elemanlar nasil eklenir?
        str1[0]="Java";
        str1[1]="Jem";
        str1[2]="Jet";
        str1[3]="Jane";
        str1[4]="Janjan";
         arr1 [0]=2;
         arr1[1]=34;
         arr1[2]=34;
         arr1[3]=32;
         arr1[4]=4;


        //Array'deki herhangi bir elemani nasil yazdirabiliriz?
        System.out.println(str1[1]);
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        //Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz

        int arra[]={0,1,3,45,56,67};
        Arrays.sort(arra);
        int ilk=arr[0];
        int son=arr[arr.length-1];
        System.out.println(ilk+son);

        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
        int stdAges[]={12,10,13,11,12};
        int snc=0;
        for (int w:stdAges) {
            snc=w+snc;

        }System.out.print(snc);
        System.out.println();



        //Example 3: String bir array olusturunuz
        //           Bu Array'e 5 tane isim yerlestiriniz
        //           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz
        String stdName[]=new String[5];
       stdName [0]="Ali";
        stdName[1]="Tom";
        stdName[2]="Veli";
        stdName[3]="Kemal";
        stdName[4]="Cem";
        int karaktersayisitop=0;

        for (String w:stdName) {
            karaktersayisitop = karaktersayisitop+ w.length();

        } System.out.print(karaktersayisitop);

     System.out.println();

        //Example 4: Char bir array olusturunuz
        //           Bu array'e 5 eleman ekleyiniz
        //           Bu array;deki sadece buyk harfleri ekrana yazdiriniz
     char dr[]=new char[5];
     dr[0]='a';
     dr[1]='B';
     dr[2]='d';
     dr[3]='H';
     dr[4]='l';
     for (char w:dr
          ) { if (w>='A'&& w<='Z'){
      System.out.print(w);
     }

     }
    }
}
