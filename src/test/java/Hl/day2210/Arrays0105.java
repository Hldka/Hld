package Hl.day2210;

import java.util.Arrays;

public class Arrays0105 {
    public static void main(String[] args) {
        /*
        1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
         Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
         (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10

         */


        int []arr= new int[3];
        arr[0]=12;
        arr[1]=5;
        arr[2]=8;
        int barr[] ={12,5,8,13};
        System.out.println(Arrays.toString(barr));
        Arrays.sort(barr);
        System.out.println(Arrays.toString(barr));
        if (barr.length%2==1){
         int ortanca = barr.length/2;
            System.out.println(barr[ortanca]);
        } else {
            int ort1 = barr.length / 2;
            int ort2 = barr.length / 2 - 1;
            System.out.println((barr[ort2] + barr[ort1]) / 2);

        }
//2) String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
// Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        String [] str ={"Kemal","Jonathan","Mark","Angie","Veli"};
        int minstr=Integer.MAX_VALUE;
        
        System.out.println(Arrays.toString(str));
        for (String w:str) { minstr=Math.min(minstr,w.length());
if (minstr==w.length()){
    System.out.println(w);
}

        } System.out.println(minstr);

    }
}
