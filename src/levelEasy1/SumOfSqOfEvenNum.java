package levelEasy1;

import java.util.stream.Stream;

public class SumOfSqOfEvenNum {
    /**
     * Find the sum of the Squares of even numbers in a list
     */
    public static void fetchSum(){
        Integer reduce = Stream.of(2, 5, 35, 3, 6, 8, 5)
                .filter(x -> x % 2 == 0)
                .map(y -> y * y)
                .reduce(Integer::sum).orElse(0);
        System.out.println(reduce);
    }

    public static void main(String[] args) {
        fetchSum();
    }
}
