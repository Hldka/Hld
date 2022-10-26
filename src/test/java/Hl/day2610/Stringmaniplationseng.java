package Hl.day2610;

public class Stringmaniplationseng {

    public static void main(String[] args) {
        //7) Create a String variable and print all characters except the first character on the console. Example:If the String
        //is ‘Java’ you should print ‘ava’ on the console.
        String str="Java";
        String str1=str.substring(1);
        System.out.println(str1);

        //8) Create a String variable and print all characters except the last character on the console in uppercases.
        //Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
        String st="Java";
        String st1=st.toUpperCase().substring(0,st.length()-1);
        System.out.println(st1);
        //9) Create a String variable and print all characters except the first character and the last character on the console in uppercases.
        //Example:If the String is ‘Java’ you should print ‘AV’ on the console.
        System.out.println(str1.toUpperCase().substring(0,str1.length()));
        //10) Type code to check if a String has just a single space character any position in the middle Example: For ‘Ali Can’ your code should print false on the console
        //For ‘ Ali Can ’ your code should print false on the console
        //For ‘ Ali Can ’ your code should print false on the console For ‘Ali Can’ your code should print true on the console
        String hs="Ali Can";
        System.out.println(hs.trim().length()-hs.trim().replace("\\s","").length()==1);
        //11) Type code to check if a String does not have any space character at the beginning and at the end?
        //Example: For ‘ Ali ’ your code should print false on the console For ‘Ali’ your code should print true on the console
        String st3="Ali  ";
        System.out.println(st3.trim());
        //12) Type code to check if a String has an uppercase initial and dot at the end. Example: For ‘Ali’ your code should print false on the console
        //For ‘ali.’ your code should print false on the console
        //For ‘ Ali. ’ your code should print false on the console For ‘Ali.’ your code should print true on the console
        //For ‘ALI.’ your code should print true on the console
        String srt=" Tom";
        boolean resultat=srt.equals(srt.trim());
        System.out.println(resultat);
        //13) Type code to check if a password is valid or not for the following conditions; Password must have at least 8 characters different from space character
        //Password must have at least 1 symbol
        //Example: For ‘A2b!’ your code should print false on the console
        //For ‘A2b3cdef ’ your code should print false on the console For ‘!1a23b4’ your code should print false on the console For ‘!1a23b4?es’
        //your code should print true on the console For ‘! a b 3 k’ your code should print false on the console
        String pwd="A2b!3cdef";
        boolean control1=pwd.replaceAll(" ","").replaceAll("[A-Za-z0-9]","").length()>0;
        System.out.println(control1);
        boolean control2=pwd.replaceAll("\\s","").length()>=8;
        System.out.println(control2);
        boolean control=control1&&control2;
        System.out.println(control);
        //14) Type code to check if a String has a specific single character or not in three different ways.
        String cont="Java Lern";
        System.out.println(cont.contains("v"));
        //15) String shirtPrice = ‘$12.99’; String bookPrice = ‘$35.99’;
        //Type code to find the sum of the shirt and book prices.
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";
        String nshirtPrice =shirtPrice.substring(1);
        String nbookPrice=bookPrice.substring(1);
        Double x=Double.valueOf(nshirtPrice);
        Double y=Double.valueOf(nbookPrice);
        System.out.println(x+y);
        //16) Type code to get initials of the first name and the last name of a given name. Middle name is out of scope.
        //Example: Tom Hanks ==> TH, Mary Star ==> MS
        String gh="Tom Hanks";
     String ch= gh.split(" ")[1].substring(0,1);
      String ch1= gh.split(" ")[0].substring(0,1);
        System.out.println(ch+ch1);
        //17) Type a code to find the number of punctuation marks used in a String.
        String s = "Wow! Ali is 13 years old, but he is a university student.";
        int totalNumberOfCharacters = s.length();
        int charsDiffFromPunctuationMarks = s.replaceAll("\\p{Punct}", "").length();
        int numOfPunctuationMarks = totalNumberOfCharacters - charsDiffFromPunctuationMarks;
        System.out.println(numOfPunctuationMarks);


    }
}
