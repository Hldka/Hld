package Hl.day0510;

public class Book {
    public static void main(String[] args) {



        int i=5;
        int j=0;
        switch (i){
            case 2:
                j+=6;
            case 4:
                j+=1;
            case 1:
              j+=4;
            default:
                j+=2;

        }
        System.out.println("j="+j);
        char ch='a';
        switch (ch){
            case'a':
            case 'A':
                System.out.println(ch);
                break;
            case 'b':
            case 'B':
                System.out.println(ch);
                break;
            case 'c':
            case 'C':
                System.out.println(ch);
                break;
            case 'd':
            case 'D':
                System.out.println(ch);



        }
    }
}
