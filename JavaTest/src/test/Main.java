package test;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "emp1", 22));
        empList.add(new Employee(2, "emp2", 28));
        empList.add(new Employee(3, "emp3", 45));
        empList.add(new Employee(4, "emp4", 45));

        Map<Integer, List<Employee>> ageOfEmployees = empList.stream()
                .collect(Collectors.groupingBy(Employee::getAge));
        ageOfEmployees.forEach((age,employees) -> System.out.println(age +" :" + employees));
    }
}
