package Hl.day1011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q02 {       /*
           Günlük gelir market programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,

     */
  static List<String> günler=new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));
    static List<Double>gelirler=new ArrayList<>();
static double toplamgelir=0;

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int gun=0;
        while (gun<7){
            System.out.println(günler.get(gun)+"gelirini giriniz");
            double gunungeliri=scan.nextDouble();
            gelirler.add(gunungeliri);
            toplamgelir=toplamgelir+gunungeliri;
            gun++;
        }
        System.out.println("Günlükgelirler"+gelirler);
        System.out.println("Toplamgelirler"+toplamgelir);

    } static double ortamalagelir(double ortalama){

        return(double) (toplamgelir/(günler.size()));
    }


    }






