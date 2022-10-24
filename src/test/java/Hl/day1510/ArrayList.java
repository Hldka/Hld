package Hl.day1510;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {





        /*
            Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
            Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for-each-loop" calismaz, "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz
         */

                //Bir tane integer multidimensional array olusturunuz
        int [][] arr={{25,17},{6},{6,8,90},{-5,-7}};

                //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.
        int sum=0;
        for (int[] w:arr ) {
            for (int k:w ) {sum=sum+k;

            }

        }
        System.out.println(sum);


        System.out.println();


                //Bir multidimensional array'i normal array'e ceviren kodu yaziniz

        int sum1=0;
        for (int [] w:arr ) {sum1=sum1+ w.length;

        }
        System.out.println(sum1);
        int [] barr=new int[sum1];
        int idx=0;
        for (int [] w:arr ) {
            for (int k:w   ) { barr[idx]=k;
                idx++;

            }


        }
        System.out.println(Arrays.toString(barr));


                //{ {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}
        //Bir multidimensional array deki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz
        int [][] arra={{25,17},{6},{6,8,90},{-5,-7}};

   int min=arra[0][0];
   int max=arra[2][0];
        for (int [] w:arra) {
            for (int k:w ) {
                max= Math.max(max,k);
                min=Math.min(min,k);

            }

        }
        System.out.println( "Max deger: "+max+ " Min degeri : "+min);
        System.out.println(max+min);


            }
        }




