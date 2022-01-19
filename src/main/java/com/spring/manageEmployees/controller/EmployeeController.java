package com.spring.manageEmployees.controller;

import com.spring.manageEmployees.domain.Employee;
import com.spring.manageEmployees.service.EmployeeService;
import com.spring.manageEmployees.service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employeeList")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employeeAdded")
    public void createNewEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
    }

    @PutMapping("/updateEmployee")
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }
}
