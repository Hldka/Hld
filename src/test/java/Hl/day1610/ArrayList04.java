package Hl.day1610;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        //Example 1:Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz
        //              [12, 19, 15, 30, 21]  ==>  19 ve 21
        List<Integer>a=new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        List<Integer>fark=new ArrayList<>();

        int min=Integer.MAX_VALUE;
        int k=0;
        int a1=0;
        int a2=0;
        for (int i=1;i<a.size();i++){ min=Math.min(min,a.get(i)-a.get(i-1));}
        for (int i=1;i<a.size();i++){
            if (min==a.get(i) - a.get(i-1)){

                a1 = a.get(i);
                a2 = a.get(i-1);
                System.out.println(a1+","+a2);

        }}







    }
}
