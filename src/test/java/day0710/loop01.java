package day0710;

public class loop01 {
    public static void main(String[] args) {
        /*
Önemli not: Java soldan saga ve yukardan asagi calisir!!!
         */

        int a=10;//10
        System.out.println("a:"+a);

        int b=2*a++;
        System.out.println("b:"+b);
        System.out.println("a:"+a);


       int c=++b;
        System.out.println("c:"+c);

        System.out.println(a+" "+b+" "+c);

        a=20;
        b=++a;
        //c=a++;

        System.out.println(a+" "+b+" ");
        int d=30;
        System.out.println(d++ +" "+d+" "+ --d +" " +d+" "+ d-- +" "+ d);

    }}
