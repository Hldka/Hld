package Hl.day2510variables;

public class TypeCastingEng {
    public static void main(String[] args) {


        // 1) Create a short variable and convert it to an int variable.
    short height=120;
    int nHeigt=height;
      //2) Create a long variable and convert it to an int variable.
        long preice=23456l;
        int nPreice=(int)preice;
        //3) Create a double variable and convert it to a float variable
        double dinousorAge=234566.45;
        float nDinousorAge=(float) dinousorAge;
        //4) Create a double variable and convert it to a short variable,
        //then print the value of the short variable on the console. Be careful about the output, it will not be a decimal value.

        double age=23.7;
        short nage=(short) age;
        System.out.println(nage);//23
        // 5) Create a byte variable and convert it to a double variable,
        //then print the value of the double variable on the console. Be careful about the output, it will be a decimal number.

byte kg=34;
double nkg=kg;
        System.out.println(nkg);//34.0



    }
}
