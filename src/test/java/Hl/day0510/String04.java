package Hl.day0510;

public class String04 {
    public static void main(String[] args) {/*
    14) Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek için kod yazınız.


        //1.yol
      String s1="Semranin kizi iyilesti mi?";
      boolean ss1=s1.contains("Semra");
        System.out.println(ss1);
//2.yol
boolean resultat =s1.replaceAll("[^h]","").length()>0;
        System.out.println(resultat);
        //3.yol
boolean res =s1.indexOf("i")!=-1;
        System.out.println(res);

        String s = "Java";
        Boolean sonuc = s.indexOf("v")!=-1;

        System.out.println("karakteri iceriyor mu? " + sonuc);

        */
        String str="Ayhan Beyhan";
        int b= str.indexOf("z");
        System.out.println(b>=0);



    }
}
