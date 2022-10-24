package Hl.day0510;

public class Bookternary {
    public static void main(String[] args) {
   String pwd="9dsjhlkhsjk";
   boolean a=pwd.replaceAll(" ","").length()>8;
   boolean b=pwd.replaceAll("","").length()>7;

        System.out.println(a);
        System.out.println(b);

 String gecerli =a&&b? "gecerli":"gecersiz";
        System.out.println(gecerli);


    }
}
