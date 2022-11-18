package Hl.day1811Maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {/*
        1)TreeMap'ler entrySet'leri key'lere göre "nature order"da siralar
        2)TreeMap 'ler en yavas map'lerdir.
        3)TreeMap'lar thread-safe ve sycronized degildir.

         */
    public static void main(String[] args) {


        TreeMap<String,Double> salaries=new TreeMap<>();
        salaries.put("Tom Hanks",3000.0);
        salaries.put("Mary Star",1000.00);
        salaries.put("Jimmy Jones",5000.00);
        salaries.put("Kevin Bridgeman",6000.00);
        System.out.println(salaries);//  {Jimmy Jones=5000.0, Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}
        SortedMap <String,Double> map1= salaries.tailMap("Kevin Bridgeman");
        System.out.println(map1);
        Map.Entry<String,Double> map7=salaries.ceilingEntry("Mary Star");
        System.out.println(map7);
        Map.Entry<String,Double> map8=salaries.ceilingEntry("Paris Hilton");
        System.out.println(map8);

    }
}
