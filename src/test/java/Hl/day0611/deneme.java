package Hl.day0611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class deneme {
    public static void main(String[] args) {String s = "abcd";
        try {
            Object obj = new Integer(12);
            s = (String)obj; }catch(ClassCastException e){
            System.out.println("Good"); }
        System.out.println(s); }}

