package Hl.manav;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        List<String>sebzeler=new ArrayList<>();
        sebzeler.add("Elma");
        sebzeler.add("Armut");
        sebzeler.add("Kiraz");
        sebzeler.add("Havuc");
        sebzeler.add("Salatalik");

        List<Double>fiyatlar=new ArrayList<>();
        fiyatlar.add(5.0);
        fiyatlar.add(6.0);
        fiyatlar.add(7.0);
        fiyatlar.add(8.0);
        fiyatlar.add(10.0);

        System.out.println(sebzeler);
        System.out.println(fiyatlar);
        System.out.println("hangi üründen kac kilo almak istersiniz ");


        for (int i=1;i<=sebzeler.size();i++){for (int k=i-1;k<i;k++){
            System.out.println(fiyatlar.get(k)+" Tl "+sebzeler.get(k));

        }


            }
        }







}
