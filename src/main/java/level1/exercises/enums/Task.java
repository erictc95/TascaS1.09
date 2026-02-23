package level1.exercises.enums;


public class Task {
    private Level level;

    public Task (Level level) {
        this.level = level;
    }

    public String printTgetTaskPriorityMessage() {
        switch (level) {
            case LOW:
                return level.name() + " --> Try Harder!";
            case MEDIUM:
                return level.name() + " --> You're doing well!";
            case HIGH:
                return level.name() + " --> Keep it up!";
            default:
                return level.name() + "There is no level defined";
        }
    }
}
