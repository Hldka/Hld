package day0710;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

    /*
     6) Use switch statement to create a simple calculator which does addition, subtraction,
      multiplication, and division with any 2 numbers
a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the console
b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the console
c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the console
d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the console
e) When user entered 10 and -5 and operation different from +, -, *, / your code should print "That operation cannot be done"
     */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        double s1=scan.nextDouble();
        System.out.println("lütfen baska bir rakam giriniz");
        double s2=scan.nextDouble();
        char islem=scan.next().charAt(0);
        switch (islem){
            case '+':
                System.out.println(s1+s2);
                break;
            case '-':
                System.out.println(s1-s2);
                break;
            case '*':
                System.out.println(s2*s1);
                break;
            case '/':
                System.out.println(s1/s2);
                break;
            default:
                System.out.println("Bu islem yapilmaz");
        }
















    }
}
