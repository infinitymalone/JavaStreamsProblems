package LevelSuperEasy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareEven {
    /**
     * Square Even Numbers from a List
     */
    public static void squareEven(){
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(10)
                .filter(y -> y % 2 == 0)
                .map(z -> z * z)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        squareEven();
    }
}
