package Hl.day1410;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {

 int num[]={0,2,3,0,12,0};
 int yeni[]=new int[num.length];
 int idx=0;
 for ( int i=0;i<num.length;i++){
     if (num[i]!=0){yeni[idx]=num[i];
     idx++;}
 }
        System.out.println(Arrays.toString(yeni));

 int arr[]={2,1,2,-3,2};
 int eleman =-3;
 int counter=0;
        for (int w:arr) {if (w==eleman){
            counter++;
        }

        }if (counter>0){
            System.out.println(eleman+"  arrayde "+ counter+" defa var");
        }else {
            System.out.println(eleman+" array'de yok");
        }

String sentence="Java Kolaydir calisana, ne kolay ki calismayana";
        System.out.println(sentence);
        sentence=sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);
        String words[]=sentence.split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);



    }
}
