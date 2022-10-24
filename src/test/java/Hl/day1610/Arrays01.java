package Hl.day1610;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int[ ] a = new int[ ]{12, 5, 8, 13}; Arrays.sort(a);
        if(a.length%2!=0){
            Integer ortadakiElemaninIndexi = a.length/2; System.out.println(a[ortadakiElemaninIndexi]);
        }else{
            Integer ortadakiElemaninIndexi = a.length/2;
            Integer ortadakiEleman = (a[ortadakiElemaninIndexi] + a[ortadakiElemaninIndexi -1])/2; System.out.println(ortadakiEleman);
        }


    }}




