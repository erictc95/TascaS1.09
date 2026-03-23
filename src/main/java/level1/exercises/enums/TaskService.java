package level1.exercises.enums;

public class TaskService {
    public static void runExamples() {
        Task task = new Task(Level.HIGH);
        System.out.println(task.getTaskPriorityMessage());


        System.out.println(Level.MEDIUM.getColor());


        Task task2 = new Task(Level.valueOf("LOW"));
        System.out.println(task2.getTaskPriorityMessage());


        createTaskFromString("low");
    }

    public static void createTaskFromString(String input) {
        try {
            Level level = Level.valueOf(input.toUpperCase());
            Task task = new Task(level);
            System.out.println(task.getTaskPriorityMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("The level provided is not valid.");
        }
    }

}
