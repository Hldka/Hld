package Hl.Interviewquestions;

import java.util.Scanner;

public class Q03 {
    /*
    String olan Pin kodunuzu kontrol eden bir kod yaziniz
    bunu kart sifre kontrol de dekullanabilirsiniz

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sifre="erdal.bay123";
        int girissayisi=3;
        System.out.println("bir sifregiriniz");

        while (true){
            System.out.println("sifre gir");
            String girilensifre=scan.nextLine();
            if (sifre.equals(girilensifre)) {
                System.out.println("giris basarili");
                break;
            }else {
                System.out.println("sifren yanlis");
                girissayisi--;
                System.out.println("kalan giris hakkin"+girissayisi);
            }if (girissayisi==0){
                System.out.println("giris hakkiniz kalmadi kart bloke"+girissayisi);
                break;
            }
            }
        }
    }

