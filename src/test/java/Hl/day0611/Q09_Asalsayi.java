package Hl.day0611;

public class Q09_Asalsayi {
    /*
     9)10'un
altındaki asal sayıların toplamı 2 + 3 + 5 + 7 = 17'dir.
İki milyonun altındaki tüm asal sayıların toplamını bulun.
1 ve kendine bölünebilen sayi
     */
    public static void main(String[] args) {

 int top=0;
        for (int i=2;i<2000;i++){
            int sum=0;
            for (int k=2;k<i;k++){
                if (i%k==0){
                    sum+=k;


                }




            }if (sum==0){top+=i;}


        }
        System.out.println(top);









    }
}
