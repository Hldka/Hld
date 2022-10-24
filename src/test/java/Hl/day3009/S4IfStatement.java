package Hl.day3009;

public class S4IfStatement {
    public static void main(String[] args) {

      int i=126;
      if(i%10>=5){
          System.out.println("Son basamagi bir üst ondaliga yuvarla : "+(i/10+1)*10);
      }else {
          System.out.println("Son basamagi bir alt ondaliga yuvarla : "+(i/10-1)*10);
      }

int a=7;
int b=6;
int c=7;
if (a==b && b==c&& c==a){
    System.out.println("Eskenar Ücgen");
}
else if (a==b||a==c||c==b){
    System.out.println("Ikiz kenar ücgen");
} else {
    System.out.println("Cesit kenar ücgen");
}

/*
Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü
 oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde,
konsolda kodu- nuz "16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde,
 konsolda kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğin- de,
konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
 */
        double m=24;
        double km=m*1.6;
        double sa=1;
        double u=60*60*sa;
        double f=1;
        double s=0.0295*f;
        String operator="mildenKmye";
if (operator.equals("mildenkmye")){
    System.out.println(km+" km");
} else if (operator.equals("saniyedenSaate")) {
    System.out.println(u+"S aat");
} else if (operator.equals("fahrenaydansantigrata")) {
    System.out.println( s+" sgrad");

}

    }
}
