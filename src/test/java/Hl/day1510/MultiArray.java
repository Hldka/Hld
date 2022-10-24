package Hl.day1510;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int arr[][]={{3,-4},{6,18},{-7,0}};
        int barr[][]=new int[3][2];
         barr[0][0]=3;
         barr[0][1]=-4;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(barr));
        System.out.println(Arrays.toString(arr[0]));
        int sum=0;
        for (int[] w:arr) {
            sum=sum+w.length;

        }
        System.out.println(sum);
        String brra[][]={{"learn","Java","it"},{"it","easy"}};
        for (String[] w:brra
             ) { for (String k:w){
                 if (k.contains("a")){
                     System.out.println(k+" ");
                 }
        }

        }

    }
}
