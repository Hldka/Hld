package interviewquestions;

public class Q27 {
    /*
    Alinan bir sitrinde karakterlerin tekrar sayisini cikti daki gibi  bulunuz..
    input = "aaabbccccaaaa"
    output=a3b2c4a4 */
    public static void main(String[] args) {

        String str = "aaabbccccaaaa";
        int count = 1;
        String res = "";

        for(int i=1; i<str.length(); i++) {

            if(str.substring(i-1, i).equals(str.substring(i, i+1))) {
                count++;
                if(i==str.length()-1) {
                    res = res + str.substring(i-1, i) + count;
                    count=1;
                }
            }else {
                res = res + str.substring(i-1, i) + count;
                count=1;
                if(i==str.length()-1) {
                    res = res + str.substring(i, i+1) + count;
                    count=1;
                }
            }

        }

        System.out.println(res);

    }
}
