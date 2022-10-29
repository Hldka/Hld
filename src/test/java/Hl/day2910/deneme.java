package Hl.day2910;

public class deneme {
    public static void main(String[] args) {

    }public static void m3(String x, int... y) { int p = 1;

        for(int w: y) { p = p * w;
        }
        m3("Result: ", 2, 3, 4);
        System.out.print(x); System.out.println(p);

    }
}
