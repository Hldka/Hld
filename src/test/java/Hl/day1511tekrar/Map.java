package Hl.day1511tekrar;

import java.util.HashSet;

public class Map { /*
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alacaksiniz.

    Çıktı--> sonuc = 44.69
     */
    public static void main(String[] args) {
setOlustur();
        System.out.println(sayilar);
        toplaminiAl();
        System.out.println(toplaminiAl());






    } public static HashSet<Double> sayilar=new HashSet<>();
  public static void setOlustur(){

sayilar.add(3.23);
sayilar.add(3.10);
sayilar.add(5.12);
sayilar.add(10.12);
sayilar.add(23.12);


    } public static  double toplaminiAl(){

       double sum=0;
        for (Double w:sayilar) {
            sum=sum+w;

        }
        return sum;
    }


}
