package utils;

public class Employees {
    public String toString() {
        return id + "-" + name + "-" + salary;
    }

    public Employees(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    private String name;
    private double salary;
    private int id;

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }


}
