package Hl.day2810;

import java.sql.Array;
import java.util.Arrays;

public class practice_Q1_Arrays {


      //Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    // input : 1,2,-3,4,-5,-6
    //output :-1,-2,3,-4,5,6
      public static void main(String[] args) {
          int [] arr={1,2,-3,4,-5,-6};
          int []barr=new int[arr.length];
int idx=0;
          for (int w:arr ) { barr[idx]=w*(-1);
idx++;
          }
          System.out.println(Arrays.toString(barr));

      }
}
