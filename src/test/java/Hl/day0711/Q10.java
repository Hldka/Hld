package Hl.day0711;

import java.util.Scanner;

public class Q10 {
    /*
    10)Üçgen sayıları dizisi, doğal sayıların eklenmesiyle oluşturulur.

Yani 7. üçgen sayısı 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28 olur. İlk on terim şöyle olur:

                    1, 3, 6, 10, 15, 21, 28, 36, 45, 55, …

İlk yedi üçgen sayısının çarpanlarını sıralayalım:

1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
28'in beşten fazla böleni olan ilk üçgen sayı olduğunu görebiliriz.

Beş yüzün üzerinde böleni olan ilk üçgen sayısının değeri kaçtır?
     */

        /*
        int sum = 28;
        int i = 1;
        while (i<=sum)
        {i++; if(sum%i==0)
                System.out.print(i+" ");
        }}}
         */
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Kacıncı ucgen sayisini istersiniz?");
            int kacinci=input.nextInt();
            int sum =0;
            for (int i =1;i<=kacinci;i++){
                sum = sum+i;
                System.out.print(sum+" ");
            }

            System.out.println();

            int b=1;
            while (b<=sum){
                carpan(sum,b);
                b++;
            }
        }
        public static void carpan(int a,int b){
            if (a%b==0) {
                System.out.print(a / b +" ");

        }
           }}


