package Hl.Day04RepeatIfStatement;

public class Ifstatement01 {
    public static void main(String[] args) {

 int a=-1;
 if(a>0){
     System.out.println("Positive");


 }

 char ch='O';
 if(ch>='A'&& ch<= 'Z'){
     System.out.println("Büyük Harf");
 }


 int n= -2430;
 n= Math.abs(n);
 if (n>99 && n<1000){
     System.out.println("Uc basamakli");
 }

 int r=4;
 if (r%2==0 ){
            System.out.println("Cift sayi");

 }
int k=12;
 if(k<300 || k>1200){
     System.out.println("Harika sayi");
 }

    }
}
