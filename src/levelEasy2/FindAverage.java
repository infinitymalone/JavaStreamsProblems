package levelEasy2;

import java.util.ArrayList;
import java.util.List;

public class FindAverage {
    /**
     * Find the Average of all the numbers in a list
     */
    public static void fetchAverage() {
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 77);
        List<Integer> nums = new ArrayList<>();
        double v = nums.stream().mapToInt(Integer::intValue).average().orElse(-1);
        System.out.println(v);
    }

    public static void main(String[] args) {
        fetchAverage();
    }
}
