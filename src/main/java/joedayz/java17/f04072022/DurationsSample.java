package joedayz.java17.f04072022;

import java.awt.*;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationsSample {
    public static void main(String[] args) {
        var daily = Duration.ofDays(1);
        var hourly = Duration.ofHours(1);
        var everyMinute = Duration.ofMinutes(1);
        var everySeconds = Duration.ofSeconds(1);
        var everyMillis = Duration.ofMillis(1);

        var daily2 = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(daily2);
        var hourly2 = Duration.of(1, ChronoUnit.HOURS);
        var everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);
        var everySeconds2 = Duration.of(1, ChronoUnit.SECONDS);
        var everyMillis2 = Duration.of(1, ChronoUnit.MILLIS);
        var everyNano2 = Duration.of(1, ChronoUnit.NANOS);
        var twelveHours = Duration.of(1, ChronoUnit.HALF_DAYS);
    }
}
