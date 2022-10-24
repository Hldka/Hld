package Hl.day1610;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Remoove und Removall

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
names.remove("Thomas");
names.remove("Can");
        System.out.println(names);

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

names.removeAll(cities);
        System.out.println(names);

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");
//containsAll
        System.out.println (names.containsAll(myNames));

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        //Example 1: "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz
        a.remove(0);
        System.out.println(a);

        //Example 2: "a" listinde "Shoes" elemaninin tum gorunumlerini siliniz
        List<String>sil=new ArrayList<>();
        sil.add("Shoes");
        a.removeAll(sil);
        System.out.println(a);



        //Example 3: Bir tane salary listi olusturun, eger salary 10000'den az ise %20 10000 ve 10000'den cok ise %10 zam yapiniz.
        List<Double>salary=new ArrayList<>();
        salary.add(12345.0);
        salary.add(8674.5);
        salary.add(15000.75);
        salary.add(9500.0);
        salary.add(20500.0);
        System.out.println(salary);


        //[12345.0, 8674.5, 15000.75, 9500.0, 20500.0]

        for (Double w:salary ) {if (w<10000){
            salary.set(salary.indexOf(w),w*1.2);
        } else {salary.set(salary.indexOf(w),w*1.1);

        }

        }
        System.out.println(salary);

        //Example 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz
        //Note: Iki ArrayList'in esit olabilmesi icin,elemanlar esit olmali ve ayni elemanlar ayni index'te olmali


        //1.Way:
        List<Character>m=new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character>n=new ArrayList<>();
        n.add('x');
        n.add('z');
        n.add('z');

        //!.way
        int counter=0;
        if (m.size() != n.size()) {
            System.out.println("Listler esit degil");counter++;

        }
        for (int i=0;i<m.size();i++){
             if (m.get(i)!=n.get(i)){
                System.out.println("Listler esit degil");
                counter++;
            }
            }if (counter==0){
            System.out.println("Listler esit");


            }
        //.Yol
        boolean esit=m.equals(n);
        if (esit){
            System.out.println("Listler esit");
        }else {
            System.out.println("Listler esit degil");
        }



        }
        }


