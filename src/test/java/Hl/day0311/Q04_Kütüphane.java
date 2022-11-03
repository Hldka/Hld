package Hl.day0311;

public class Q04_Kütüphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.
    public static void main(String[] args) {
        Kitap kitap1=new Kitap("Stolz un vorurteil","Jane Austen",365);
        kitap1.kitapbilgileri();
        Kitap kitap2=new Kitap("Harry Potter","J K rowling",500);
        kitap2.kitapbilgileri();



    }
}
