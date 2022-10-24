package Hl.day0810;

public class Loop03 {
    public static void main(String[] args) {

        //Example 1: Bir String'deki "m" karakteri haric tum karakterleri yazdiriniz
        //Andromeda ==> Androeda

        String s="Andromeda";

        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='m')continue;

            System.out.print(c);

        }





    }
}
