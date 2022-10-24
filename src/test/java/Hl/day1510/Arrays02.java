package Hl.day1510;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

      String str ="Java ögrenince para kazanmak kolay,ögrenmeyince ne kolay ki";
      String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));
        int counter=0;
        for (String w:harfler){

            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }

        }System.out.println(counter);


    }
}
