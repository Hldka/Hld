package Hl.day2811Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>(Arrays.asList("Tülay","Zekeriya","Hasan","Ismail","Osman","Fatih","Ersin","Mevlit"));
        List<String> yemek =new ArrayList<>(Arrays.asList("Küsleme","adana","trilice","havucdilim","buryan","kokorec","kuzutandir","guvec"));
        List<Integer> numbers =new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,-54,9,35,35,34));

        tekSayyilarinBüyüktenKücuge(numbers);
        System.out.println("\n*************");
        System.out.println(names);
        System.out.println("\n*************");
        sinHarfeGoreTersSira(yemek);
        System.out.println("\n*************");
        karaktersayiYedidenBüyük(yemek);
    }//tek sayilarin karesini büyükten kücüge dogru siralayiniz
    public static void tekSayyilarinBüyüktenKücuge(List<Integer> numbers){
        numbers.stream().filter(t->t%2!=0).map(t->t*t).sorted().forEach(t-> System.out.print(t+" "));
    }// List elemanlrin son harfine göre ters sirali print ediniz
    public static void sinHarfeGoreTersSira(List<String> names){
        names.
                stream().
                sorted(Comparator.
                        comparing(t-> t.toString()
                                .charAt(t.toString().length()-1)).reversed()).forEach(Methodlarim::yazdir);

    }//List elemanrin karakter sayisinin 7 ve 7 den az olma durumunu kontrol ediniz
    public static void karaktersayiYedidenBüyük(List<String> yemek){
        boolean kontrol=yemek.stream().allMatch(t->t.length()<=7);
        if (kontrol){
            System.out.println("List elemanlari 7 veya daha az harfden olusmus");
        }else System.out.println("bazi elemanlar 7 den büyük");
        System.out.println(yemek.stream().allMatch(t -> t.length() <= 7) ? "List elemanlari 7 ve daha az harften olusmus" : "bazi elemanlar 7 den büyük");
    }

    }

