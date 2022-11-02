package Hl.day0211;

public class Butce {
    public static int butce;
    public static int demirbas;

    public void mutfakharcama(int mutfakharcama){
        butce=butce-mutfakharcama;
        demirbas=demirbas+mutfakharcama;
    }public void maasal(int alinanmaas){
        butce=butce+alinanmaas;
    }public void kirayardimial(int kirayardimi){
        butce=kirayardimi+butce;
    }public void cocukyardimial(int cocukyardimi){
        butce=cocukyardimi+butce;
    }public void kilikkiyafetal(int giyimal){
        butce=butce-giyimal;
        demirbas=demirbas+giyimal;
    }

}
