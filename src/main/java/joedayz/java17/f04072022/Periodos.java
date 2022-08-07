package joedayz.java17.f04072022;

import java.time.LocalDate;
import java.time.Month;

public class Periodos {

    private static void performAnimalEnrichment(LocalDate start, LocalDate end){
        var upTo = start;
        while (upTo.isBefore(end)){
            System.out.println("Dar un nuevo juguete "+ upTo);
            upTo = upTo.plusMonths(1);
        }
    }

    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        performAnimalEnrichment(start, end);
    }
}
