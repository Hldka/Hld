package Hl.day0511;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class deneme {String str = "a";
    //try da hareket var,
    void A() { try { B();
        str = str + "b";
        System.out.println(12/0);

    } catch (Exception e) {
        str = str + "c";

    }
    }
    void B() throws Exception {
        try {
            str = str + "d";
            C();
        } catch (Exception e) { str = str + "e";
        } finally {
            str = str + "f";
        }
        str = str + "g"; }
    void C() throws Exception {
        System.out.println(12/0);
    }
    void display() {
        System.out.println(str); }
    public static void main(String[] args) {
        deneme object = new deneme();
        object.A();
        System.out.println("==>");
        object.display();
    }}