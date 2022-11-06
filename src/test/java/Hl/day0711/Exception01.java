package Hl.day0711;

public class Exception01 {
    public static void main(String[] args) {
      double r1=  compareNumberOfCharacter("Java","Xy");
        System.out.println(r1);

    }
//verilen iki String'den birinin karakter sayisinin kac kati oldugunu veren method olusturunuz

public static double compareNumberOfCharacter(String s,String t){
        return s.length()/t.length();
}


}
