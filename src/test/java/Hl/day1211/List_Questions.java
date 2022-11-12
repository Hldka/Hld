package Hl.day1211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_Questions {
    //Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
    public static void main(String[] args) {

        List<Integer> sayi=new ArrayList<>(Arrays.asList(3,5,78,89,65,43,34));
        sayi.add(3,13);
        System.out.println(sayi);

        int count=0;

        for (Integer w:sayi) { count=count+w;

        }
        System.out.println(count);
int sum=0;
for (Integer w:sayi){

    if (w==13)break;
    sum=w+sum;
}
        System.out.println(sum);

    }
}
