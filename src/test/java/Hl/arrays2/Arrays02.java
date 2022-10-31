package Hl.arrays2;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};

        for (int w:array
             ) {
            System.out.print(w+"");

        }
// dizideki  kucuk  element ve buyuk  elemen toplami yaziniz
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println( array[0]+array[array.length-1]);
    }


}
