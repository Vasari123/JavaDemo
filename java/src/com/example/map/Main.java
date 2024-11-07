package com.example.map;

public class Main {
    public static void main(String[] args) {
        CustomHashMap employeeMap = new CustomHashMap();

        Employee emp1 = new Employee(1, "Alice");
        Employee emp2 = new Employee(2, "Bob");
        Employee emp3 = new Employee(3, "Charlie");

        employeeMap.put(emp1.getId(), emp1);
        employeeMap.put(emp2.getId(), emp2);
        employeeMap.put(emp3.getId(), emp3);

        System.out.println(employeeMap.get(1)); // Output: Employee{id=1, name='Alice'}
        System.out.println(employeeMap.get(2)); // Output: Employee{id=2, name='Bob'}

        employeeMap.remove(2);
        System.out.println(employeeMap.get(2)); // Output: null
    }
}
