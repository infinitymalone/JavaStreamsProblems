package levelEasy2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAllString {
    /**
     * Join all strings in a list into a  single comma-separated string
     */
    public static void joinAll() {
        List<String> list = Arrays.asList("Apple", "Banana", "Mango", "Peach", "DragonFruit");
        String collect = list.stream().collect(Collectors.joining(","));
        System.out.println(collect);
    }

    public static void main(String[] args) {
        joinAll();
    }
}
