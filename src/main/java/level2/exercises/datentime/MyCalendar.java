package level2.exercises.datentime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MyCalendar {
    private final List<LocalDateTime> appointments;

    public MyCalendar() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(LocalDateTime date) {
        this.appointments.add(date);
    }

    public List<LocalDateTime> getAppointments() {
        return new ArrayList<>(appointments);
    }

    public List<LocalDateTime> filterFutureAppointments() {
        return appointments.stream()
                .filter(date -> date.isAfter(LocalDateTime.now()))
                .toList();
    }
}
