package levelEasy2;

import java.util.Arrays;
import java.util.List;

public class CountLetters {
    /**
     * Count how many words starts with a specific character
     */
    public static void countWords(String c) {
        List<String> list = Arrays.asList("Apple", "Banana", "Mango", "Peach", "DragonFruit");
        long count = list.stream().filter(x -> x.toLowerCase().startsWith(c.toLowerCase())).count();

        System.out.println(count);
    }

    public static void main(String[] args) {
        countWords("m");
    }

}
