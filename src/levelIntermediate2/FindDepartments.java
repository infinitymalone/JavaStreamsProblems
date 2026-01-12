package levelIntermediate2;

import utils.Employees;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDepartments {
    /**
     * 1. Find All Departments with more than two employees
     * 2. Find Department with Highest average Salary
     */
    static List<Employees> employees = Arrays.asList(new Employees("Alice", 1, 5000, "HR"), new Employees("Bob", 2, 50000, "HR"), new Employees("Charlie", 3, 500, "IT"), new Employees("Elisa", 5, 800, "MKT"), new Employees("Frank", 6, 5000, "MKT"), new Employees("Gabby", 6, 5000, "MKT"), new Employees("Hilton", 6, 5000, "HR"));

    public static void findDeptWithSizeGt2() {


        List<String> collect = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 2).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void findHighestAvgSalaryOfDept() {

//        System.out.println(employees.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingDouble(Employees::getSalary))));

        String key = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingDouble(Employees::getSalary))).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();

        System.out.println(key);
    }

    public static void main(String[] args) {
        // 1
        findDeptWithSizeGt2();

        // 2
        findHighestAvgSalaryOfDept();


    }
}
