package Hl.day0211;

public class Q01 {
    //1 )Basit bir ev bütçesi kodu yazınız
    public static void main(String[] args) {
        Butce baba=new Butce();
        baba.maasal(5000);
        System.out.println(baba.butce);
        Butce anne=new Butce();
        anne.maasal(5000);

        anne.mutfakharcama(500);
        System.out.println(anne.butce);
        Butce cocuk=new Butce();
        cocuk.cocukyardimial(300);
        cocuk.kilikkiyafetal(250);
        System.out.println(baba.butce);


    }
}
