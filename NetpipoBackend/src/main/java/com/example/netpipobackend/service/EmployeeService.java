package com.example.netpipobackend.service;

import org.springframework.stereotype.Service;

import com.example.netpipobackend.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class EmployeeService {

    private Map<String, Employee> employeeRepository = new HashMap<>();

    public Employee createEmployee(Employee employee) {
        String uuid = UUID.randomUUID().toString();  // Generate a UUID
        long id = uuid.hashCode();  // Convert UUID String to long (you could use other methods)
        
        employee.setId(id);  // Set the long ID
        
        employeeRepository.put(uuid, employee);  // Save to repository (UUID is the key)
        return employee;
    }
    
    // Get all employees
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeRepository.values());
    }

    // Get an employee by ID
    public Employee getEmployeeById(String id) {
        return employeeRepository.get(id);
    }

    // Update employee details
    public Employee updateEmployee(String id, Employee employeeDetails) {
        Employee existingEmployee = employeeRepository.get(id);
        if (existingEmployee != null) {
            existingEmployee.setName(employeeDetails.getName());
            existingEmployee.setEmail(employeeDetails.getEmail());
            existingEmployee.setPosition(employeeDetails.getPosition());
            existingEmployee.setSalary(employeeDetails.getSalary());
            return existingEmployee;
        }
        return null;
    }

    // Delete an employee
    public boolean deleteEmployee(String id) {
        if (employeeRepository.containsKey(id)) {
            employeeRepository.remove(id);
            return true;
        }
        return false;
    }
}
