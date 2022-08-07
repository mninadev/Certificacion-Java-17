package joedayz.java17.f04072022;

import java.time.*;

public class CreateDateJava {
    public static void main(String[] args) {
        /*System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());*/

        //Java usa el formato de 24 horas, aunque USA el formato de 12 horas am/pm
        //Las dos formas de crear fechas
        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
        var date2 = LocalDate.of(2022, 1, 20);

        var time1 = LocalTime.of(22,15);
        var time2 = LocalTime.of(22, 12, 30, 100);
        var time3 = LocalTime.of(23,12);

        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 20, 150);
        var dateTime2 = LocalDateTime.of(date1, time1);

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2022, 1, 20, 6,15,30,200, zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);

        var date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        System.out.println("**************************Restar*********************************");
        var datex = LocalDate.of(2024, Month.JANUARY, 26);
        var timex = LocalTime.of(20,30, 50, 46464);
        var dateTimex = LocalDateTime.of(datex, timex);
        System.out.println(dateTimex);
        dateTimex = dateTimex.minusDays(1);
        System.out.println(dateTimex);
        dateTimex = dateTimex.minusHours(10);
        System.out.println(dateTimex);
        dateTimex = dateTimex.minusSeconds(30);
        System.out.println(dateTimex);

        var datey = LocalDate.of(2026, Month.JANUARY, 26);
        var timey = LocalTime.of(20,30, 50, 46464);
        var dateTimey = LocalDateTime.of(datey, timey).minusDays(4).minusHours(10).minusSeconds(30);
        System.out.println(dateTimey);

    }
}
