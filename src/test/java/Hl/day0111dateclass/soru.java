package Hl.day0111dateclass;

public class soru {
    public static void main(String[] args) {
        /*
        1. soru
10'un altında 3 veya 5'in katı olan tüm doğal sayıları
sıralarsak 3, 5, 6 ve 9 elde ederiz. Bu katların toplamı 23'tür.
1000'in altındaki 3 veya 5'in tüm katlarının toplamını bulun.
         */
        int toplm=0;

        for (int i=0;i<1000;i++){
            if (i%5==0||i%3==0){toplm=toplm+i;

            }

        }
        System.out.println(toplm);




    }
}
