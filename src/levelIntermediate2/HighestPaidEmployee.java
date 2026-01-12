package levelIntermediate2;

import utils.Employees;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmployee {

    /**
     * Find the highest paid employee in each department
     */
    public static void fetchHighestPaidEmpByDep(){
        List<Employees> employees = Arrays.asList(
                new Employees("Alice", 1, 5000, "HR"),
                new Employees("Bob", 2, 50000, "HR"),
                new Employees("Charlie", 3, 500, "IT"),
                new Employees("Darwin", 4, 100, "IT"),
                new Employees("Elisa", 5, 800, "MKT"),
                new Employees("Frank", 6, 5000, "MKT")
        );

        Map<String, Optional<Employees>> collect = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.maxBy(Comparator.comparing(Employees::getSalary))));

//        collect.entrySet().stream().
        System.out.println(collect);
    }

    public static void main(String[] args) {
        fetchHighestPaidEmpByDep();
    }
}
