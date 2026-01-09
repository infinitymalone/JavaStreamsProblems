package utils;

public class Person {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int age;

    public String toString() {
        return name + age;
    }
}
