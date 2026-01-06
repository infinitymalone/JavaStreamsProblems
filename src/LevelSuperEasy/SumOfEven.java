package LevelSuperEasy;

import java.util.Arrays;
import java.util.List;

public class SumOfEven {
    /**
     * Find the Sum of even numbers in a List
     */
    public static void getSum(){
        List<Integer>nums = Arrays.asList(1,2,3,4,5,6,7,8,9,22,33,44,55,66,77,77);
        Integer i = nums.stream().filter(x -> x % 2 == 0).reduce(Integer::sum).orElse(0);
        System.out.println(i);
    }

    public static void main(String[] args) {
        getSum();
    }
}
