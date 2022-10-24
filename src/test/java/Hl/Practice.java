package Hl;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        String a ="Hello World";
        System.out.println(a);
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyadiniz giriniz:");
        String soyad= scan.nextLine();
        System.out.println("Lutfen Memleketinizi giriniz:");
        String memleket= scan.nextLine();
        System.out.println("Lutfen Aktif Konumunuzu  giriniz:");
        String konum = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz:");
        Byte yas= scan.nextByte();
        System.out.println("Lutfen boyunuzu giriniz:");
        Byte boy = scan.nextByte();
        System.out.println("Javayi sevdiniz mi?:");
        boolean x = scan.hasNext();
        System.out.println(isim );
        System.out.println(soyad);
        System.out.println(memleket);
        System.out.println(konum);
        System.out.println(yas);
        System.out.println(boy);
        System.out.println(x);



    }
}
