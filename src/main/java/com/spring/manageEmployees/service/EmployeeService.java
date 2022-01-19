package com.spring.manageEmployees.service;

import com.spring.manageEmployees.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void createEmployee(Employee employee);
    void deleteEmployee(Integer id);
    void updateEmployee(Employee employee);
}
