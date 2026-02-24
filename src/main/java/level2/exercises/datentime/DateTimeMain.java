package level2.exercises.datentime;


import java.time.*;

public class DateTimeMain {

    public static void main(String[] args) {

        System.out.println("Local Date: " + DateTimeUtils.getCurrentDate());
        System.out.println("Local Time: " + DateTimeUtils.getCurrentTime());
        System.out.println("Local Date and Time: " + DateTimeUtils.getCurrentDateTime());

        LocalDate start = LocalDate.of(1988, 6, 27);
        LocalDate end = LocalDate.of(2020, 3, 16);

        Period period = DateTimeUtils.calculatePeriodDifference(start, end);

        System.out.println("Start Date: " + start + " - End Date: " + end + " -> Difference: " + period.getYears() + " years, "
                + period.getMonths() + " months, " + period.getDays() + " days.");

        LocalDateTime init = LocalDateTime.of(2012, 2, 22, 12, 24);
        LocalDateTime fin = LocalDateTime.now();

        Duration duration = DateTimeUtils.calculateDurationDifference(init, fin);

        System.out.println("First Date: " + init);
        System.out.println("Last Date: " + fin);
        System.out.println("Difference of hours: " + duration.toHours());

        System.out.println("Formatted Date and Time: " + DateTimeUtils.formatDateTime(fin));

        System.out.println("Local Date: " + start + ", This Date is before than now? --> " + DateTimeUtils.isBeforeToday(start));

        System.out.println("--- My Calendar ---");
        System.out.println("--> Next Appoinments <--");

        LocalDateTime pastEvent = LocalDateTime.of(2020, 8, 23, 13, 45);
        LocalDateTime nextEvent = LocalDateTime.of(2052, 6, 27, 8, 30);
        LocalDateTime talentArenaEvent = LocalDateTime.of(2026, 3, 1, 10, 0);

        MyCalendar eriCalendar = new MyCalendar();

        eriCalendar.addAppointment(talentArenaEvent);
        eriCalendar.addAppointment(nextEvent);
        eriCalendar.addAppointment(pastEvent);

        for (LocalDateTime date : eriCalendar.filterFutureAppointments()) {
            System.out.println("Next Appointment --> " + DateTimeUtils.formatDateTime(date));
        }

    }
}
