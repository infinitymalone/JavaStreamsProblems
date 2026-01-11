package levelIntermediate1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceProblem {
    /**
     * Count the occurrence of each element/Word/Alphabet in a list
     */
    public static void checkOccurrence() {
        // Count Elements
        List<Integer> nums = Arrays.asList(1, 2, 2, 33, 33, 3, 3, 44, 5, 5);
        Map<Integer, Long> collect = nums.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);

        // Count Alphabets
        String str = "wewiehwuweeewdskklsldvsfdafdafdfdkoamfkofmna";
        Map<Character, Long> collect1 = str.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

        //Count Words
        String str2 = "my name is tushar rawat tushar may name";
        Map<String, Long> collect2 = Arrays.stream(str2.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);
    }

    public static void main(String[] args) {
        checkOccurrence();
    }

}
