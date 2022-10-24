package Hl.day0410;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Tam isminizi giriniz");
        String s=scan.nextLine();

char cilk =s.charAt(0);//
char cort=s.split(" ")[1].charAt(0);
char cson=s.split(" ")[2].charAt(0);


 if (s.contains(" "+" ")){
     System.out.println("Isminizin ilk harfleri : "+cilk+""+cort+""+cson);
 }
 else {
     System.out.println("Isminizin ilk harfleri : "+""+cilk+" "+""+cson);
 }

        String t = "Helloooo";
        char c = 'e';

        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra istenen character'in
        //ilk gorunumunun indexini return eder.
        int sonuc = u.indexOf("x", 4);
        System.out.println(sonuc);//11


        String v = "";
        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.
        //Eger String'de hic character yoksa isEmpty() "true" return eder, her hangi bir character varsa "false" return eder.
        // length()==0 demek isEmpty() true verir demektir.
        //Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        String x = " ";
        //isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);//true

        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);




    }
}}
