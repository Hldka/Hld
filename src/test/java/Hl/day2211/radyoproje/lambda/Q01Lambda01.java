package Hl.day2211.radyoproje.lambda;



import Hl.day1611.bankamatik.Methodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Q01Lambda01 {
    static ArrayList<String> names=new ArrayList<>(Arrays.asList("Tülay","Zekeriya","Hasan","Ismail","Osman","Fatma ","Mevlid","Ersin"));
static List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,-54,9,35,35,34));

    /*
    Input olarak verilen Listteki isimlerden icinde "a" harfi bulunanlari siler bir code create ediniz
    Input= list1={"Ali","Veli","Ayse","Fatma","Omer"}
    output={"Veli","Omer"}
     */
    public static void  aHarfiSildirenGerisiniYazdiran(ArrayList<String> names){

        //1.yol
        //System.out.println(names.stream()//akisa alindi
          //      .map(m -> m.toLowerCase())// hepsi kücük harfe cevrildi
            //    .filter(m -> !m.contains("a"))// a harfi olmayanlar filtrelendi
              //  .collect(Collectors.toList()));//liste'e cevrildi

        //2.yol
       // System.out.println(names.stream()
         //       .filter(m->!m.contains("a")&& !m.contains("A"))
           //     .collect(Collectors.toList()));

//3.yol
        names.removeIf(t-> t.contains("a") || t.contains("A"));
        System.out.println(names);


        // en büyük elemani bulunuz...

    }public static void maxElemanBul(List<Integer> sayi){
        Optional<Integer> maxSayi= sayi.stream().reduce(Math::max);
        System.out.println("maxSayi="+maxSayi);
        //2.yol
        System.out.println("sayi.stream().reduce(Integer::max) = " + sayi.stream().reduce(Integer::max));
    }
    /*
    Task: Listeki tüm elemanlarin toplamini yazdiriniz...
     */

    public static void tümElemanlriYazdir(List<Integer> numbers){
        System.out.println(numbers.stream().reduce(0, (a, b) -> a + b));

        System.out.println("numbers.stream().reduce(Integer::sum).get() = " + numbers.stream().reduce(Integer::sum).get());
    } public static void tümElemanlriCarp(List<Integer> numbers){
        System.out.println(numbers.stream().filter(Methodlarim::ciftElemaniBul).reduce(1,(a,b)->a*b));

       System.out.println("numbers.stream().reduce(Integer::sum).get() = " + numbers.stream()
                .filter(Methodlarim::ciftElemaniBul).reduce(Math::multiplyExact));
    }
}
