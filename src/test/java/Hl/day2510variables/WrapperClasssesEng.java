package Hl.day2510variables;

public class WrapperClasssesEng {
    public static void main(String[] args) {

        //1 ) Type a code to find the sum of the minimum value of the byte and the maximum value of short data types.
        byte a=Byte.MIN_VALUE;
        short b=Short.MAX_VALUE;
        System.out.println(a+b);//32639
        // 2) Type a code to convert “103” String to byte and to convert “2351” String to short then print the difference on the console.
        String ba="103";
        String bb="2351";
      byte yba=Byte.valueOf(ba);
        short ybb=Short.valueOf(bb);
        System.out.println(ybb-yba);//2248
        //3) What are the differences between valueOf(String s) and parseByte(String s) methods?
        String s="23";
        System.out.println(Byte.valueOf(s));//23
        System.out.println(Byte.parseByte(s));//23
        /*
        parseByte() returns primitive integer type (int), whereas valueOf() returns java.lang.Integer,
        which is the object representative of the integer. There are circumstances where you might want an Integer object, instead of a primitive type.
Of course, another obvious difference is that valueOf() is an instance method whereas parseByte() is a static method.
         */

    }

}
