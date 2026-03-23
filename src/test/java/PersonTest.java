import level3.exercises.records.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void shouldReturnNameInUpperCase() {

        Person person = new Person("David", 30);

        String result = person.getNameInUpperCase();

        assertEquals("DAVID", result);
    }

    @Test
    void shouldReturnTrueWhenPersonIsAdult() {
        Person person = new Person("Anna", 25);

        assertTrue(person.isAdult());
    }

    @Test
    void shouldReturnFalseWhenPersonIsNotAdult() {
        Person person = new Person("Marc", 16);

        assertFalse(person.isAdult());
    }

    @Test
    void shouldThrowExceptionWhenAgeIsNegativeOrZero() {
        assertThrows(IllegalArgumentException.class, () ->
            new Person("Test", -1));

        assertThrows(IllegalArgumentException.class, () ->
            new Person("Test", 0));
    }
}
