package personal;

import java.util.Scanner;

public class Methot extends Tanimlar {
    private Scanner scan= new Scanner(System.in);

    public void selectOption() {
        System.out.println("Personel Bilgi Sayfasina Hosgeldiniz...");
        do {
            System.out.println("Hangi Islemi yapmak istiyorsunz?\n 1 : Kayit 2: Kayit Görme 3: Kayit Silme 4: Exit");


            int secenek=scan.nextInt();
            switch (secenek){
                case 1: kayitYap();
                break;
                case 2: kayitGörme();
                break;
                case 3: kayitSilme();
                break;
                case 4:
                    System.out.println("gule gule...");
                    setFlag(false);
                    break;
                default:
                    System.out.println("gecersiz secim yaptiniz...");
            }
        }while (isFlag());
    }
int counter=0;
    private void kayitSilme() {
        System.out.println("silmek istediginiz kisinin id numarasini giriniz...");
        String yeniid=scan.next();
        if (getSetListe().containsKey(yeniid)){
            System.out.println();
            getSetListe().remove(yeniid);

        }else {
            System.out.println(" bu id sahip bir kullanici bulunmamaktadir...");
        counter++;
            if (counter==3){
                System.out.println("ust üste 3 defa yanlis girdiniz...");
                selectOption();
            }else
        kayitSilme();
        }

    }

    private void kayitGörme() {
        System.out.println("Görmek istediginiz kisinin id numarasini giriniz...");
        String yeniid=scan.next();
        if (getSetListe().containsKey(yeniid)){
            System.out.println(getSetListe().get(yeniid).getName()+" "+getSetListe().get(yeniid).getAdres()+" "+
                    getSetListe().get(yeniid).getTelno());

        }else System.out.println(" bu id sahip bir kullanici bulunmamaktadir...");
    }

    private void kayitYap() {
        System.out.println("Kayit sayfasina Hosgeldiniz...");
        System.out.println("Id Numaranizi giriniz...");
        setId(scan.next());
        if (getSetListe().containsKey(getId())){
            System.out.println("Adinizi yaziniz");
            String ad=scan.next();
            System.out.println("Soyadinizi giriniz...");
            String soyad = scan.next();
            setName(ad+" "+soyad);
            System.out.println("telefon numaranizi girinit ");
            setTelno(scan.next());
            System.out.println("yasadiginiz sehri giriniz");
            setAdres(scan.next());

            getSetListe().put(getId(),new Tanimlar(getName(),getAdres(),getTelno()));
        }else System.out.println("zaten bu Id daha önce kullanilmis...");

    }
}
