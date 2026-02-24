package level3.exercises.records;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("David", 32);

        System.out.println("Person name in UpperCase: " + person.getNameInUpperCase());
        System.out.println("Age of " + person.name() + ": " + person.age());

        try {
            Person person2 = new Person("Inés", -1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Person person3 = new Person("Alma", 18);
        System.out.println(person3);


        List<Person> people = new ArrayList<>();

        people.add(new Person("Rafael", 17));
        people.add(new Person("Daniela", 16));
        people.add(new Person("Carlos", 36));
        people.add(new Person("Elisabeth", 27));


        List<Person> adults = people.stream().filter(p -> p.isAdult()).collect(Collectors.toList());
        System.out.println("People over 18 years old: ");
        adults.forEach(System.out::println);

    }
}
