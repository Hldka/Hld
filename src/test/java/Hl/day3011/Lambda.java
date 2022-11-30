package Hl.day3011;

import java.util.stream.IntStream;

public class Lambda {
    public static void main(String[] args) {
        System.out.println(toplaCincix(5));
        System.out.println();
        System.out.println(ciftTamTop(5));
        System.out.println();
        System.out.println(ilkxcifttamsayto(5));
        System.out.println();
        System.out.println(ilkPztTkto(5));
        System.out.println();
        System.out.println(ilkPtkTp(5));
        System.out.println();
        istSayiXkuvvetini(2,3);
        System.out.println();
        System.out.println(istenenSayFak(5));

    }
    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar (x dahil)
    // tamsayilari toplayan bir program create ediniz.

    //Structured
    public static int topla(int x) {
        int toplam =0;
        for(int i=0 ; i<=x ; i++ ) {
            toplam = toplam + i ;
        }
        return toplam;
    }

    // Functional
public static int toplaCincix(int x){
        return IntStream.range(0,x+1).sum();
}
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int ciftTamTop(int x){
       return IntStream.rangeClosed(1,x).filter(t->t%2==0).sum();
    }

    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.

public static int ilkxcifttamsayto(int x){
        return IntStream.rangeClosed(1,x*2).filter(t->t%2==0).sum();
}


    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int ilkPztTkto(int x){
       return IntStream.iterate(2,t->t+2).limit(x).sum();
    }


    //TASK 05 --> 2'nin ilk pozitif x kuvvetini ekrana yazdiran programi  create ediniz.

 public static int ilkPtkTp(int x){
      return   IntStream.iterate(1,t->t+2).limit(x).sum();
 }

    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

public static void istSayiXkuvvetini(int istenensay ,int x){
        IntStream.iterate(istenensay,t->istenensay*t).limit(x).forEach(t-> System.out.print(t+" "));
}

    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    // 5 --> 5*4*3*2     3 --> 3*2
public static int istenenSayFak(int x){
      return   IntStream.rangeClosed(1,x).reduce(1,(t,u)->t*u);
}

}
