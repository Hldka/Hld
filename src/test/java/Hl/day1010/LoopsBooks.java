package Hl.day1010;

public class LoopsBooks {
    public static void main(String[] args) {


      //  1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları
        //  aynı satırda iki ardışık tam sayı arasında boşluk bırakarak yazınız.








for (int i=120;i>10;i--){
    if (i%4==0&&i%6==0){
        System.out.print(i+" ");
    }
}/*
        System.out.println(s);
        System.out.println();
        int i=120;
        while (i>10){if (i%4==0&&i%6==0) {s=s+i;}i--;
       }

        System.out.println(s);
        System.out.println();
int k=120;
do {
    if (k%4==0&&i%6==0){
        s=s+k;
    }k--;
}while (k>10);
        System.out.println(s);

*/
    }
}
