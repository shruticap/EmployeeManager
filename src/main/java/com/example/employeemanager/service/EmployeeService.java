package com.example.employeemanager.service;

import com.example.employeemanager.model.*;
import com.example.employeemanager.repository.*;

import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> findById(Long id){
		return employeeRepository.findById(id);
	}
	
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void deleteById(Long id) {
		return employeeRepository.deleteById(id);
	}

}
