package Hl.day22inheritancepolymorphism;

public class Runner {

    public static void main(String[] args) {


    Cat cat1=new Cat();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);//45

    Mammal cat2=new Cat();
        System.out.println(cat2.a);//13


    Animal cat3=new Cat();
        System.out.println(cat3.a);//12

        Cat cat4= new Cat();
        cat4.eat();
        cat4.drink();
        Mammal cat5=new Cat();
        cat5.eat();
        Animal cat6=new Animal();
        cat6.eat();

}}
