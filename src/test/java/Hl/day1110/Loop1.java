package Hl.day1110;

public class Loop1 {
    public static void main(String[] args) {
        /*
        3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
         Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
         */


        String s="nalan";
        String snc="";
        for (int i=s.length()-1;i>-1;i--){
            String h=s.substring(i,i+1);
            snc=snc+h;

        }if (s.equals(snc)){
            System.out.println(s+ "\t palindrom");
        }else {
            System.out.println(s+"\tpalindrom degil");
        }
String h="nalan";
        String b="";
        int i=h.length()-1;
        while (i>-1){
            String j=h.substring(i,i+1);
            b=b+j;
            i--;

        }if (h.equals(b)){
            System.out.println(h+"\t palindrom");
        }else {
            System.out.println(h+"\t palindrom degil");
        }





        String r="tras nicin sart";
        String f="";
        int k=r.length()-1;
        do {
            String se=r.substring(k,k+1);
            f=f+se;
            k--;

        }while (k>-1);
        if (r.equals(f)){
            System.out.println( r+"\t palindrom");
        }else {
            System.out.println(r+"\t palindrom degil");
        }









    }
}
