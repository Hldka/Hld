package Hl.day0611;

import java.util.Collections;

public class Q08_StringBuilder {
    public static void main(String[] args) {
        /*
        8)Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
  Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardı
         */

StringBuilder  st=new StringBuilder("anna");
        System.out.println(st.reverse());

        System.out.println(st.equals(st.reverse()));
        String str1="ey edip adanada pide ye";
        String ters="";
        for (int i=str1.length()-1;i>=0;i--){
            char ch=str1.charAt(i);
            String ch1=str1.substring(i,i+1);
            ters=ters+ch;




        }ters.equals(str1);

    }
}
