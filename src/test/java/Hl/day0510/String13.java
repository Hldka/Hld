package Hl.day0510;

public class String13 {
    public static void main(String[] args) {
        /*
        13) Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1 sembol olmalıdır.
Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır. 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
'!1a23b4' için kodunuz konsolda false yazdırmalıdır. '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
'! a b 3 k' kodunuz konsolda false yazdırmalıdır.

         */


        String pwd="1 2?  !3   34b ";
        // bosluk haric  en az 8 karakter olmali
        // en az 1 sembol olmali

      boolean s1= pwd.replace(" ","").length()>7;
      boolean s2=pwd.replaceAll("^\\p{Punct}","").length()>0;
        boolean sons=s1&&s2;
        System.out.println(sons);




        String sifre = "!1a23b4?es";

        Boolean enAzSekizKrkMi= sifre.replaceAll("\\s","").length()>=8;
        Boolean enAzBirSembolVarMi = sifre.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","")
                .length()>0; System.out.println("sifre gecerli mi ? " + (enAzSekizKrkMi && enAzBirSembolVarMi));
    }
}
