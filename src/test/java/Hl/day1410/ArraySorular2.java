package Hl.day1410;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorular2 {
    public static void main(String[] args) {
        //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
        String arr[]={"Yane","jane","Lea","Tom","Hans","Leni"};
        System.out.println(Arrays.toString(arr));

        for (String w:arr
             ) {
            System.out.print(w+" ");
            if (w.equals("Tom")){break;}



        }System.out.println();

        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        String arr1[]={"Yane","jane","Lea","Tom","Hans","Leni"};
        System.out.println(Arrays.toString(arr1));

        for (String w:arr
        ) {

            if (w.equals("Tom")||w.equals("Lea")){continue;}System.out.print(w+" ");}
        System.out.println();

        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kac isim gireceginizi giriniz...");
        int osy=scan.nextInt();
        String names[]=new String[osy];
        System.out.println("Girisi sonlandirmak icin Q harfine basiniz ");
        for (int i=1 ; i<=osy;i++){
            System.out.println("Lütfen "+i+" ismi giriniz");
            String stdNames=scan.next();
            if (stdNames.equalsIgnoreCase("Q")){break;}
            names[i-1]=stdNames;
        }
        System.out.println(Arrays.toString(names));




    }
}
