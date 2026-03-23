package level2.exercises.datentime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTimeService {
    public static void runExamples() {
        System.out.println("Local Date: " + DateTimeUtils.getCurrentDate());
        System.out.println("Local Time: " + DateTimeUtils.getCurrentTime());
        System.out.println("Local Date and Time: " + DateTimeUtils.getCurrentDateTime());

        LocalDate start = LocalDate.of(1988, 6, 27);
        LocalDate end = LocalDate.of(2020, 3, 16);

        Period period = DateTimeUtils.calculatePeriodDifference(start, end);

        System.out.println("Start Date: " + start + " - End Date: " + end +
                " -> Difference: " + period.getYears() + " years, "
                + period.getMonths() + " months, " + period.getDays() + " days.");

        LocalDateTime init = LocalDateTime.of(2012, 2, 22, 12, 24);
        LocalDateTime fin = LocalDateTime.now();

        Duration duration = DateTimeUtils.calculateDurationDifference(init, fin);

        System.out.println("First Date: " + init);
        System.out.println("Last Date: " + fin);
        System.out.println("Difference of hours: " + duration.toHours());

        System.out.println("Formatted Date and Time: " + DateTimeUtils.formatDateTime(fin));

        System.out.println("Local Date: " + start +
                ", This Date is before than now? --> " +
                DateTimeUtils.isBeforeToday(start));
    }
}
