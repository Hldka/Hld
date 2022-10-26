package Hl.day2510variables;

import java.util.Locale;
import java.util.Scanner;

public class StringManuplationsengl {
    public static void main(String[] args) {

        // 1) Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter you ein city Name ....");
        String city= scan.nextLine();
        String uptdCity=city.trim().toLowerCase();
        String initial=uptdCity.substring(0,1);
        uptdCity =uptdCity.substring(0,1).toUpperCase()+uptdCity.substring(1);

        System.out.println(uptdCity);
        //2) Create 3 String variables for people's names. Print the sum of the number of characters in all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        String n1="Ali can";
        String n2="Merve Star";
        String n3="Mark Tom";
        int sum= n1.replace(" ","").length()+n2.replace(" ","").length()+n3.replace(" ","").length();

        System.out.println(sum);
        //3) Create a String variable, print the total number of alphabetical and numeric characters in the String on the console.
       // Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.
        String str="Miami 33018!!!";
       int sa= str.replaceAll("\\W","").length();
        System.out.println(sa);
        System.out.println(str.length());
        //4) Create a String variable, print the number of non-digit characters in the String on the console.
        //Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.
        String  nun="1a3Bcf4!...";
        System.out.println(nun.replaceAll("[0-9]","").length());
        //5) Create a String variable and print just the last non-space character on the console for any String.
        //Example: For ‘Ali Can’ you should print n
        //For ‘Miami ’ you should print i etc.
        System.out.println("Enter you a thing ");
        String str1=scan.nextLine();
        int str1i=str1.length()-1;
        System.out.println(str1.substring(str1.length()-1));
//6) Create a String variable and find the sum of the ASCII values of the first and the last characters of the String.
        System.out.println("Enter you print");
        String ks=scan.nextLine();
        int asci1=ks.trim().charAt(0);
        int ascisn=ks.trim().charAt(ks.length()-1);

        System.out.println(ascisn+asci1);
    }
}
