package employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    String name;
    long salary;
    String month;

    public Employee(String name, long salary, String month) {
        this.name = name;
        this.salary = salary;
        this.month = month;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }

    public static void main(String[] args) {
        List<Employee> empDetails = Arrays.asList(
                new Employee("Ashok", 100, "Jan 2020"),
                new Employee("Srikanth", 150, "Feb 2020"),
                new Employee("Ram", 10, "April 2020"),
                new Employee("Ashok", 150, "July 2022"),
                new Employee("Srikanth_1", 20, "Dec 2022"),
                new Employee("Srikanth", 400, "Jan 2023")
        );
        Map<String, Long> listEmpDetails =  getConsolidatedSalary(empDetails);
        listEmpDetails.forEach((name,salary) ->
                System.out.println("Employee " + name + "Total salary " + salary));

    }

    public static Map<String, Long> getConsolidatedSalary(List<Employee> empDetails) {
        // Group employees by name and sum their salaries
        return empDetails.stream()
                .collect(Collectors.groupingBy(Employee::getName,
                        Collectors.summingLong(Employee::getSalary)));
    }
}
