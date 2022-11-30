package Hl.day3011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class codingbat {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>(Arrays.asList("ayse","fatma","hayriye","yasi","gelse","elliye"));
        lElSonHrfYzdr(l);
    }

    public boolean hasTeen(int a, int b, int c) {
return (a>=13 && a<=19)|| (b>=13 && b<=19)||(c>=13 && c<=19);

    }////S10: List elemanlarını son harfe göre sıralayıp, son 3 elemanı yazdırın
    public static void lElSonHrfYzdr(List<String> l){
        System.out.println(l.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).skip(l.size()-3).collect(Collectors.toList()));
    }

}
