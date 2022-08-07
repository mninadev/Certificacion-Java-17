package joedayz.java17.f04072022;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodMethods {
    public static void main(String[] args) {
        System.out.println(Period.of(1,2,3));
        System.out.println(Period.ofMonths(2));

        var date = LocalDate.of(2022, 1 , 26);
        var time = LocalTime.of(20,30);
        var dateTime = LocalDateTime.of(date, time);
        var period2 = Period.ofMonths(1);
    }
}
