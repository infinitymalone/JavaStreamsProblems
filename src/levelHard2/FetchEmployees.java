package levelHard2;

import utils.Employees;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FetchEmployees {
    /**
     * Fetch Employees who worked in 3+ departments
     */
    public static void fetch() {
        List<Employees> employees = Arrays.asList(
                new Employees("Alice", 1, 5000, "HR"),
                new Employees("Ana", 2, 50000, "HR"),
                new Employees("Charlie", 3, 500, "IT"),
                new Employees("Celina", 4, 800, "MKT"),
                new Employees("Frank", 5, 5000, "MKT"),
                new Employees("Gabby", 6, 5000, "MKT"),
                new Employees("Hilton", 7, 5000, "HR"),
                new Employees("Hugh", 8, 5000, "HR"),
                new Employees("Henry", 9, 5000, "HR")
        );

        List<List<Employees>> collect = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment)).entrySet().stream()
                .filter(x -> x.getValue().size() > 3).map(Map.Entry::getValue).collect(Collectors.toList());
        System.out.println(collect);

    }

    public static void main(String[] args) {
        fetch();
    }
}
