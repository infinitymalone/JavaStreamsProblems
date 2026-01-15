package levelHard1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    /**
     * Find top 3 most frequent words in a para
     */
    public static void fetchFrequent() {
        String input = "Natural language processing helps computers understand human language and language patterns. Language processing techniques analyze text data to identify patterns, improve language understanding, and build intelligent systems.";

        String key = Arrays.stream(input.toLowerCase().replaceAll("[^a-z\\s]", "").split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).orElse(null).getKey();
        System.out.println(key);
    }

    public static void main(String[] args) {
        fetchFrequent();
    }
}
