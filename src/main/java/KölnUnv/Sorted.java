package KölnUnv;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[]array1=createSorted(60,200,5);
        int[]array2=createSorted(1,50,5);
        System.out.println(checkSORted(array1));
        System.out.println("Das minimum des arrays befindet sich stelle "+findMin(array1)+"und hat den werr "+ array1[findMin(array1)]);
        System.out.println("Das maxdes arrays befindet sich stelle "+findMax(array1)+"und hat den werr "+ array1[findMax(array1)]);

        System.out.println(Arrays.toString(cut(array1,2,8)));

        System.out.println(Arrays.toString(concat(array1,array2)));

    }public static int[]cut(int [] array,int start ,int end){// schneidet aus dem Array einen Bereich aus
                                                           //beginnend an stelle start bis stelle
           //erstelle neues array mit gewüsns

        int[] neu=new int[end-start+1];
        for(int i=0;i<neu.length;i++){
            neu[i]=array[start+i];//kopiere Werte an die richtigen
        }
        return neu;
    }
    public  static boolean checkSORted(int [] array){
        for (int i=0;i< array.length-1;i++){
            if(array[i]> array[i+1]){return false;}
        }return true;
    }public static int[] createSorted(int minimum, int maximum, int length) {

        int[] array = new int[length];
        int j, min;
        min = minimum;
        for(int i = 0; i<array.length; i++) {

            j = (int) Math.floor((Math.random()/(array.length-i)*(maximum-min+1)+min));
            min = j;
            array[i] = j;
        }

        return array;
    }
    public static int findMin(int[] array){
        // soll die stelle im array array ausgeben
        //wo sich das Minimum befindet
        int minStelle=0; // soll speichern wo das bisherige Minimum ist
        for (int i=0;i<array.length;i++){//vergleichen arry[i]mit dem bisherigen Minimum
            if(array[i]<array[minStelle]){minStelle=i;}
        }
        return minStelle;
    }  public static int findMax(int[] array){
        // soll die stelle im array array ausgeben
        //wo sich das Max befindet
        int maxStelle=0; // soll speichern wo das bisherige Minimum ist
        for (int i=0;i<array.length;i++){//vergleichen arry[i]mit dem bisherigen Minimum
            if(array[i]>array[maxStelle]){maxStelle=i;}
        }
        return maxStelle;
    }public static void swap(int[] array ,int a,int b){
        int k,l;
        k=array[a];
        l=array[b];
        array[a]=l;
        array[b]=k;
    }
public static int[]concat(int[] a,int [] b){
        int[] neu=new int[a.length+b.length];
        for (int i=0;i<a.length-1;i++){neu[i]=a[i];
        for(int j=a.length;i<neu.length-1;i++){neu[j]=b[j-a.length];}
        } return neu;
}

}
