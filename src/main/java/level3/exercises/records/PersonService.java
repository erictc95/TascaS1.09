package level3.exercises.records;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    public static void runExamples() {
        Person person = new Person("David", 32);

        System.out.println("Person name in UpperCase: " + person.getNameInUpperCase());
        System.out.println("Age of " + person.name() + ": " + person.age());

        createPersonWithValidation("Inés", -1);

        Person person3 = new Person("Alma", 18);
        System.out.println(person3);


        List<Person> people = createPeopleList();

        List<Person> adults = filterAdults(people);

        System.out.println("People over 18 years old: ");
        adults.forEach(System.out::println);
    }

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
