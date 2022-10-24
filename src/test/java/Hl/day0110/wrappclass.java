package Hl.day0110;

public class wrappclass {
    public static void main(String[] args) {

    //Byte data tipinin minimum değeri ile short data
        // tipinin maksimum değerinin toplamını bulmak için bir kod yazınız.

byte a= Byte.MIN_VALUE;
short b=Short.MAX_VALUE;
        System.out.println(a+b);

//Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız
// ve yine data tipi String olan “2351”
// değerini short data tipine dönüştürüp konsolda iki değişken arasındaki farkı yazdırınız.

String aa="103";
String bb="2351";
byte bb1=Byte.valueOf(aa);
short aa1=Short.valueOf(bb);
        System.out.println(bb1+aa1);


    }
}
