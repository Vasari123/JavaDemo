package com.example.controller;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // 1. Add a new employee
    @PostMapping("/save")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
        try {
            // Check if the employee ID already exists
            if (employee.getEmpId() != null && service.isEmployeeExist(employee.getEmpId())) {
                return new ResponseEntity<>("Employee with ID '" + employee.getEmpId() + "' already exists", HttpStatus.BAD_REQUEST);
            } else {
                // Save the new employee
                String id = service.saveEmployee(employee);
                return new ResponseEntity<>("Employee '" + id + "' created successfully!", HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Unable to save Employee", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 2. Get an employee by ID
    @GetMapping("/one/{id}")
    public ResponseEntity<?> getOneEmployee(@PathVariable String id) {
        try {
            Optional<Employee> employee = service.getOneEmployee(id);
            if (employee.isPresent()) {
                return new ResponseEntity<>(employee.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Employee with ID '" + id + "' does not exist", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Unable to fetch Employee", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 3. Get all employees
    @GetMapping("/all")
    public ResponseEntity<?> getAllEmployees() {
        try {
            List<Employee> employees = service.getAllEmployee();
            return new ResponseEntity<>(employees, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Unable to fetch Employees", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 4. Update an existing employee
    @PutMapping("/modify")
    public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) {
        try {
            if (employee.getEmpId() != null && service.isEmployeeExist(employee.getEmpId())) {
                service.updateEmployee(employee);
                return new ResponseEntity<>("Employee '" + employee.getEmpId() + "' updated successfully", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Employee with ID '" + employee.getEmpId() + "' does not exist", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Unable to update Employee", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 5. Delete an employee by ID
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> removeEmployee(@PathVariable String id) {
        try {
            if (service.isEmployeeExist(id)) {
                service.deleteEmployee(id);
                return new ResponseEntity<>("Employee with ID '" + id + "' deleted successfully", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Employee with ID '" + id + "' does not exist", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Unable to delete Employee", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
