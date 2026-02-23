package level1.exercises.enums;

public class DayChecker {

    public static void workingOrWeekend(Day day) {
        if (day == Day.SATURDAY || day == Day.SUNDAY) {
            System.out.println("Weekend");
        } else {
            System.out.println("Working");
        }
    }
}
