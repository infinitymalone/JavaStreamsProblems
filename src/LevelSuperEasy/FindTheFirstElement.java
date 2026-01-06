package LevelSuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheFirstElement {

    /**
     * Find the first number greater than 10 from a List
     */
    public static void fetchNumber(){
        List<Integer> nums = Arrays.asList(1,4,5,2,22,3,233,2323,3232,232,3);
        Integer i = nums.stream().filter(x -> x > 10).findFirst().orElse(0);
        System.out.println(i);
    }

    public static void main(String[] args) {
        fetchNumber();
    }

}
