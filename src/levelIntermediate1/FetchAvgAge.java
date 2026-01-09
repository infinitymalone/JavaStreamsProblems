package levelIntermediate1;

import utils.Person;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FetchAvgAge {
    /**
     * Fetch Avg age from Person obj
     */
    public static void fetchAge() {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 50),
                new Person("Bob", 44),
                new Person("Cathy", 34)
        );
        double average = persons.stream().mapToInt(Person::getAge).average().orElse(-1);
        System.out.println(average);

    }

    public static void main(String[] args) {
        fetchAge();
    }
}
