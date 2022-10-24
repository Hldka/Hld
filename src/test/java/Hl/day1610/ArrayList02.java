package Hl.day1610;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {

        //Example 1: Verilen bir listteki elemanlari tekrarsiz olarak yaziniz
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer>a=new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        System.out.println(a);
        List<Integer>neu=new ArrayList<>();
        for (Integer w:a  ) {if (!neu.contains(w)){neu.add(w);
        }

        }
        System.out.println(neu);

        //Example 2: Kullanicidan bir harf aliniz, harf sizdeki List'in icinde varsa o harfi "Bulundu" ya ceviriniz yoksa o harfi List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner scan=new Scanner(System.in);
        List<String> neuf=new ArrayList<>();
        neuf.add("A");
        neuf.add("K");
        neuf.add("R");
        neuf.add("S");
        System.out.println(neuf);
        String bu="";
        System.out.println("Sistemden cikmak icin Q tusuna basiniz");

        do {


        System.out.println("Bir harf giriniz");
         bu= scan.next().substring(0,1);

        if (neuf.contains(bu)){neuf.set(neuf.indexOf(bu),"Bulundu");}else if (!bu.equalsIgnoreCase("Q")){neuf.add(bu);}
        }while (!bu.equalsIgnoreCase("Q"));
        System.out.println(neuf);
    }
}
