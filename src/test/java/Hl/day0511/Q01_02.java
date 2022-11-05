package Hl.day0511;

public class Q01_02 {//1)Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.

    public static void main(String[] args) {
        double sy=23.87;
        float ysy=(float)sy;

        //  2)İki tamsayıyı değiştirmek için bir kod yazınız.

        int zh1=34;
        int zhl2=43;
        int zhl3=0;
        zhl3=zh1;
        zh1=zhl2;
        zhl2=zhl3;
        System.out.println(zh1);
        System.out.println(zhl2);
        System.out.println(zhl3);

       // 3) Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
        long dt=4567387L;
        int ydt=(int)dt;
        // 4) Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve yine data
        //     tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki değişken arasındaki farkı yazdırınız.
        String cs="103";
        byte ycs=Byte.valueOf(cs);

    }
}
