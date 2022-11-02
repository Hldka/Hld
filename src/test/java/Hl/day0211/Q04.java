package Hl.day0211;

import java.util.Arrays;
import java.util.logging.SocketHandler;

public class Q04 {//4) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz. Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
    //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
    public static void main(String[] args) {
        int []arr={12,5,8};
        Arrays.sort(arr);

        int []arr1={12,5,8,13};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length/2]);
        System.out.println((arr1[arr1.length/2]+ arr1[arr1.length/2-1])/2);
        System.out.println(arr1[arr1.length/2-1]);
        System.out.println((arr1[arr1.length/2]));


    }
}
