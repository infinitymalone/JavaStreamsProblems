package levelEasy1;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElements {
    /**
     * Find the Sum of all the elements in a list
     */
    public static void getSum(){
        List<Integer> nums = Arrays.asList(1,2,4,4,55,55,34,34,343,3,4,34);
        Integer i = nums.stream().reduce(Integer::sum).orElse(0);
        System.out.println(i);
    }

    public static void main(String[] args) {
        getSum();
    }
}
