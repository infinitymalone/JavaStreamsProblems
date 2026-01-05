package LevelSuperEasy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Filter even numbers
 */
public class FilterEvenNumbers {

    public static void filterEven() {
        System.out.println(Stream.iterate(1, x -> x + 1).limit(20).filter(y -> y % 2 == 0).collect(Collectors.toList()));
        ;
    }

    public static void main(String[] args) {
        filterEven();
    }
}
