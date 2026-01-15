package levelHard1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestWordI {
    /**
     * Find the longest word in a sentence / Para
     */
    public static void fetchLong() {
        String str = "My name is Custer";

        String s = Arrays.stream(str.toLowerCase().split(" ")).max(Comparator.comparing(String::length)).orElse(null);

        System.out.println(s);
    }

    public static void main(String[] args) {
        fetchLong();
    }
}
