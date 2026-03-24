package level3.exercises.records;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public static void createPersonWithValidation(String name, int age) {
        try {
            new Person(name, age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Person> createPeopleList() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Rafael", 17));
        people.add(new Person("Daniela", 16));
        people.add(new Person("Carlos", 36));
        people.add(new Person("Elisabeth", 27));

        return people;
    }

    public static List<Person> filterAdults(List<Person> people) {
        return people.stream()
                .filter(Person::isAdult)
                .toList();
    }
}
