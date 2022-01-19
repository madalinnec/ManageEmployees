package com.spring.manageEmployees.repository;


import com.spring.manageEmployees.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
