package Hl.day0211;

public class Q02 {//2)Fibonacci dizisindeki her yeni terim, önceki iki terimin
    // eklenmesiyle oluşturulur. 1 ve 2 ile başlayarak, ilk 10 terim şöyle
    //olacaktır:
    //1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    //Fibonacci dizisindeki değerleri dört milyonu geçmeyen terimleri
    //dikkate alarak çift değerli terimlerin toplamını bulunuz.

    public static void main(String[] args) {
        long a=1;
        long b=1;
        long fib=0;
        long count=0;
        for (int i=1;i<4000;i++){
            fib=a+b;
            a=b;
            b=fib;

            if (fib%2==0){count=fib+count;}


        }   System.out.println(count+"");




    }
}
