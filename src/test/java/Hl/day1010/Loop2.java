package Hl.day1010;

public class Loop2 {
    public static void main(String[] args) {
          /* 2) Bir String' de tekrarlanan karakterleri yazdırmak için kod yazınız.
                Örneğin; accessories ´ ces    */

       // exp8: size verilen string'de tekrarsiz karakterleri ekrana yazdiriniz
//        "Hellooo Ali"==> HeAi
        System.out.println();
        String z ="Hellooo Ali ";
        for (int i=0; i<z.length(); i++)
        {
            char c =z.charAt(i);
//            System.out.println(c + " " + z.indexOf(c) + " " + z.lastIndexOf(c));
            if (z.indexOf(c)==z.lastIndexOf(c))
            {
                System.out.print(c);
            }
        }
        System.out.println();

String snc= "accessories";
String s=" ";
for (int i=0;i<snc.length();i++){
    String c1=snc.substring(i,i+1);
   // System.out.print(c1+" "+snc.indexOf(c1)+" "+snc.lastIndexOf(c1));
    if (snc.indexOf(c1)!=snc.lastIndexOf(c1)){ if (!s.contains(c1)){s=s+c1;
    }

        }

}System.out.println(s);


    }}

