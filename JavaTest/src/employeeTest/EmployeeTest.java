package employeeTest;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jennifer", 22, "Female", "HR", 2017, 55000.0));
        employeeList.add(new Employee(112, "Rohit", 35, "Male", "Sales And Marketing", 2019, 23500.0));
        employeeList.add(new Employee(113, "Shubman", 29, "Male", "Infrastructure", 2019, 28000.0));
        employeeList.add(new Employee(114, "Rinku", 28, "Male", "Product Development", 2020, 62500.0));
        employeeList.add(new Employee(115, "Aaditi", 41, "Female", "HR", 2022, 29700.0));
        employeeList.add(new Employee(116, "Mahendra", 43, "Male", "Security And Transport", 2023, 20500.0));
        employeeList.add(new Employee(117, "Nitish", 35, "Male", "Account And Finance", 2019, 37000.0));
        employeeList.add(new Employee(118, "Aditya", 31, "Male", "Product Development", 2019, 34500.0));
        employeeList.add(new Employee(119, "Monika", 24, "Female", "Sales And Marketing", 2021, 21500.0));
        employeeList.add(new Employee(120, "Aman", 38, "Male", "Security And Transport", 2021, 31000.5));
        employeeList.add(new Employee(121, "Sangeeta", 27, "Female", "Infrastructure", 2021, 35000.0));
        employeeList.add(new Employee(122, "Joshi", 25, "Male", "Product Development", 2020, 29000.0));
        employeeList.add(new Employee(123, "Jeddy", 27, "Female", "Account And Finance", 2020, 29000.0));
        employeeList.add(new Employee(124, "Niden", 24, "Male", "Sales And Marketing", 2020, 30200.5));
        employeeList.add(new Employee(125, "Saig", 23, "Male", "Infrastructure", 2019, 42700.0));
        employeeList.add(new Employee(126, "Saey", 26, "Female", "Product Development", 2018, 38900.0));
        employeeList.add(new Employee(127, "Shreyas", 25, "Male", "Product Development", 2018, 35700.0));

        /*How many employees are there in the organization?*/
        long count = employeeList.stream().count();
        System.out.println("The employees are there in the organization " + count);

        System.out.println("------------------------");
        /*Sort the List of Employee objects based on salary in Ascending order*/
        List<Employee> employeesSortedList2 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(employeesSortedList2);

        System.out.println("-------------------------");
       /* Sort the List of Employee objects based on salary in Descending order*/
        List<Employee> employeesSortedList2Descending = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println(employeesSortedList2Descending);


        System.out.println("---------------------------");
        /*How many male and female employees are there in the organization*/
        Map<String,Long> noMaleAndFemale =  employeeList.stream().collect(Collectors.
                groupingBy(Employee::getGender,
                Collectors.counting()));
        System.out.println("Number of male and female employees are " + noMaleAndFemale);

        System.out.println("-------------------------");
        /*How many employees are there in each department*/
        Map<String, Long> employeeCountByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));
        System.out.println("Number of employee in each department are " + employeeCountByDepartment);

        System.out.println("------------------------------");
        /*Get the name of all the department*/
        List<String> departments = employeeList.stream().map(Employee::getDepartment).distinct()
                .toList();
        System.out.println("Name of all the departments" + departments);

        System.out.println("--------------------------");
        /*Find the average salary of the male and female employee*/
        Map<String,Double> empAverageSalary =  employeeList.stream().collect(Collectors.groupingBy(Employee::getGender
        ,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average Salary of male and female employees are " + empAverageSalary);

        System.out.println("----------------------------");
        /*Fetch the highest-paid male and female employee*/
        Map<String, Optional<Employee>> maxSalaryMaleAndFemaleEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));
        System.out.println("Highest paid male and female employee: " + maxSalaryMaleAndFemaleEmployee);

        System.out.println("-----------------------------");
       /* Fetch the lowest-paid male and female employee*/
        Map<String, Optional<Employee>> minSalaryMaleAndFemaleEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))
                ));
        System.out.println("Highest paid male and female employee: " + minSalaryMaleAndFemaleEmployee);

        System.out.println("-----------------------------");
        /*Get the highest-paid employee in each department*/
        Map<String, Optional<Employee>> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("Highest paid employee in each department ");
        for (Map.Entry<String, Optional<Employee>> e : collect.entrySet()) {
            System.out.println("-----------------------");
            System.out.println(e.getKey());
            System.out.println(e.getValue().get());
        }

        System.out.println("--------------------------");
        /*Get the details of the highest paid employee in the organization*/
        Optional<Employee> highestPaidEmployeeWrapper= employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
        System.out.println("Details Of Highest Paid Employee : ");
        System.out.println("---------------------------------------");
        System.out.println("Employee : "+highestPaidEmployee);

        System.out.println("-------------------------");
        /*Find the average salary of each department*/
        Map<String, Double> avgSalaryOfDepartments=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();
        System.out.println("Average salary of each department\n");
        for (Map.Entry<String, Double> entry : entrySet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("-------------------------------");
        /*Get the details of the youngest male employee in the product development department*/
        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
                employeeList.stream()
                        .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
                        .min(Comparator.comparingInt(Employee::getAge));
        Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();
        System.out.println("Details Of Youngest Male Employee In Product Development");
        System.out.println("----------------------------------------------");
        System.out.println("Employee : "+youngestMaleEmployeeInProductDevelopment);

        System.out.println("------------------------------");
        /*Who has the most working experience in the organization*/
        Optional<Employee> seniorMostEmployeeWrapper=
                employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));

        Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
        System.out.println("Senior Most Employee Details :");
        System.out.println("----------------------------");
        System.out.println("Employee : "+seniorMostEmployee);

        System.out.println("---------------------------");
        /*Who is the oldest employee in the organization*/
        Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmployeeWrapper.get();
        System.out.println("Oldest employee in the organization");
        System.out.println("--------------------------------");
        System.out.println(oldestEmployee);

        System.out.println("-------------------------");
        /*What is the average salary and total salary of the whole organization*/
        DoubleSummaryStatistics employeeSalaryStatistics=
                employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
        System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());

        System.out.println("----------------------");
        /*List down the names of all employees in each department*/
        Map<String, List<Employee>> employeeListByDepartment=
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entrySet1 = employeeListByDepartment.entrySet();
        for (Map.Entry<String, List<Employee>> entry : entrySet1){
            System.out.println("--------------------------------------");
            System.out.println("Employees In "+entry.getKey() + " : ");
            System.out.println("--------------------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list){
                System.out.println(e.getName());
            }
        }

        System.out.println("-------------------------");
        /*Separate the employees who are younger or equal to 30 years from those older than 30 years.*/
        Map<Boolean, List<Employee>> partitionEmployeesByAge=
                employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));

        Set<Map.Entry<Boolean, List<Employee>>> entrySet2 = partitionEmployeesByAge.entrySet();

        for (Map.Entry<Boolean, List<Employee>> entry : entrySet2) {
            System.out.println("----------------------------");

            if (entry.getKey()) {
                System.out.println("Employees older than 30 years :");
            }
            else {
                System.out.println("Employees younger than or equal to 30 years :");
            }

            System.out.println("----------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }

    }
}
