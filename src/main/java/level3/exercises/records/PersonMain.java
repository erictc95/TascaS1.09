package level3.exercises.records;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("David", 32);

        System.out.println(person.name());
        System.out.println(person.age());
    }
}
