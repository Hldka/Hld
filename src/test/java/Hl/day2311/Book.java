package Hl.day2311;

public class Book {
    public Book(String buchName, String buchVerlag, String author, int buchSeite, String buchDate) {
        this.buchName = buchName;
        this.buchVerlag = buchVerlag;
        this.author = author;
        this.buchSeite = buchSeite;
        this.buchDate = buchDate;
    }

    public String getBuchName() {
        return buchName;
    }

    public String getBuchVerlag() {
        return buchVerlag;
    }

    public String getAuthor() {
        return author;
    }

    public int getBuchSeite() {
        return buchSeite;
    }

    public String getBuchDate() {
        return buchDate;
    }

    public void setBuchName(String buchName) {
        this.buchName = buchName;
    }

    public void setBuchVerlag(String buchVerlag) {
        this.buchVerlag = buchVerlag;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBuchSeite(int buchSeite) {
        this.buchSeite = buchSeite;
    }

    public void setBuchDate(String buchDate) {
        this.buchDate = buchDate;
    }

    /*
                Kitap Sıralayıcı

            Book isminde bir sınıf tasarlayınız. Bu sınıf Comparable interface'den kalıtım alıp "compareTo"
             metodunu override ediniz. Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
              Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
               Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.

            Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
                 */
   private String buchName;
    private String buchVerlag;
    private String author;


    private int buchSeite;
    private String buchDate;




    public int compareTo( Book o){ return getBuchName().compareTo(o.getBuchName());}




}
