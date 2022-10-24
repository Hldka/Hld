package Hl.day1110;

public class Loop2 {
    public static void main(String[] args) {
        /*
        4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız. Örnek; 223878  ́ 37
         */
        String sayi="223878";
        String hld="";

        for (int i=0;i<sayi.length();i++){
            String sa=sayi.substring(i,i+1);

            if (sayi.lastIndexOf(sa)==sayi.indexOf(sa)){hld=hld+sa;
            }

        }
        System.out.println(hld);
        System.out.println();
        String svm="223878";
        String key="";
        int i=0;
        while (i<svm.length()){
            String sd=sayi.substring(i,i+1);
            if (sayi.lastIndexOf(sd)==sayi.indexOf(sd)){
                key=key+sd;
            }i++;
        }
        System.out.println(key);


        String dr="223878";
        String ju="";
        int k=0;
        do {String y=dr.substring(k,k+1);
            if (dr.indexOf(y)==dr.lastIndexOf(y)){
                ju=ju+y;
            }
            k++;
        }while (k<dr.length());
        System.out.println(ju);








    }
}
