package Hl.day1911practicetekrar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Q_Arrays {
    public static void main(String[] args) {
        LocalDate brth=LocalDate.of(1996,03,04);
        LocalDate evl=LocalDate.of(2019,2,6);
        LocalDate heute=LocalDate.now();
        System.out.println(  ChronoUnit.DAYS.between(brth,heute));
        System.out.println(  ChronoUnit.DAYS.between(brth,evl));
        System.out.println(9756-8374);
        System.out.println(ChronoUnit.MONTHS.between(brth,heute));
    }
}
