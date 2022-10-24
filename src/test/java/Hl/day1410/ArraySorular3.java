package Hl.day1410;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class ArraySorular3 {
    public static void main(String[] args) {
        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        int arr[]={0,2,3,0,12,0};
        int nearr[]=new int[arr.length];
        int snc=0;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]!=0){
                nearr[snc]=arr[i];
                snc++;
            }
        } System.out.println(Arrays.toString(nearr));


        //            [2, 3, 12, 0,  0,  0]
        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        //           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
        //                             ==> Kullanici 6'yi sordu ==> 6 array'de yok

        int karr[]={2,1,2,-3,2};
        int elmn=0;
        int counter=0;
        for (int w:karr) {if (elmn==w){

            counter++;
        }

        }if (counter>0){
            System.out.println( elmn+"arrayde"+counter+"defa var");
        }else {
            System.out.println(elmn+"arrayde yok");
        }

        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana." ==> calismayana
        String sätze="Java kolaydir calisana, ne kolay ki calismayana";
      sätze=sätze.replaceAll("\\p{Punct}","");
      String  wörter[]=sätze.split(" ");
      Arrays.sort(wörter,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(wörter));
        System.out.println(wörter[wörter.length-1]);
    }
}
