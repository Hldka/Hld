package Hl.day2910;

public class A {
    public static void main(String[] args) {
        Test t=new Test(5);


        System.out.println(t.x);
        m(t);
    }
    public static void m (Test t){
        t=new Test();
        t.x=10;
        System.out.println(t.x);

    }
}
