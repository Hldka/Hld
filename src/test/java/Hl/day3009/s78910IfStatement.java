package Hl.day3009;

public class s78910IfStatement {
    public static void main(String[] args) {

String a="Ali Can";
if (a.equals("ali Can")||a.equals("Ali can")||a.equals("ali can")){
    System.out.println("Bas harflerinde hata ");
} else if (a.equals("Ali")||a.equals("Can")) {
    System.out.println("Ad veya soyad eksik");

} else {
    System.out.println("format hatasi");


    }
}}
