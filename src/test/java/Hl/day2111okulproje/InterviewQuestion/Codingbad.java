package Hl.day2111okulproje.InterviewQuestion;

public class Codingbad {
    public static void main(String[] args) {

    }public static String noString(String str){
        if(str.length()>1){return str.substring(str.length()-1)+
                str.substring(0,str.length()-1)+str.substring(0,1);}else
            return str;

    }
}
