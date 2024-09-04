package com.example.service;

import com.example.model.Employee;
import com.example.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo repo;
    @Override
    public String saveEmployee(Employee employee) {
        return repo.save(employee).getEmpId();
    }
    @Override
    public void updateEmployee(Employee employee) {
      repo.save(employee);
    }
    @Override
    public void deleteEmployee(String id) {

        repo.deleteById(id);
    }
    @Override
    public Optional<Employee> getOneEmployee(String id) {
        return repo.findById(id);
    }
    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }
    @Override
    public boolean isEmployeeExist(String id) {
        return repo.existsById(id);
    }
}
