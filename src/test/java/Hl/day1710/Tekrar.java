package Hl.day1710;

import java.util.Arrays;

public class Tekrar {
    public static void main(String[] args) {
        //1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz. Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
int []sa={12,5,8,5,9};
        int si=sa[sa.length/2];
        int si2=sa[(sa.length-1)/2];
        System.out.println(sa.length/2);
if (sa.length%2==0){

    System.out.println((si+si2)/2);
}else {
    System.out.println(si);
}
//2) String’ lerden oluşan bir arrayde uzunluğu
// en küçük olan elemanları bulunuz. Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        String[]gh={"Kemal","Jonathan","Mark","Angie","Veli"};
        System.out.println(Arrays.toString(gh));
        int mina=gh[0].length();
        for (String w:gh) {mina=Math.min(mina,w.length());

        } for (String w:gh){if (mina==w.length()){
            System.out.println(w);
        }}
        //3) Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
        //Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
        int[]nu={-12,18,-5,23,-2};
        Arrays.sort(nu);
        int minpozitif=nu[nu.length-1];
        int maxnegatif=nu[0];
        for (int w:nu ) {if (w>=0){minpozitif=Math.min(minpozitif,w);}
            if (w<0){maxnegatif=Math.max(maxnegatif,w);

        }
        }
        System.out.println(minpozitif);
        System.out.println(maxnegatif);
        Arrays.sort(nu);
        for (Integer i=0;i< nu.length;i++){if (nu[i]<0&&nu[i+1]>0){
            System.out.println("Maximum negative"+nu[i]);
            System.out.println("Minmum positive"+nu[i+1]);
        }}
    }
}
