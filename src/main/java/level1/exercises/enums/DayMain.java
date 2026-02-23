package level1.exercises.enums;

public class DayMain {

    public static void main(String[] args) {
        DayChecker.workingOrWeekend(Day.FRIDAY);
        DayChecker.workingOrWeekend(Day.SATURDAY);

        Task task = new Task(Level.HIGH);
        System.out.println(task.getTaskPriorityMessage());

        System.out.println(Level.MEDIUM.getColor());
        Task task2 = new Task(Level.valueOf("LOW"));
        System.out.println(task2.getTaskPriorityMessage());

        String input = "low";
        String colorLevel = input.toUpperCase();

        try {

            Task task3 = new Task(Level.valueOf(colorLevel));
            System.out.println(task3.getTaskPriorityMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("The level provided is not valid.");
        }

    }
}
