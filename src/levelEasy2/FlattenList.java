package levelEasy2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {

    /**
     * Flatten the list of list
     */
    public static void flattenList() {
        List<List<Integer>> nums = Arrays.asList(
                Arrays.asList(1, 343, 33, 4),
                Arrays.asList(13, 5343, 433, 24),
                Arrays.asList(1232, 34233, 33323, 4232),
                Arrays.asList(1232, 32323243, 232333, 43223)
        );

        List<Integer> collect = nums.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        flattenList();
    }

}
