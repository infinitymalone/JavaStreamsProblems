package levelIntermediate1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByOddEven {

    /**
     * Partition numbers by Odd/Even in a List
     */
    public static void partitionByOddEven(){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);

        Map<Boolean, List<Integer>> collect = nums.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(collect);
    }

    public static void main(String[] args) {
        partitionByOddEven();
    }
}
