package com.example.service;

import com.example.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public String saveEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(String id);
    public Optional<Employee> getOneEmployee(String id);
    public List<Employee> getAllEmployee();
    public boolean isEmployeeExist(String empId);
}
