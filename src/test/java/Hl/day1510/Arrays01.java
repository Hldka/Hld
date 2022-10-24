package Hl.day1510;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int arr[]={12,31, 43,14};
        int sayi=43;
        Arrays.sort(arr);
        int idx1= Arrays.binarySearch(arr,sayi);
        System.out.println(idx1);

        //Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.

int num[]={-3,-5,-2,0,18,34,68};
Arrays.sort(num);//[-5, -3, -2, 0, 18, 34, 68]

int maxNegative=num[0];
int minPositive=num[arr.length-1];
        System.out.println(Arrays.toString(num));
        for (int w:num ) {

            if (w<0){maxNegative=Math.max(maxNegative,w);
            }  if (w>0) {minPositive=Math.min(minPositive,w);}



        }
        System.out.println(minPositive);

    }
}
