package com.spring.manageEmployees.domain;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Integer id;
    private String name;
    private Integer age;
    private String department;
    private Double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

