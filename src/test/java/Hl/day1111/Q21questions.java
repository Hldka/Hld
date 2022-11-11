package Hl.day1111;

public class Q21questions {
    /*
    Mükemmel bir sayı,tam bölenlerinin toplamı tam sayıya eşit olan sayıdır. Örneğin, 28'in tam
bölenlerinin toplamı 1 + 2 + 4 + 7 + 14 = 28’dir, bu da 28'in mükemmel bir sayı olduğu anlamına gelir.
Tam bölenlerinin toplamı n’den küçükse n sayısına eksik, bu toplam n’den büyükse zengin olarak adlandırılır.
12 en küçük zengin sayı, 1 + 2 + 3 + 4 + 6 = 16 olduğundan, iki zengin sayının toplamı olarak
yazılabilecek en küçük sayı 24'tür.
Matematiksel analizle, 28123'ten büyük tüm tam sayıların, iki zengin sayının toplamı olarak
 yazılabileceği gösterilebilir. Ancak, iki bol sayının toplamı olarak ifade edilemeyen en büyük sayının
 bu sınırdan küçük olduğu bilinmesine rağmen, bu üst sınır analiz ile daha fazla düşürülemez.
İki zengin sayının toplamı olarak yazılamayan tüm pozitif tam sayıların toplamını bulun.

     */
    public static void main(String[] args) {
        String str="hello";
        System.out.println(str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2));

        int y=28;
        int sum=0;

       for (int i=1;i<y;i++){
           if (y%i==0){ sum=sum+i;
               System.out.print(i+" ");
           }else continue;
       }
        System.out.println(sum);



    }

}
