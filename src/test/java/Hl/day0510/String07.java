package Hl.day0510;

public class String07 {
    public static void main(String[] args) {

// 17) Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
        String s= "Java!?";
       int a= s.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(a);

    }
}
