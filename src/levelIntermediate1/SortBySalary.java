package levelIntermediate1;

import utils.Employees;

import java.util.*;
import java.util.stream.Collectors;

public class SortBySalary {

    /**
     * Sort List of Employees by Salary
     */
    public static void sortBySalary() {
        List<Employees> employees = Arrays.asList(
                new Employees("Alice", 1, 5000),
                new Employees("Bob", 2, 6000),
                new Employees("Catelina", 3, 88000),
                new Employees("Doug", 4, 500),
                new Employees("Elina", 5, 125000),
                new Employees("France", 6, 50000)
        );

        // Ascending
        List<Employees> collectA = employees.stream().sorted(Comparator.comparing(Employees::getSalary)).collect(Collectors.toList());

        // Descending
        List<Employees> collectD = employees.stream().sorted(Comparator.comparing(Employees::getSalary).reversed()).collect(Collectors.toList());

        // fetch Salary above 50,000
        List<Employees> collect = employees.stream().filter(x -> x.getSalary() > 50000).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println(collectA);
        System.out.println(collectD);
    }

    public static void main(String[] args) {
        sortBySalary();
    }
}
