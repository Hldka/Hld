package Hl.day0211;

import java.util.ArrayList;

public class Q05List {//5) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.

    public static void main(String[] args) {
        ArrayList<Integer>tams=new ArrayList<>();
        tams.add(23);
        tams.add(4);
        tams.add(76);
        tams.add(87);
        tams.add(54);
        int count=0;
        for (Integer w:tams) {
count=w+count;
        }
        System.out.println(count);
    }
}
