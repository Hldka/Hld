package Hl.dayprojemanav;

import java.util.Scanner;

public class KasaRunner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("************THe last code benders manav************\n"+"***********Ana Menu***********\n"+"\n"+
                "\t 1. Elma\t\t\t"+"\n"+
                "\t 2. Armut\t\t\t"+"\n"+
                "\t 3. Havuc\t\t\t"+"\n"+
                "\t 4. Kiraz\t\t\t"+"\n"+
                "\t 5. Salatalik\t\t\t"+"\n"+
                "\t Q cikis\t\t\t");
        System.out.println("Lütfen menüden tercihinizi yapiniz");

Müsterisecimi müsteri1=new Müsterisecimi(1);
        System.out.println(müsteri1.elma);


    }
}
