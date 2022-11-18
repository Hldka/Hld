package Hl.day1811Maps.practice;

import Hl.day1310.Array;

import java.util.Arrays;

public class Q04_DowhileLoop {
    public static void main(String[] args) {
        /*
        given an int array and find the squares of the elements
        example :{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
         */
        int[] arr= {2,6,4,5,8,9};

        int crpm=1;
        for (int i=0;i<arr.length;i++){

           arr[i]*=arr[i];

        }
        System.out.println(Arrays.toString(arr));



    }
}
