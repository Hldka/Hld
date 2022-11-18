package Hl.day1811Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class Map01 {
    // size verilen bir cümledeki her kelimenin kac kere kullanildigini gösteren kodu yaziniz
    // "I like to move it,move it."==> I=1.like=1,to=1, move=2,it=2

    public static void main(String[] args) {
        String str ="I like to move it move it.";
        // noktalam isaretlerini sil
        str=str.replaceAll("\\p{Punct}","");
        System.out.println(str);

        String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        HashMap<String,Integer> gorunum=new HashMap<>();
        for (String w:kelimeler
             ) {Integer gorunumsayisi=gorunum.get(w);

            if (gorunumsayisi==null){
                gorunum.put(w,1);
            }else {gorunum.put(w,gorunumsayisi+1);}

        }
        System.out.println(gorunum);

    }
}
