package com.spring.manageEmployees.service;

import com.spring.manageEmployees.domain.Employee;
import com.spring.manageEmployees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

//    @Autowired - fieldul trebuie sa fie doar private, nu si final.
    private final EmployeeRepository employeeRepository;

    @Autowired //dar se poate si fara
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void createEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id){
        employeeRepository.deleteById(id);
    }

    @Override
    public void updateEmployee(Employee employee){
        Employee employee1 = employeeRepository.getById(employee.getId());
        employee1.setAge(employee.getAge());
        employee1.setDepartment(employee.getDepartment());
        employee1.setName(employee.getName());
        employee1.setSalary(employee.getSalary());
        employeeRepository.save(employee1);
    }


//    @Autowired
//    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
}
