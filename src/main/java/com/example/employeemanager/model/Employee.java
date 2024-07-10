package com.example.employeemanager.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	private String employeeName;
	private Double salary;
	private String departmentName;
	public long getEmployeeId() {
		return employeeId;
	}
	
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public LocalDate getDbUpdatedate() {
		return dbUpdatedate;
	}
	public void setDbUpdatedate(LocalDate dbUpdatedate) {
		this.dbUpdatedate = dbUpdatedate;
	}
	private LocalDate dbUpdatedate;
}
