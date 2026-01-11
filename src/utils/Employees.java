package utils;

public class Employees {
    public String toString() {
        return id + "-" + name + "-" + salary + "-" + department;
    }

    public Employees(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employees(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    private String name;
    private double salary;
    private int id;
    private String department;

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }


}
