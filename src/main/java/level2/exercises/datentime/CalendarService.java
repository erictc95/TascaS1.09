package level2.exercises.datentime;

import java.time.LocalDateTime;

public class CalendarService {
    public static void runExamples() {
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
