package levelHard1;

import utils.Employees;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CommonFirstLetter {
    /**
     * Find the most common first letter among all employee names
     */
    static List<Employees> employees = Arrays.asList(
            new Employees("Alice", 1, 5000, "HR"),
            new Employees("Ana", 2, 50000, "HR"),
            new Employees("Charlie", 3, 500, "IT"),
            new Employees("Celina", 5, 800, "MKT"),
            new Employees("Frank", 6, 5000, "MKT"),
            new Employees("Gabby", 6, 5000, "MKT"),
            new Employees("Hilton", 6, 5000, "HR"),
            new Employees("Hugh", 6, 5000, "HR"),
            new Employees("Henry", 6, 5000, "HR")
    );

    public static void fetchCommonLetter(){
        Map<Character, Long> collect = employees.stream().map(Employees::getName).collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));
        System.out.println(collect);

        Character key = collect.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
        System.out.println(key);
    }

    public static void main(String[] args){
        fetchCommonLetter();
    }

}
