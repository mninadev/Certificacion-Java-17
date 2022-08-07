package joedayz.java17.f04072022;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Periodos2 {
    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period){
        var upTo = start;
        while (upTo.isBefore(end)){
            System.out.println("Dar un nuevo juguete "+ upTo);
            upTo = upTo.plus(period);
        }
    }

    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        Period period = Period.ofDays(5);
        performAnimalEnrichment(start, end, period);
    }
}
