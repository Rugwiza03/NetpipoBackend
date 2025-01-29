package com.example.netpipobackend.service;

public class Employee {

    private long id;       // Employee ID
    private String name;     // Employee Name
    private String email;    // Employee Email
    private String position; // Employee Position
    private double salary;   // Employee Salary

    // Constructor
    public Employee( String name, String email, String position, double salary) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.salary = salary;
    }

    // Getter and Setter for id
    public long getId() {
        return id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for position
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Employee createEmployee(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createEmployee'");
    }

   
   

}
