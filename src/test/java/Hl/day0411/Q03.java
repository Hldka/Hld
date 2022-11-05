package Hl.day0411;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q03 {
    //2) Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.
    public static void main(String[] args) {
        List<Integer>mylist=new ArrayList<>();
        mylist.add(60);
        mylist.add(56);
        mylist.add(65);
        mylist.add(32);
        mylist.add(34);
        Set<Integer> myset=new HashSet<>();
        myset.add(10);
        myset.add(38);
        myset.add(42);
        myset.add(54);
        myset.add(65);
        myset.retainAll(mylist);
        System.out.println(myset);
    }
}
