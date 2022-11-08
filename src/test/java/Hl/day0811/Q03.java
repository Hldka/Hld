package Hl.day0811;

public class Q03 {
    /*
    // 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
        // 2- bir consructor ekleyiniz.
        // 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
        // 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
        // 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
        // 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.
     */
    public static void main(String[] args) {
        Account account1=new Account();
        Account account2=new Account();

        account1.eveharca(100);
        account1.maasAl(5000);
        account1.withdraw(350);
        System.out.println(Account.balance);

        account2.maasAl(500);
        account2.eveharca(600);



    }


}
