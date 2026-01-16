package levelHard2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigramFrequency {
    /**
     * Find Bigram Frequency (Pair of two Consecutive words) in a Paragraph
     */

    public static void fetchBigram(){
        String input = "Natural language processing helps computers understand human language and language patterns. Language processing techniques analyze text data to identify patterns, improve language understanding, and build intelligent systems.";

        String[] s = input.toLowerCase().replaceAll("[^a-zA-z \\s]", "").split(" ");
//        System.out.println(Arrays.toString(s));
        System.out.println(
                IntStream.range(0,s.length-1).mapToObj(x->s[x] + " " + s[x+1]).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).get()
        );




    }

    public static void main(String[] args) {
        fetchBigram();
    }
}
