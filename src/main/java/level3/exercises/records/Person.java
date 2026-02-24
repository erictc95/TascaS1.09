package level3.exercises.records;

public record Person(String name, int age) {

    public Person {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or Negative!");
        }
    }

    public String getNameInUpperCase() {
        return name.toUpperCase();
    }

    public boolean isAdult() {
        return age > 18;
    }
}


