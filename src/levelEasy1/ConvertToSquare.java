package levelEasy1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToSquare {
    /**
     * Convert numbers in List to their Square
     */
    public static void convertToSquare(){
        List<Integer> collect = Stream.of(2, 4, 3, 5, 6, 4, 3).map(x -> x * x).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        convertToSquare();
    }
}
