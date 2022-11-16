package Hl.day1611.bankamatik;

import java.util.HashMap;
import java.util.Scanner;

public class Methodlar {
    private HashMap<Integer,Integer> idpswrd=new HashMap<>();
    private HashMap<Integer,Double> dpswrd=new HashMap<>();

    public HashMap<Integer, Integer> getIdpswrd() {
        return idpswrd;
    }

    public HashMap<Integer, Double> getDpswrd() {
        return dpswrd;
    }

    public void setIdpswrd(HashMap<Integer, Integer> idpswrd) {
        this.idpswrd = idpswrd;
    }

    public void setDpswrd(HashMap<Integer, Double> dpswrd) {
        this.dpswrd = dpswrd;
    }
    Scanner scan=new Scanner(System.in);


    int id=0;
    public void kontrolId(){

            System.out.println("lütfen Id numarasini giriniz...");
             id=scan.nextInt();

          if (idpswrd.containsKey(id)){passwordkontrol();
          }else System.out.println("Lütfen gecerli bir id giriniz...");
          kontrolId();


    }private void passwordkontrol(){
        System.out.println("Lütfen password giriniz");
        int password =scan.nextInt();
        boolean a=false;
        for (Integer w: getIdpswrd().keySet()) {
            if (w==id && idpswrd.get(w)==id){menugoster();
                a=true;
                break;
            }else a=false;

        }if (a==false){System.out.println("Lütfen gecerli password giriniz");
        passwordkontrol();
        }else menugoster();
    }

    private void menugoster() {
        System.out.println("Hosgeldiniz...");
        System.out.println("Hangi islami apmak istiyorsunuz\n Para Cekme:1 Para yatirma : 2"+"Bakiye goruntulme : 3 Cikis :4");
        int islemno=scan.nextInt();
        switch (islemno){
            case 1:paracek(); break;
            case 2:parayatir(); break;
            case 3:
                System.out.println("toplam bakiyeniz= "+dpswrd.get(id));
                menugoster();
            case 4:
                System.out.println("gule gule");
                kontrolId();

        }


    }private void paracek(){
        System.out.println("kac para cekmek istiyorsunuz?");
        double cekpara=scan.nextDouble();
        if (cekpara>dpswrd.get(id)){
            System.out.println("cekeceginiz para toplam bakiyeden fazla olamaz");
            paracek();
        }else {
            double klnpara= dpswrd.get(id)-cekpara;
            dpswrd.put(id,klnpara);
            System.out.println("kalan bakiyeniz="+dpswrd.get(id));
        }
    }private void parayatir(){
        System.out.println("kac para yatirmak istiyorsunuz");
        double yatirpara=scan.nextDouble();
        double toppara=dpswrd.get(id)+yatirpara;
        dpswrd.put(id,toppara);
        System.out.println("kalan bakiyeniz= "+ dpswrd.get(id));
        menugoster();


    }
}
