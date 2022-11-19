package Hl.day1911practicetekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_Arrayslist {

    /*
    Rastgele kullanici adi olusturun JAVA kodu yaziniz
    1-Kullanicidan isim isteyelim
    2-kullanici adindaki bosluklari silelim
    3- Kullanici adinin alinabilir olup olmadigina bakalim
    4- eger bizim listemizde öyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun
    5-eger bu kullanici adi zaten varsa, sonunda rastgele sayi olusturup ekleyelim ve gösterelim.
     */
    public static void main(String[] args) {
        List<String> datebaseisimler=new ArrayList<>();
        datebaseisimler.add("Enes");
        datebaseisimler.add("Ismail");
        datebaseisimler.add("Abdulbaki");
        datebaseisimler.add("Emre");
        datebaseisimler.add("Melisa");
        datebaseisimler.add("Oguz");
        System.out.println("databaseIsimler= "+datebaseisimler);

        Scanner scan =new Scanner(System.in);
        System.out.println("kullanmak istediginiz ismi giriniz...");
        String name= scan.nextLine().trim();
        boolean usernameVarmi= datebaseisimler.contains(name);
        if (usernameVarmi){
            System.out.println("bu kullanici zaten alinkis");
        }else System.out.println("bu kullanici adini kullanabilirsiniz");

        if (usernameVarmi){
            int randomSayi=new Random().nextInt(100);
            name=name+""+randomSayi;
            System.out.println("Yeni kullanici adiniz : "+name);
        }else System.out.println("Yeni kullanici adiniz : "+ name);
    }
}
