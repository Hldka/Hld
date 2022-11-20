package Hl.Interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
    Kullnicidan bir String aliniz.
    String'de var olan her character 'in sayisini ekrana yazdiriniz
    Örnek :yapaacn==> a=3,y=1,p=1,n=1,c=1

    hallolur yaaaa===> a=4, l=3,h=1,o=1,u=1,y=1

     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println(" bir String ifade giriniz....");
        String str= scan.nextLine();

        String[] aar=str.split("");

        System.out.println("arr"+Arrays.toString(aar));
        Arrays.sort(aar);
        System.out.println(Arrays.toString(aar));
    int count=0;
        for (int i=1;i< aar.length;i++){if (aar[i-1].equals(aar[i])){count++;}else{
            System.out.println(aar[i-1]+"="+(count+1));
            count=0;
        }if (i== aar.length-1){
            System.out.println(aar[i]+"="+(count+1));
        }  }


    }
}
