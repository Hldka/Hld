package Hl.day1211;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<String>visitors=new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add("Brad Pitt");
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cüneyt Arkin");
        System.out.println(visitors);
        String firstEl=visitors.pop();//Cut+Paste==>Ctrl+X
        System.out.println(visitors.pop());
        System.out.println(visitors);
    }
}
