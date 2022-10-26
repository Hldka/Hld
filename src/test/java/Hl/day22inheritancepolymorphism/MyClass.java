package Hl.day22inheritancepolymorphism;

public class MyClass {String isim = "Ali Can";
    int yas = 33; int kilo = 85;
    MyClass(){
    }
    MyClass(String isim, int yas){
        this.isim = isim;
        this.yas = yas;
        }
    MyClass(String isim){ this.isim = isim;
    }

    public static void main(String[] args) {
        MyClass insan01 = new MyClass();
        System.out.println(insan01.isim);


    }
}
