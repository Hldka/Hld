package Hl.day1211;

import java.io.Console;
import java.util.LinkedList;

public class Deneme {
    public static void main(String[] args) {


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.set(0, "X");
        linkedList.removeAll(linkedList);
        System.out.println(linkedList.removeAll(linkedList));

    }
}