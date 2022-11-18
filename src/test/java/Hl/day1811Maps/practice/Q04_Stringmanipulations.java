package Hl.day1811Maps.practice;

public class Q04_Stringmanipulations {
    public static void main(String[] args) {
       abcdtekyazdir("aaabbbbccccdddddee");
        }

    private static void abcdtekyazdir(String str) {

        String yeni="";
        for (int i=0;i<str.length();i++){
            if (!yeni.contains(str.substring(i,i+1))) {
                yeni = yeni + str.substring(i, i + 1);

            }       }
        System.out.println(yeni);
    }
}

