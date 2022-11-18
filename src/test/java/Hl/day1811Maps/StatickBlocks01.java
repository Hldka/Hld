package Hl.day1811Maps;

public class StatickBlocks01 {

    public static double pi;
static {
    System.out.println("static block 2");
}


    public static void main(String[] args) {
        System.out.println("Main method");

    }  static {
        pi=3.14;
        System.out.println("static blok 1");
    }

}
