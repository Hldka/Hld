package Hl.day0811;

public class Account {

    public  int accountNummber;
   public static int balance;
    public static void deposit(int paraEkle){
        balance=balance+paraEkle;

    }public  void withdraw(int paraCikar){
        balance=balance-paraCikar;
        if (paraCikar==5000){
            System.out.println("Limiti astiniz...");
        }
    }public  void maasAl(int alinaMaas){
        balance+=alinaMaas;
    }public void eveharca(int evHarcanaPara){
        balance-=evHarcanaPara;
    }
}
