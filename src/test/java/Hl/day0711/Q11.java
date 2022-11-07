package Hl.day0711;

public class Q11 {
    /*
    Pozitif tamsayılar kümesi için aşağıdaki yinelemeli dizi tanımlanır:

                     n → n/2 (n çifttir)

                     n → 3n + 1 (n tektir)


Yukarıdaki kuralı kullanarak ve 13’den başlayarak aşağıdaki diziyi oluşturuyoruz:

                   13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1


“”Bu dizinin (13'ten başlayıp 1'de biten) 10 terim içerdiği görülebilir.

Henüz kanıtlanmamış olmasına rağmen (Collatz Problemi), tüm başlangıç sayılarının

 1'de bittiği düşünülmektedir.””


Bir milyonun altındaki hangi başlangıç sayısı en uzun zinciri oluşturur?

NOT: Zincir başladıktan sonra terimler bir milyonun üzerine çıkabilir.
     */
    public static void main(String[] args) {
        int y=13;
       do {y=cift(y);
           System.out.print(y+" ");

       }while (y!=1);




    }public static int cift(int a){
      if (a%2==0){
      return a/2;}else return a*3+1;

    }


}
