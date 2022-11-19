package Hl.day1911practicetekrar;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    /*
    Kullanicinin girdigi bir array'in en büyük elemani ile en kücük elemanin farkini bulan bir method crate ediniz
     */
    public static void main(String[] args) {
        farkinibul();

    }

    private static void farkinibul() {
        Scanner scan=new Scanner(System.in);
        System.out.println("array'in uzunlugunu giriniz: ");

        int uzunluk = scan.nextInt();
        int[] arr=new int[uzunluk];
        for (int i=0;i<uzunluk;i++){
            System.out.println("arrayin "+(i+1)+".elemani giriniz :");
            arr[i]= scan.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("Array'in ilk elemani "+arr[0]);
        System.out.println("Array'in son elemani"+arr[arr.length-1]);
        System.out.println(Arrays.toString(arr));


    }
}
