package Hl.day2410;

import java.util.Arrays;

public class Dera {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        System.out.println(arr1);
        System.out.println(arr1==arr2);
         System.out.println(arr1==arr1);
         System.out.println(Arrays.equals(arr1,arr2));
         System.out.println(arr1.equals(arr2));
        int arr[] = {12, 23, 12, 2, 3}; Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 5));
    }



}
