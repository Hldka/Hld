package Hl.day0511;

import Hl.day0111dateclass.DateClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Q05 {
    // 5) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç
    // 3 isimdeki karakter sayısının toplamını yazdırınız.
    //Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
    public static void main(String[] args) {
        String isim="Ali Can";
        String isim2="Merve Star";
        String isim3="Mark Tom";
        String ism=isim3+isim2+isim;
     int uy=ism.trim().replaceAll(" ","").length();
        System.out.println(uy);
        //6) Ali'nin kaç ay yaşadığını bulan kodu yazınız. Ali'nin doğum tarihi 4 Haziran 1997'dir.
        LocalDate brthAli=LocalDate.of(1997,06,04);
        LocalDate heute=LocalDate.now();
        ChronoUnit.MONTHS.between(heute,brthAli);
        //7) Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.
        LocalDateTime almanya=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        LocalDateTime Japonya=LocalDateTime.now(ZoneId.of( "Asia/Tokyo"));
        System.out.println(ChronoUnit.HOURS.between(almanya,Japonya));

    }
}
