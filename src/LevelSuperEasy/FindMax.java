package LevelSuperEasy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMax {
    /**
     * Find the Max number in a List
     */
    public static void getMax(){
        List<Integer> nums = Arrays.asList(1,21212,12,122,22,1212,12,22121,12,8999999);
        Integer i = nums.stream().sorted((a, b) -> b - a).findFirst().orElse(0);
        Integer i2 = nums.stream().reduce(Integer::max).orElse(0);
        System.out.println(i);
        System.out.println(i2);
    }

    public static void main(String[] args) {
        getMax();
    }
}
