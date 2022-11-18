package Hl.day1811Maps;

import java.util.Hashtable;

public class hashtable01 {
    /*
    1)hastable bir map'dir
    2)Hashtable entryset'leri herhangi bir siralamaya tabi tutmaz
    3) Hashtable, hashmap'lerden daha yavstir. cünkü hashTable'lar thread-safe ve synchhronizie'dir
    4)Hashtable'larda key null olmaz .key'i null yaparsaniz NullpointerException atar
    5)Hastable'larda value null olamaz.valuyu null yaparsaniz NullpointerException atar
    note:tostring()method'u objelri console da detylari görebilmek icin kullanilir


     */
    public static void main(String[] args) {
        Hashtable<String,Integer> countryPopulations= new Hashtable<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",83000000);
        countryPopulations.put("Turkey",80000000);
        System.out.println(countryPopulations);
       // countryPopulations.put("France",null);

        Hashtable<String,Students> myStudents=new Hashtable<>();
        myStudents.put("Math",new Students("Tom Hanks","Th@gmail",21,true));
        myStudents.put("Science",new Students("mary star","th@gmail",22,false));
        System.out.println(myStudents);
        System.out.println(myStudents);
String name= myStudents.get("Math").name;
        System.out.println(name);
    }
}
