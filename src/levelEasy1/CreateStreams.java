package levelEasy1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * How do you create streams ?
 */
public class CreateStreams {
    public static void createStream() {
        List<String> names = Arrays.asList("A", "B", "C");
//        1. list to stream
        names.stream();

//        2.array to stream
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr);

//        3.using stream.of
        Stream.of(1, 2, 3, 45);

//        4.using generate
        Stream<Double> limit = Stream.generate(Math::random).limit(10);
    }

    public static void main(String[] args) {
        createStream();
    }
}
