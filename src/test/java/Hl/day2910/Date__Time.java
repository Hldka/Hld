package Hl.day2910;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date__Time {
    public static void main(String[] args) {

        LocalTime time=LocalTime.of(9,34,2,960 );
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf.format(time));

//HH 12 saatlik dilimi kullanir.





    }
}
