package Hl.day2210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        System.out.println(e);

        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(e);
        System.out.println(f);
        int size = e.size();
        int flag = 0;
        for (int i = 0; i < size; i++) {
            if (f.get(i).equals(e.get(size - 1 - i))) {
                flag++;
            }
        }
        if (flag == size) {
            System.out.println("Azalan siradadir");
        } else {
            System.out.println("Azalan sirada degil");
        }
    }}

