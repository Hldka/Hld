package Hl.day2410;

public class E_Variables1 {
    public static void main(String[] args) {

        //1) Create double variables for the prices of any 3 items.
        // Print the sum of the prices on the console with a label.
        double shirtP=344.5677;
        double hoseP=344.5677;
        double bagP=344.5677;
        double sum=shirtP+hoseP+bagP;
        System.out.println(sum);
        //2) Create a float variable, a long variable, and an integer variable for any 3 items.
        // Print the multiplication of the values on the console with a label.
        float hausP=12.78F;
        long  autoP=1266L;
        int keyP=12;
        System.out.println( "Multiplication:  "+hausP*autoP*keyP);
        //3)Type a code to find simple interest.
        //Note: Simple interest formula = principal * rate * numberOfYear / 100

        int princip=1000;
        int rate=18;
        int numofyear=5;
       double interest=princip*rate*numofyear;
        System.out.println("The simple interest : "+ interest);
        //4) Create a String and two Long variables.
        // Print the sum and the multiplication of the long variables with the String on the console.
        String str= " learn";
        long haus=1234l;
        long auto=1234l;
        System.out.println(haus+auto+str);
        System.out.println(str+haus*auto);
        //5) Create two boolean variables whose values are different and print their values
        // in the same line with a space between two consecutive values.
        boolean b1=(5>4);
        boolean b2=(3<1);
        System.out.println(b1+" "+b2);
        //6) Create 3 float variables for the price of a book, notebook,
        // and laptop. Print the total price of 2 books, 4 notebooks and 3 laptops on the console
        float bookP=124f;
        float notebookP=1245f;
        float laptopf=3456f;
        System.out.println(2*bookP+4*notebookP+3*laptopf);
        //7) Type a code to swap two integers.
        int a=4;
        int b=5;
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("a="+b);
        System.out.println("b="+a);



    }
}
