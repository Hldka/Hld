package Hl.day1110;

import java.util.Scanner;

public class Loop7_ {
    public static void main(String[] args) {
        /*
         Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz...");
        int rkm=scan.nextInt();
        int snc=1;
        for (int i=1;i<11;i++){
            snc=i*rkm;
            System.out.println(rkm+"*"+i+"="+snc);

        }
        /*
        8) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık
         olacak şekilde aralarında boşluk bırakarak yazdırmak için gereken kodu yazınız.
         */
String s="";
for (int i=20;i>3;i--){
    if(i%2!=0){ s=s+i+" ";

    }
}System.out.print(s);

/*
9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 'Ali Can?' ==> l*i*a*n*
 */
String wtr="Ali Can?";
String h="";
for (int i=0;i<wtr.length();i++){
   char ch=wtr.charAt(i);
    if (ch>='a'&& ch<='z'){
        h=h+ch+'*';

    }
}System.out.println(h);
/*
10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden
 önce bir yıldız işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 75.4238  ́ *4*2*3*8
 */
double gh=75.4238;
String hg=String.valueOf(gh);
String hz=hg.substring(2);
String re="";

for (int i=0;i<5;i++){
    char tw=hz.charAt(i);
    re=re+tw+'*';

}
        System.out.println(re);
    }
}
