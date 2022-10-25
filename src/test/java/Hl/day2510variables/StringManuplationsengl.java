package Hl.day2510variables;

import java.util.Locale;
import java.util.Scanner;

public class StringManuplationsengl {
    public static void main(String[] args) {
        /*





7) Create a String variable and print all characters except the first character on the console. Example:If the String
is ‘Java’ you should print ‘ava’ on the console.
8) Create a String variable and print all characters except the last character on the console in uppercases.
Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
9) Create a String variable and print all characters except the first character and the last character on the console in uppercases.
Example:If the String is ‘Java’ you should print ‘AV’ on the console.
10) Type code to check if a String has just a single space character any position in the middle Example: For ‘Ali Can’ your code should print false on the console
For ‘ Ali Can ’ your code should print false on the console
For ‘ Ali Can ’ your code should print false on the console For ‘Ali Can’ your code should print true on the console
11) Type code to check if a String does not have any space character at the beginning and at the end?
Example: For ‘ Ali ’ your code should print false on the console For ‘Ali’ your code should print true on the console
12) Type code to check if a String has an uppercase initial and dot at the end. Example: For ‘Ali’ your code should print false on the console
For ‘ali.’ your code should print false on the console
For ‘ Ali. ’ your code should print false on the console For ‘Ali.’ your code should print true on the console
For ‘ALI.’ your code should print true on the console

13) Type code to check if a password is valid or not for the following conditions; Password must have at least 8 characters different from space character
Password must have at least 1 symbol
Example: For ‘A2b!’ your code should print false on the console
For ‘A2b3cdef ’ your code should print false on the console For ‘!1a23b4’ your code should print false on the console For ‘!1a23b4?es’
your code should print true on the console For ‘! a b 3 k’ your code should print false on the console
14) Type code to check if a String has a specific single character or not in three different ways.
15) String shirtPrice = ‘$12.99’; String bookPrice = ‘$35.99’;
Type code to find the sum of the shirt and book prices.

16) Type code to get initials of the first name and the last name of a given name. Middle name is out of scope.
Example: Tom Hanks ==> TH, Mary Star ==> MS
17) Type a code to find the number of punctuation marks used in a String.
         */
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
