package levelEasy2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistinct {
    /**
     * Find All Distinct Elements from a list
     */
    public static void fetchDistinct() {
        List<Integer> nums = Arrays.asList(1, 2, 2, 2, 3, 3, 4, 4, 4);

        List<Integer> collect = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        fetchDistinct();
    }
}

