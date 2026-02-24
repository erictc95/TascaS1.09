package level2.exercises.datentime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

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

    public static String formatDateTime(LocalDateTime toFormatDateTime) {
        return toFormatDateTime.format(DATE_TIME_FORMATTER);
    }

    public static boolean isBeforeToday(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }

}
