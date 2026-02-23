package level1.exercises.enums;

public enum Level {
    LOW("Green"),
    MEDIUM("Yellow"),
    HIGH("Red");
    private final String color;

    Level(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
