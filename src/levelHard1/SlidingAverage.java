package levelHard1;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SlidingAverage {
    /**
     * Given s list of integers, compute the average of every 3-elements sliding window
     * list -> 3,4,5,6,7,8,9
     * output -> 4, 5, 6,
     */

    public static void fetchAverage() {
        List<Integer> nums = Arrays.asList(3, 4, 5, 6, 7, 8, 9);
        System.out.println(nums);
        List<Integer> collect = Stream.iterate(0, x -> x + 1).
                limit(nums.size() - 2)
                .map(x -> (nums.get(x) + nums.get(x + 1) + nums.get(x + 2)) / 3)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        fetchAverage();
    }
}
