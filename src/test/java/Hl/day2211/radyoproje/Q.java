package Hl.day2211.radyoproje;

import java.util.Arrays;

public class Q {
    /*
    integer olarak artan degerler seklinde verilen dizinin elemanlarinin karesini alip yine artan degerlerde ekrana yazdiran
    method'u olusturunuz
    ör: input= [-4,-1,0,3,10]
    OutPut= [0,1,9,16,100]
     */


    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        kareAl(arr);
        int[] num={-4,-1,0,3,10};
       sortedArray(num);
        System.out.println(Arrays.toString(num));

    } public  static int[] sortedArray(int [] num){
        for (int i=0;i<num.length;i++){
            num[i]=num[i]*num[i];
        }
        Arrays.sort(num);
        return num;
    }

    private static void kareAl(int[] arr) {

        int sum=1;
        for (int w:arr) {  sum=w*w;
            System.out.print(sum+" ");

        }
    }


}
