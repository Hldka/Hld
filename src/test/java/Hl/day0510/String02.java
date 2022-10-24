package Hl.day0510;

public class String02 {
    public static void main(String[] args) {
      //12  ) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız.
//Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır ‘ali.’ için kodunuz konsolda false yazdırmalıdır
//‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
//‘ALI.’ için kodunuz konsolda true yazdırmalıdır
        String name = "Hasan.";
        char ilkharf = name.trim().charAt(0);
        boolean bHarf = ilkharf>='A' && ilkharf<='Z';
        System.out.println(bHarf);
        char sonHarf = name.trim().charAt(name.length()-1);
        boolean sHarf = sonHarf=='.';
        System.out.println(sHarf);





    }
}
