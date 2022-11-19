package Hl.day1911practicetekrar.OOP.restorant;

public class Musteri {
    public static void main(String[] args) {



        Mutfak menu=new Mutfak();
        System.out.println("menu = " + menu.toString());
        
        Mutfak siparisim =new Mutfak("Adanakebap","mercimek","sutlac","ayran");
        System.out.println("siparisim = " + siparisim);
    }

}
