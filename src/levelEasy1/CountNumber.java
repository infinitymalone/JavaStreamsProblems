package levelEasy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountNumber {
    /**
     * Count how many numbers are greater than n
     */
    public static void getCount(int n){
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,232,33,232,2,323,232,322,32));
        Long collect = nums.stream().filter(x -> x > n).count();
        System.out.println(collect);
    }

    public static void main(String[] args) {
        getCount(5);
    }
}
