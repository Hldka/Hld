package Hl.day1510;

import java.util.ArrayList;

import java.util.List;

public class ArrayLIst2 {
    public static void main(String[] args) {

    /*
        ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.

        Array ile ArrayList'in farki nedir?
            1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
              Array'ler eleman sayisinda "fixed" dirler.
              ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
            2)Array'lerin icine "primitive" ve "reference" lar konabilir.
              ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
            3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
            Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
                  eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin

     */



            //ArrayList nasil olusturulur?

            //1.Yol:
        ArrayList<Integer> yas=new ArrayList<Integer>();
            //2.Yol:
        ArrayList<Integer> boy=new ArrayList<>();
            //3.Yol:
        List<Integer> rakam =new ArrayList<>();

            //ArrayList'ler nasil yazdirilir?
        System.out.println(yas);


            //ArrayList'lere nasil eleman eklenir?

        yas.add(24);
        yas.add(38);
        yas.add(32);
        yas.add(30);
        yas.add(27);
        yas.add(34);
        System.out.println(yas);
            //add() her zaman elemani en sona ekler. (insertion order)
        yas.add(0,30);
        System.out.println(yas);
        List<Integer>price=new ArrayList<>();
        price.add(34);
        price.add(01);
        yas.addAll(price);
        System.out.println(yas);
        yas.addAll(2,price);
        System.out.println(yas);



            //ArrayList'lerin eleman sayisi nasil bulunur?
        System.out.println(yas.size());


            //ArrayList'lerde herhangi bir eleman nasil secilir?
        int els=yas.get(4);
        System.out.println(yas.get(4));
            //get() methodu istenen bir index'teki elemani verir



            //ArrayList'in bos olup olmadigini nasil anlariz?

        System.out.println(yas.isEmpty());
        System.out.println(rakam.isEmpty());
            //ArrayList'de bir eleman nasil degistirilir?
        yas.set(0,200);
        System.out.println(yas);


            //Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz
        for (int w:yas ) {if (w%2!=0){yas.set(yas.indexOf(w),(w+11));
        }

        }
        System.out.println(yas);

            //[21, 50, 23, 200, 18, 20, 23, 185]

            //remove() method'unu icine tamsayi koyarsaniz Java onu index olarak kabul eder

            //Example 2: ArrayList'den 34 elemaninin ilk gorunumunu siliniz
    Integer sayi=34;
    yas.remove(sayi);
        System.out.println(yas);
            //Note 1: Tum tamsayilar Java icin aksi soylenmedikce primitive'dir, yani "int" dir.
            //Note 2: "primitive" ler ArrayList'lerin elemani olamazlar.
            //Note 3: "primitive" i "Wrapper Class" a cevirirseniz, non-primitive olur ve non-primitive ler ArrayList'lerin elemani olur, index olamaz


    }
}
