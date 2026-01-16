package levelHard2;

import utils.Employees;
import utils.enums.SalaryRange;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Categorize {
    /**
     * Categorize Employees by their salary
     * LOW --> <20,000
     * Medium --> >20,000 && <100,000
     * High ---> >100,000
     */
    public static void categorize() {
        List<Employees> employees = Arrays.asList(
                new Employees("Alice", 1, 5000),
                new Employees("Bob", 2, 6000),
                new Employees("Catelina", 3, 88000),
                new Employees("Doug", 4, 50000),
                new Employees("Elina", 5, 125000),
                new Employees("France", 6, 125000)
        );

        Map<SalaryRange, List<Employees>> collect = employees.stream().collect(Collectors.groupingBy(Categorize::fetchSalaryRange));
        System.out.println(collect);

    }

    public static SalaryRange fetchSalaryRange(Employees x) {
        if (x.getSalary() <= 20000) return SalaryRange.LOW;
        if (x.getSalary() > 20000 && x.getSalary() < 100000) return SalaryRange.MEDIUM;
        else return SalaryRange.HIGH;
    }

    public static void main(String[] args) {
        categorize();
    }
}
