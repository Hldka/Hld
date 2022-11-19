package Hl.day1911practicetekrar;

public class JavaMathClassMethods {
    public static void main(String[] args) {
        int a=-12;
        int b=4;
        System.out.println("a nin mutlak degeri = "+ Math.abs(a));//12
        System.out.println("a ve b den en büyük olani =  "+Math.max(a,b));//4
        System.out.println("2,6,8 den en büyük olani = "+Math.max(2,Math.max(6,8)));//8
        System.out.println("a ve b den enkücük olani ="+ Math.min(a,b));//-12
        System.out.println("b nin karekökü= "+Math.sqrt(b));//2
        System.out.println("2 nin 3. kuvveti "+ Math.pow(2,3));//8_> pow(taban,us)
        System.out.println("round 3.1 i yuvarla ="+ Math.round(3.1));//3
        System.out.println("round 3.5 i yuvarla= "+Math.round(3.5));//4
        System.out.println("3.1 sayisini ust tamsayiya yuvarlama = "+Math.ceil(3.1));//4-> tavan
        System.out.println("3.5 sayisini ust tamsayiya yuvarlama = "+Math.ceil(3.5));//4
        System.out.println("3.1 sayisini alt tamsayiya yuvarlama = "+Math.floor(3.1));//3->taban
        System.out.println("3.5 sayisini alt tamsayiya yuvarlama = "+Math.floor(3.5));

        //Math.random(): double veri tipine sahip olarak algilar ve o-1 arasinda rastgele sayi üretir.
        //random()methoduyla rastgele deger üretme
        double doubleSayi=Math.random()*100;
        System.out.println("doublesayi = "+ doubleSayi);
        // int degerler üretme
        int intSayi=(int) (Math.random()*100);
        System.out.println("intSayi = " + intSayi);

    }
}
