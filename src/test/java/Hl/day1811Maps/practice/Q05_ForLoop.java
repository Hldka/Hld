package Hl.day1811Maps.practice;

public class Q05_ForLoop {
    //0-255 e kadar olan harflerin ,sayi ve harf degerini ekrana yazdiriniz
    public static void main(String[] args) {
        System.out.println("For ile");
        for (int i=0;i<=255;i++){
            char c=(char) i;
            System.out.println(i+"==>"+c);
        }
        System.out.println("While ile");
        int i=0;
        while (i<=255){char d= (char) i;
            System.out.println(i+"--->"+d);

        i++;}
        System.out.println("do while");
        int k=0;
        do {
            char b= (char) k;
            k++;
            System.out.println(k+"__>"+b);
        }while (k<=255);
    }
}

