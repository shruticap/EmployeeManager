package com.example.employeemanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String employeeName;
    private BigDecimal salary;
    private String departmentName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dbupdatedate")
    private Date dbUpdateDate;

    public Employee() {
    }

    public Employee(String employeeName, BigDecimal salary, String departmentName, Date dbUpdateDate) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.departmentName = departmentName;
        this.dbUpdateDate = dbUpdateDate;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getDbUpdateDate() {
        return dbUpdateDate;
    }

    public void setDbUpdateDate(Date dbUpdateDate) {
        this.dbUpdateDate = dbUpdateDate;
    }
}
