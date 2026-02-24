package level2.exercises.datentime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MyCalendar {
    private List<LocalDateTime> appointments;

    public MyCalendar() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(LocalDateTime date) {
        this.appointments.add(date);
    }

    public List<LocalDateTime> getAppointments() {
        return appointments;
    }

    public List<LocalDateTime> filterFutureAppointments() {
        LocalDateTime now = LocalDateTime.now();
        List<LocalDateTime> futureAppointments = new ArrayList<>();
        for (LocalDateTime date : appointments) {
            if (date.isAfter(now)) {
                futureAppointments.add(date);
            }
        }
        return futureAppointments;
    }
}
