package levelEasy2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortList {
    /**
     * Sort a List in Ascending and Descending Order
     */
    public static void sortList() {

        // Ascending
        List<Integer> collect = Stream.of(1, 42, 323, 34, 352, 52, 324, 234).sorted().collect(Collectors.toList());
        System.out.println(collect);


        // Descending
        List<Integer> collect1 = Stream.of(1, 42, 323, 34, 352, 52, 324, 234)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(collect1);

    }

    public static void main(String[] args) {
        sortList();
    }
}
