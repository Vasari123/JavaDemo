package interview;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryConsolidation {

    public static Map<String, Long> getConsolidatedSalary(List<Employee> empDetails) {
        // Group employees by name and sum their salaries
        return empDetails.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.summingLong(Employee::getSalary)));
    }

    public static void main(String[] args) {
        // Sample data
        List<Employee> empDetails = Arrays.asList(
                new Employee("Ashok", 100, "Jan 2020"),
                new Employee("Srikanth", 150, "Feb 2020"),
                new Employee("Ram", 10, "April 2020"),
                new Employee("Ashok", 150, "July 2022"),
                new Employee("Srikanth_1", 20, "Dec 2022"),
                new Employee("Srikanth", 400, "Jan 2023")
        );

        // Get consolidated salary map
        Map<String, Long> consolidatedSalary = getConsolidatedSalary(empDetails);

        // Print out consolidated salary for each employee
        consolidatedSalary.forEach((name, salary) ->
                System.out.println("Employee: " + name + ", Total Salary: $" + salary)
        );
    }
}
