package interview;

public class Employee {
    String name;
    long salary;
    String month;

    // Constructor, getters, and setters
    public Employee(String name, long salary, String month) {
        this.name = name;
        this.salary = salary;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public String getMonth() {
        return month;
    }
}
