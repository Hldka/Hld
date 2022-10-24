package Hl.day1110;

public class Loop11 {
    public static void main(String[] args) {

        /*
        11) Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
         */
String s="Mark";
String key="";
for (int i=s.length()-1;i>-1;i--){
    char c=s.charAt(i);
    key=key+c;
}
        System.out.println(key);

/*
12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
 A A A A A A A A
 A X X X X X X A
 A X X X X X X A
 A X X X X X X A
 */
        int rows = 4, columns = 8; for(int i=1; i<=rows; i++){
            String s2 = ""; if(i==1 || i==rows){
                for(Integer k=1; k<=columns; k++){ s2 = s2 + "A ";
                }
                System.out.println(s2); }else{
                s2 = s2 + "A ";
                for(Integer m=2; m<columns; m++){
                    s2 = s2 + "X "; }
                s2 = s2 + "A ";
                System.out.println(s2); }
        }

    }
}
