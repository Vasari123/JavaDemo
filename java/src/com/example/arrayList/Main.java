package com.example.arrayList;

public class Main {
    public static void main(String[] args) {
        CustomArrayList employeeList = new CustomArrayList();

        Employee emp1 = new Employee(1, "Alice");
        Employee emp2 = new Employee(2, "Bob");
        Employee emp3 = new Employee(3, "Charlie");

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        System.out.println("Employees: " + employeeList); // Output: Employees: [Employee{id=1, name='Alice'}, Employee{id=2, name='Bob'}, Employee{id=3, name='Charlie'}]

        System.out.println("Employee at index 1: " + employeeList.get(1)); // Output: Employee at index 1: Employee{id=2, name='Bob'}

        employeeList.remove(1); // Remove Bob
        System.out.println("After removing index 1: " + employeeList); // Output: After removing index 1: [Employee{id=1, name='Alice'}, Employee{id=3, name='Charlie'}]

        System.out.println("Size of the list: " + employeeList.size()); // Output: Size of the list: 2
    }
}
