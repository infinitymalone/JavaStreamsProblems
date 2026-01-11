package levelIntermediate1;

import utils.Employees;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndAvgProblem {
    /**
     * Group Employees by Department and count average Salary
     */
    public static void mapDepartment() {
        List<Employees> employees = Arrays.asList(
                new Employees("Alice", 1, 5000, "HR"),
                new Employees("Bob", 2, 50000, "HR"),
                new Employees("Charlie", 3, 500, "IT"),
                new Employees("Darwin", 4, 100, "IT"),
                new Employees("Elisa", 5, 800, "MKT"),
                new Employees("Frank", 6, 5000, "MKT")
        );

        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment,Collectors.averagingDouble(Employees::getSalary)));
        System.out.println(collect);
    }

    public static void main(String[] args) {
        mapDepartment();
    }

}
