package levelIntermediate2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    /**
     * Find the first non-repeating character in a stream
     */
    public static void fetchNonRepeating() {
        String str = "swiss";
        // output --> w

        Optional<Map.Entry<Character, Long>> first = str.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x -> x.getValue() == 1).findFirst();

        if (first.isPresent()) {
            System.out.println(first.get().getKey());
        } else {
            System.out.println("NIL");
        }

    }

    public static void main(String[] args) {
        fetchNonRepeating();
    }
}
