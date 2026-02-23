package level2.exercises.datentime;


import java.time.*;

public class DateTimeMain {

    public static void main(String[] args) {

        System.out.println("Local Date: " + DateTimeUtils.getCurrentDate());
        System.out.println("Local Time: " + DateTimeUtils.getCurrentTime());
        System.out.println("Local Date and Time: " + DateTimeUtils.getCurrentDateTime());

        LocalDate start = LocalDate.of(2008, 6, 27);
        LocalDate end = LocalDate.of(2020, 3, 16);

        Period period = DateTimeUtils.calculatePeriodDifference(start, end);

        System.out.println("Difference: " + period.getYears() + " years, "
        + period.getMonths() + " months, " + period.getDays() + " days.");

        LocalDateTime init = LocalDateTime.of(2012, 2, 22, 12,24);
        LocalDateTime fin = LocalDateTime.now();

        Duration duration = DateTimeUtils.calculateDurationDifference(init, fin);

        System.out.println("Difference of hours: " + duration.toHours());

    }
}
