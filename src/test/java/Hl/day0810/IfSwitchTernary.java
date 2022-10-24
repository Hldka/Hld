package Hl.day0810;

import java.util.Scanner;

public class IfSwitchTernary {
    public static void main(String[] args) {
/*
        Ask user to their weight and height and type a program with calculates mass index

                * HINT : Body Mass Index = Weight (kg) / Square of height (m)

                Then give a message to user as following:

        If BMI is less than 18.5 , you re weak
        If BMI is between 18.5 and 25 , your weight is ideal
        If BMI is between 25 and 30, you re fat
        If BMI is more than or equal to 30, obese

        EXAMPLE :

        INPUT:

        Weight : 71

        Height : 1,72 m

        OUTPUT :

        Your BMI is  : 23.99945916711736
        Your weight is ideal

*/

        Scanner scan=new Scanner(System.in);
        System.out.println(" Lütfen kilonuzu   kg olarak  giriniz....");
        double kilo =scan.nextDouble();
        System.out.println("Lütfen boyunuzu m olarak  yaziniz");
        double boy=scan.nextDouble();
        double ibm=kilo/(boy*boy);
        System.out.println(ibm);





if (ibm<18.6){
    System.out.println("Weak");
} else if (ibm<26) {
    System.out.println("Ideal");

} else if (ibm<31) {
    System.out.println("fat");

} else if (ibm>31){
            System.out.println("Obese");

}else {
    System.out.println("Lütfen gecerli bir boy ve kilo giriniz");
}


    }
}
