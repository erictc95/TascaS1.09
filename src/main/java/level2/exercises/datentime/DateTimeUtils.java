package level2.exercises.datentime;

import java.time.*;
import java.util.Date;

public class DateTimeUtils {

    private DateTimeUtils(){
    }

    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public static LocalTime getCurrentTime() {
        return LocalTime.now();
    }

    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    public static Period calculatePeriodDifference(LocalDate start, LocalDate end) {
        return Period.between(start, end);
    }

    public static Duration calculateDurationDifference(LocalDateTime init, LocalDateTime fin) {
        return Duration.between(init, fin);
    }
}
