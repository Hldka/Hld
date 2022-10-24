package Hl;

public class TurkischQuestionBank {
    public static void main(String[] args) {
        // 1) Herhangi bir 3 ögenin fiyatlari icin double data tipinde degiskenler olusturunuz.Fiyatlarin toplami konsola yazdiriniz.
        double ayakkabi = 12.9;
                 double corap =2.5;
                 double kemer= 5.3;
        System.out.println("Toplam ücreti...."+ (ayakkabi+corap+kemer));
        // 2) herhangi bir 3 öge icin float, long ve integer data tipinde degiskenler olusturunuz.bu degiskenlerin degerlerinin carpimini konsolda yazdiriniz.

        float sandalyeFiyati= 350.6f;
        long evFiyati= 30000;
        int arabaFiyati= 300;
        System.out.println(" toplam borclarim..."+(sandalyeFiyati*evFiyati*arabaFiyati));
        //3) basit faiz bulmak icin bir kod yaziniz.
        double anaPara= 3000;

        System.out.println("faiz  "+ (6*anaPara*(30)));
        // 4) bir String ve iki long data tipinde degisken olusturunuz. Konsolda bu long degiskenlerin toplami ve carpimi string ile yazdiriniz
        String s ="Sonuc";
               Long a=123L;
               Long b= 2336887L;
        System.out.println(s+(a+b));
        System.out.println(s+(a*b));

// 5) degerleri farkli olan iki boolean data tipinde degisken olusturunuz ve bu degerleri iki ardisik deger arasinda bosluk birakacak sekilde ayni satirda yazdiriniz

        boolean f = true;
        boolean k= false;
        System.out.println( f+""+k);
        //6) 3 öge (kitap,defter ve laptop) fiyati icin long data tipinde degiskenler olusturunuz.
        //konsolda 2 kitap, 4 defter ve 3 laptop icin toplam fiyatini yaziniz

        long kitapFiyati= 23l;
        long defterFiyati= 18L;
        long laptopFiyati= 2345L;
        System.out.println("Topma fiyat  "+(kitapFiyati*2)+(4*defterFiyati)+(3*laptopFiyati));
        //7...

       // Type Casting
        // 1) Short data tipinde vir degisken olusturunuz ve onu bir int degiskenine dönusturunuz
           short x= 122;
           int yenix= x;
           // 2) long data tipinde bir degisken olusturunuz ve onu bir int degiskenine dönusturunuz
        long yas= 10977L;
        int yeniYas= (int)yas;


        // Double data tipinde bir degisken olusturtunuz ve onu bir float degiskenine dönusturunuz.
        double kaya= 1000.45;
        float yeniKaya=(float) kaya;
        // double data tipinde bir degisken olusturunuz ve onu bir short degiskenine dönusturunuz.sonrasi da bu short degiskenin degerini konsola yazdiriniz.
double h= 123.5;
short yeniH=(short)h;
        System.out.println(yeniH);
        //byte data tipinde bir degisken olusturunuz ve onu double degiskenine dönusturunuz.sonrasinda bu double degiskenin degerini konsola yazdiriniz
        Byte kl= 12;
        double yeniKl= kl;
        System.out.println(yeniKl);
        // Wrapper Classes
        // 1) Byte data tipinin minimum degeri ile short tipinin maksimum degerinin toplamini bulmak icin kod yaziniz
       Byte mink= Byte.MIN_VALUE;
       Byte maxk= Byte.MAX_VALUE;
        System.out.println(maxk+mink);









}}
