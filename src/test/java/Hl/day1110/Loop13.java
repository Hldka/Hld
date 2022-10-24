package Hl.day1110;

public class Loop13 {
    public static void main(String[] args) {
        /*
        12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A X X X X X X A
         */


String s="";
for (int k=0;k<4;k++){
    if (k==0){
for (int i=0;i<8;i++){
    s=s+"A";

}System.out.println(s);} else   {
        String s1="";
                s1=s1+"A"; for (int m=0;m<6;m++){
    s1=s1+"X";


    }s1=s1+"A";
        System.out.println(s1);
    }
}
        System.out.println();



/*

 */















    }
}
