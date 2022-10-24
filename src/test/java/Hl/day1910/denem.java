package Hl.day1910;

import java.util.ArrayList;
import java.util.List;

public class denem {
    public static void main(String[] args) {
//1) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
        List<Integer>myList=new ArrayList<>();
        myList.add(21);
        myList.add(43);
        myList.add(45);
        myList.add(65);
        myList.add(65);
        myList.add(46);
        myList.add(64);
        int sum=0;
        for (Integer w:myList   ) {sum=sum+w;
        }
        System.out.println(sum);
        //2) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
        List<Integer>myList1=new ArrayList<>();
        myList1.add(21);
        myList1.add(43);
        myList1.add(45);
        myList1.add(21);
        myList1.add(43);
        myList1.add(45);
        myList1.add(65);
        myList1.add(65);
        myList1.add(43);
        myList1.add(45);
        myList1.add(65);
        myList1.add(65);
        for (Integer w:myList1
             ) { if (w==13){break;}
            sum=sum+w;
        }
        System.out.println(sum);
        //3) Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
        int tplm=1;
        for (Integer w:myList
             ) { if (w%2==0){tplm=tplm*w;}

        }
        System.out.println(tplm);
       // 5) Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz. Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43num=12;








    }
}
