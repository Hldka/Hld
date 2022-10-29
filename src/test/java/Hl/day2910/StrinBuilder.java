package Hl.day2910;

import java.util.ArrayList;

public class StrinBuilder {
    public static void main(String[] args) {

        StringBuilder strBld=new StringBuilder(6);
        strBld.append("Learn");
        strBld.append("Java");
        System.out.println(strBld);

        StringBuilder strBld1=new StringBuilder("LearnJava");
        strBld1.substring(3);
        System.out.println(strBld1);
        strBld1.delete(5,9);
        System.out.println(strBld1);
        strBld1.insert(0,"You");
        System.out.println(strBld1);
        strBld1.reverse();
        System.out.println(strBld1);
        StringBuilder sa=new StringBuilder(7);
        sa.append("Java");
        System.out.println(sa.capacity()+","+sa.length());
        StringBuilder st=new StringBuilder("learn");
        System.out.println("before trim:"+st.capacity());
        st.trimToSize();
        System.out.println("aftertrim:"+st.capacity());
        ArrayList<String>list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i)+"");
        }


    }
}
