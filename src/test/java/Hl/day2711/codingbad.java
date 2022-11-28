package Hl.day2711;

public class codingbad {
    //Given a string, take the last char and return a new string with the last
    // char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
    //
    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        System.out.println(or35(35));
    }public static String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
    //Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    // Use the % "mod" operator -- see Introduction to Mod
    public static boolean or35(int n) {
        if (n>0){  if (n%3==0 || n%5==0){return true;}else return false;

    }else return false;

    }public String front22(String str) {
        if (str.length()<2){return str;}else return str.substring(0,2)+str+str.substring(0,2);

    }public boolean startHi(String str) {
        if(str.startsWith("hi")){return true;}else return false;
    }public boolean icyHot(int temp1, int temp2) {
        if (temp1<0 ||temp2<0){return true;}else if (temp1>100 || temp2>100){return true;}else return false;

    }




}



