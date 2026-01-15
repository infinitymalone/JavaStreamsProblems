package levelHard1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWord {
    /**
     * Reverse each word in a string
     */
    public static void rev(){
        String input = "Streams Demo";

        List<StringBuilder> collect = Arrays.stream(input.replaceAll("[^a-z A-Z\\s]", "").split(" "))
                .map(x -> new StringBuilder(x).reverse()).collect(Collectors.toList());
        System.out.println(collect);

    }

    public static void main(String[] args) {
        rev();
    }
}
