package Hl.day0311;

public class Q3 {
    public static void main(String[] args) {

        int sonuc;
        int sonuc2=0;
/*
        String terstenSonu=" ";
        String yeniSonuc=" ";
        StringBuilder rvs = new StringBuilder(terstenSonu);
        System.out.println(rvs.reverse());
*/
        for (int i = 10; i < 100; i++) {

            for (int k = 10; k < 100; k++) {

                sonuc = i * k;

                for (int j = 1000; 100<j; j=j/10) {
                    sonuc2= j%10;
                    System.out.println(sonuc2);
                    if (sonuc2 == sonuc) {
                        System.out.println(sonuc);

                    }


                }
            }
        }

    }}