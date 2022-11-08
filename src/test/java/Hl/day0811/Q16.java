package Hl.day0811;

public class Q16 {
    /*
    2¹⁵ = 32768 ve rakamları toplamı 3 + 2 + 7 + 6 + 8 = 26'dır.

 2¹⁰⁰⁰ sayısının rakamları toplamı kaçtır?
     */
    public static void main(String[] args) {
        System.out.println(2^(15));
        double sa=Math.pow(2,15);
        System.out.println(sa);
        double sa1=Math.pow(2,1000);
        System.out.println(sa1);
        long sayi= (long) sa1;
        long count=0;
        for (long i=sayi;i>0;i=i/10){
            count=count+i%10;

        }  System.out.print(count);
    }
}
