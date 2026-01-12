package levelIntermediate2;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentChar {
    /**
     * Find the most frequent character in a string
     */
    public static void fetchFrequent(){
        String str = "THE KING IN THE NORTH";
        Map<Character, Long> collect = str.replace(" ", "").toLowerCase().chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        Character key = collect.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
        System.out.println(key);

    }

    public static void main(String[] args) {
        fetchFrequent();
    }

}
