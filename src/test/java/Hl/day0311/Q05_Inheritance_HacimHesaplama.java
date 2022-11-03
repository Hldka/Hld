package Hl.day0311;

public class Q05_Inheritance_HacimHesaplama {
    //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız.(Inheritance kullanınız)


    public static void main(String[] args) {
        Küp küp=new Küp();
double karePrizmaHacmi=küp.hacimhesapla(3,5);
        System.out.println(karePrizmaHacmi);

Dikdörtgenprizma dikdörtgenprizma=new Dikdörtgenprizma();
double dikdörtgenhacmi=dikdörtgenprizma.dikgörtgenhacimhesapla(3,5,7);
        System.out.println(dikdörtgenhacmi);
Silindir silindir=new Silindir();
double silindirhacmi= silindir.silindirhacmi(3,5);
        System.out.println(silindirhacmi);


    }



}
