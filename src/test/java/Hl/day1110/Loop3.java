package Hl.day1110;

public class Loop3 {
    public static void main(String[] args) {


/*
5) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız. AA A A A
AA A A A
AA A A A
 */

char s='A';
for (int k=0;k<2;k++){for (int i=0;i<5;i++){
    System.out.print(s+" ");
}
    System.out.println();}
        System.out.println();

/*
6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
 A
 AA
 AA A
 AA A A

 */
        String s1="";
for (int m=1;m<=4;m++){


    for (int z=1;z<=m;z++){
    s1=s1+'A';}
    System.out.println(s1);
}


        System.out.println();
    }
}
