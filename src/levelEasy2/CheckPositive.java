package levelEasy2;

import java.util.Arrays;
import java.util.List;

public class CheckPositive {
    /**
     * Check if all numbers are positive in a list.
     */
    public static void checkPositive() {
//        List<Integer> nums = Arrays.asList(1, 2, -2, 22, -33);
        List<Integer> nums = Arrays.asList(1, 2, 2, 22, 33);
        boolean b = nums.stream().allMatch(x -> x >= 0);
        if (b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        checkPositive();
    }

}
