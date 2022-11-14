package Hl.day1311.Kurs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class codingbat { public static String left2(String str){
return str.substring(1,str.length()-1);
}

    public static void main(String[] args) {

       LocalDate brthrana= LocalDate.of(2010,9,21);
    LocalDate heute=LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(brthrana,heute));
        System.out.println(ChronoUnit.MONTHS.between(brthrana,heute));
        System.out.println(ChronoUnit.DAYS.between(brthrana,heute));
    }
}
