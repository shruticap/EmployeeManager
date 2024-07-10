package com.example.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.employeemanager.model.Employee;
import com.example.employeemanager.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional  // Enables transaction management for database operations
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Method to retrieve all employees from the database
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    // Method to retrieve a single employee by their ID
    public Employee findEmployeeById(Long id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        return optionalEmployee.orElse(null);
    }

    // Method to save (create or update) an employee in the database
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Method to delete an employee from the database by their ID
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
