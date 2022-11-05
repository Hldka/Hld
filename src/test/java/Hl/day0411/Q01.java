package Hl.day0411;

public class Q01 { /*1). soru
    İlk on doğal sayının karelerinin toplamı,
  1² +2 ²+…..+10 ² = 385
    İlk on doğal sayının toplamının karesi,
(1+2+...+10) ²  =55 ² = 3025
    Dolayısıyla ilk on doğal sayının kareleri toplamı ile toplamın
    karesi arasındaki fark,
            3025-385=2640.
    İlk yüz doğal sayının kareleri toplamı ile toplamın karesi
    arasındaki farkı bulun.*/


    public static void main(String[] args) {
        int sum=0;
        int sum1=0;
        for (int i=1;i<101;i++){
            sum=sum+(i*i);
            sum1=sum1+i;

        }
        System.out.println(sum1);
        System.out.println(sum1*sum1);
        System.out.println(sum);
        System.out.println(sum1*sum1-sum);




    }
    }





