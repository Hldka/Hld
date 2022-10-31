package Hl.day3110;

import java.util.Arrays;

public class OCA {
    public static void main(String[] args) {

        System.out.println(1%3);
        boolean KeepGoing=true;
        int count=0;
        int x=3;
        while (count++ <3){
            int y=(1+2*count)%3;
        switch (y){
            default:
            case 0: x-=1; break;
            case 1: x+=5;
        }}
        String str="Java gun gectikce guzellesiyor";
        String [] str1= str.split(" ");
        System.out.println(Arrays.toString(str1));
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int sayi=1;
    }public static void  sayielemanvarmi(int arr[],int say){
        boolean sonuc=false;
       for (int i=0;i<arr.length;i++){if (arr[i]==say){sonuc=true;
       break;}}
        System.out.println(sonuc);
    }
}
