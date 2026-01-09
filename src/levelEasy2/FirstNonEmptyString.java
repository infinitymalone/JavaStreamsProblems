package levelEasy2;

import java.util.Arrays;
import java.util.List;

public class FirstNonEmptyString {
    /**
     * Find the first non-empty string in a list
     */
    public static void findFirstNonEmptyString() {
        List<String> names = Arrays.asList(" ", "", "tushar");
        String s = names.stream().filter(x -> !x.trim().isEmpty()).findFirst().orElse("-1");
        System.out.println(s);
    }

    public static void main(String[] args) {
        findFirstNonEmptyString();
    }
}
