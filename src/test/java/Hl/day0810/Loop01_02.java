package Hl.day0810;

public class Loop01_02 {
    public static void main(String[] args) {

        //Example 1: 3 den 6 a kadar tamsayilarin toplamini bulan kodu yaziniz
        int s=0;
        for (int i=3;i<7;i++){
            s=s+i;
        }
        System.out.println(s);
//Example 2: 6 den 3 a kadar tamsayilarin carpimini bulan kodu yaziniz
        int s1=1;
        for (int i=6;2<i;i--){
            s1=s1*i;
        }
        System.out.println(s1);

//Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz
        String num="12345";
        int b=0;
        for (int i=0;i<num.length()+1; i++){
            b=b+i;
        }
        System.out.println(b);

//2.yoll
        int num1 = -385;
        num1 = Math.abs(num1);
        int sonuc = 0;
        for(int i=num1; i>0; i=i/10){
            sonuc = sonuc + i%10;
        }
        System.out.println(sonuc);

//Example 4: Size verilen bir String'i ters ceviren kodu yaziniz.
        String str="yasam";
        String st=" ";
        for (int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
           st=st+c;
        }
        System.out.println(st);

    }
}
