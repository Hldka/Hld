package Hl.day0111dateclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateClass {
    public static void main(String[] args) {
        //1) Ali'nin kaç gün yaşadığını bulan kodu yazınız. Ali'nin doğum tarihi 12 Mayıs 2002'dir.
        LocalDate ali=LocalDate.of(1956,4,20);
        LocalDate heute=LocalDate.now();
        long gün= ChronoUnit.DAYS.between(ali,heute);
        long ay=ChronoUnit.MONTHS.between(ali,heute);
        long yil=ChronoUnit.YEARS.between(ali,heute);
        System.out.println("Yasadigi gün sayisi :  "+gün);
        System.out.println("Yasadigi ay : "+ay);
        System.out.println("Yasadigi yil : "+yil);
        //2) Ali'nin kaç ay yaşadığını bulan kodu yazınız. Ali'nin doğum tarihi 4 Haziran 1997'dir.
        LocalDate alii=LocalDate.of(1997,6,4);
        long günalii=ChronoUnit.MONTHS.between(alii,heute);
        System.out.println(günalii);
        //3) Ali'nin doğum tarihi 4 Haziran 1997'dir.
        // Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün sonraki tam tarihi bulmak için kodu yazınız.

        LocalDate brfAli=LocalDate.of(1997,6,4);
        System.out.println(brfAli.plusYears(2).plusMonths(3).plusDays(12));
        //4) Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
        //Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
        //Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
        //Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.

        LocalDate datm=LocalDate.of(1923,11,29);
        LocalDate hAli=datm.plusYears(45).plusMonths(8).plusDays(5);
        LocalDate datm1=LocalDate.of(1993,10,15);
        LocalDate veli=datm1.minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(hAli);
        System.out.println(veli);
        System.out.println(hAli.equals(veli));
        //5) Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
        //Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir. Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız.

        LocalDate brthVeli=LocalDate.of(2012,11,24).plusYears(3).plusDays(11);
        System.out.println(brthVeli);
//6) Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün olarak hesaplayınız.
        LocalDate ben=LocalDate.of(1983,6,1);
        LocalDate kizim=LocalDate.of(2010,9,21);
        System.out.println(ChronoUnit.DAYS.between(ben,kizim));
        //7) Belirli bir tarihte yılın son 2 hanesini alınız.
        int siniki=ben.getYear()%100;
        System.out.println(siniki);
        //8) Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
        //Artık Yıl:

        LocalDate tarih=LocalDate.of(2021,3,20);
        boolean artiklyilmi=tarih.isLeapYear();
        System.out.println(artiklyilmi);
        //9) İki farklı tarihin ay numaralarının toplamını bulunuz.
        LocalDate tari1=LocalDate.of(2012,9,12);
        LocalDate tarih2=LocalDate.of(2013,8,9);
        int aytoplma= tarih2.getDayOfMonth()+tari1.getDayOfMonth();
        System.out.println(aytoplma);
        //10) İki farklı tarih için saat farkını bulunuz.
        /*
        LocalDate ha=LocalDate.of(2019,7,8);
        LocalDate ha1=LocalDate.of(2012,6,7);
       long saatfarki=ChronoUnit.HOURS.between(ha1,ha);
        System.out.println(saatfarki);

         */


    }
}
