package Hl.day0411;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q003 {
    //3) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
    public static void main(String[] args) {
        List<Integer>tm=new ArrayList<>();
        tm.add(12);
        tm.add(15);
        tm.add(16);
        tm.add(13);
        tm.add(18);
        Collections.sort(tm);
        System.out.println(tm);
        int sum=0;
        for (Integer w:tm) {
            if (w==13){break;}
            sum=sum+w;

        }
        System.out.println(sum);
    }
}
