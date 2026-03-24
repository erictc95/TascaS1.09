package level3.exercises.records;

import java.util.List;

import static level3.exercises.records.PersonService.*;

public class PersonMain {
    public static void main(String[] args) {
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
}
