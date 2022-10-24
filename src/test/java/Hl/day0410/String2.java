package Hl.day0410;

public class String2 {
    public static void main(String[] args) {

    String str ="seyhan yavuz";
        String str1= str.split(" ")[0].replace("s","S");

    String str2=str.split(" ")[1].replace("y","Y");
        System.out.println(str1+" "+str2);
/*
8. String str = "şeyhan yavuz";
Yukarıdaki Stringde "s" ve "y" harflerini büyük harf yapmak için hangileri doğrudur?
A) System.out.println(str.replace("s", "S")); System.out.println(str.replace("y", "Y"));
B) System.out.println(str.replaceAll("s", "S")); System.out.println(str.replaceAll("y", "Y"));
C) System.out.println(str.replace('s', 'S')); System.out.println(str.replace('y', 'Y'));
D) System.out.println(str.replaceAll('s', 'S')); System.out.println(str.replaceAll('y', 'Y'))
 */
/*
9. String str = "Java Kolaydır"; Aşağıdakilerden hangileri doğrudur?
A) System.out.println(str.endsWith("r")); Ekranan true yazdırır
B) System.out.println(str.endsWith("dir")); Ekranan true yazdırır
C) System.out.println(str.endsWith("")); Ekranan true yazdırır
D) System.out.println(str.endsWith("Java Kolaydır")); Ekranan true yazdırır


10. String b = "Ali 12 ?_"; Aşağıdakilerden hangisi yanlıştır?
A) System.out.println(b.replaceAll("\\d", "*")); Ekrana Ali ** ?_ yazdırır
B) System.out.println(b.replaceAll("\\D", "*")); Ekrana ****12*** yazdırır
C) System.out.println(b.replaceAll("\\S", "*")); Ekrana *** ** ** yazdırır
D) System.out.println(b.replaceAll("\\w", "*")); Ekrana Ali*12**_ yazdırır

 */
        String b="Ali 12 ?_";
        System.out.println(b.replaceAll("\\d","*"));
        System.out.println(b.replaceAll("\\D","*"));
        System.out.println(b.replaceAll("\\S","*"));
        System.out.println(b.replaceAll("\\w","*"));




    }
}
