package com.justAJob.demo.model;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private double salary;
    private String department;
    private String role;
    private Address address;
    private String tel;

    public Employee(String name, double salary, String department, String role, Address address, String tel) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.role = role;
        this.address = address;
        this.tel = tel;
    }
}
