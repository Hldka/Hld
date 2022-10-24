package Hl.day0610;

import java.util.Scanner;

public class switch02 {
    public static void main(String[] args) {
        /*
        3) Verilen ay numaralarından başlayarak tüm
        ay adlarını yazdıran bir kod yazınız.
         Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır.
         */
        /*
        4) Cinsiyet "Erkek" ise "Erkek" yazdırınız. Cinsiyet "Kadın" ise "Kız" yazdırınız.
Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
 Not : Bu seçenekler dışındakilerini yoksayınız.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Cinsiyetinizi   \n Erkek & Kadin \nolarak giriniz ");
        String cins=scan.next().toLowerCase();



        switch (cins){
            case "kadin" : cins ="Kiz ";

                break;
            case "erkek": cins="Erkek";
                break;
            default:cins="Digerleri ...";
            break;



        }System.out.println(cins);

    }
}
