package Hl.day0511;

public class Q09 {
    //. soru Bir Pisagor üçlüsü, a < b < c olmak
    //üzere üç doğal sayı kümesidir, bunun için,
    //a 2 + b 2 = c 2
    //Örneğin,
    //3 2 + 4 2 = 9 + 16 = 25 = 5 2 .
    //a + b + c = 1000 olan tam olarak bir Pisagor üçlüsü vardır . abc
    //çarpımını bulun .
//1.kosul:a < b < c
    //2.kosul a 2 + b 2 = c 2
    //3.kosul a + b + c = 1000
    public static void main(String[] args) {
        int count=0;
        for (int i=0;i<1000;i++){
            for (int j=0;j<1000;j++){
                for (int k=0;k<1000;k++){

                    if (i>j&&j>k){
                        int crpm=(k*k)+(j*j);
                        if (i*i==crpm){if (i+k+j==1000){
                            System.out.println("c"+i);
                            System.out.println("b"+j);
                            System.out.println("a"+k);
                            System.out.println(crpm);
                            System.out.println(i*j*k);

                        }


                        }
                    }
                }


            }
        }

    }
}



