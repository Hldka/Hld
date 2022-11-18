package Hl.day1811Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Map2 {
    public static void main(String[] args) {
        //size verilen bir kelimede kullanilan harflerin kacar kere kullanildigini gösteren kodu yaziniz
        // abbcaa==> a=3 ,b=2, c=1

        String kelime ="abbcaa";
        HashMap<String,Integer> gorunum =new HashMap<>();
        String []harfler= kelime.split("");
        System.out.println(Arrays.toString(harfler));


        for (String w:harfler
             ) { Integer gorunumsayisi=gorunum.get(w);

            if (gorunumsayisi==null){gorunum.put(w,1);}else gorunum.put(w,gorunumsayisi+1);

        }
        System.out.println(gorunum);
    }
}
