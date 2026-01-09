package levelEasy2;

import java.util.Comparator;
import java.util.stream.Stream;

public class SecondHighest {
    /**
     * Find the second-highest number from the list
     */
    public static void fetchSecondHighest(){
        Integer i = Stream.of(1,2,33,4)
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(-1);

//        Stream.of(2, 232333, 212, 122, 2, 423, 2323, 23, 2)
//                .sorted(Comparator.reverseOrder())
//                .skip(1).findFirst().get();
        System.out.println(i);
    }

    public static void main(String[] args) {
        fetchSecondHighest();
    }
}
