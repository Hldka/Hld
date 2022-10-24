package Hl.day1110;

public class Loop12 {
    public static void main(String[] args) {
        /*
        13) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.
         */

int resultat=0;
        for (int i=3;i<15;i++){
            resultat=resultat+i;
        }
        System.out.println(resultat);
        /*
        14) 3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.
         */

int res=1;
String s=" ";
for (int i=3;i<10;i++){
    res=res*i;

}
        System.out.println(res);


/*
15) Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için kod yazınız.

 */
        String a="";
        char ch='C';
        do { a=a+ch;ch--;


        }while (ch>='A'); System.out.println(a);




    }
}
