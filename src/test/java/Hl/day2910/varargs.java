package Hl.day2910;

public class varargs {
    public static void main(String[] args) {




    }public static void m3(String x,int... y){
        int p=1;
        m3("Resultat:",2,3,4);
        for (int w:y){
            p=p*w;
        }
       ;
        System.out.println(x);
        System.out.println(p);

    }
}
