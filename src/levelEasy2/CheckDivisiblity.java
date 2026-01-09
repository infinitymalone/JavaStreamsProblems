package levelEasy2;

import java.util.Arrays;
import java.util.List;

public class CheckDivisiblity {
    /**
     * Check if any number in a list is divisible by k
     */
    public static void checkIfDivisible(int num) {
        List<Integer> nums = Arrays.asList(22, 44, 55, 66, 123, 232, 2);
        boolean b = nums.stream().anyMatch(x -> x % num == 0);
        if (b) {
            System.out.println("Divisible by " + num);
        } else {
            System.out.println("Not divisible by " + num);
        }
    }

    public static void main(String[] args) {
        checkIfDivisible(7);
    }
}
