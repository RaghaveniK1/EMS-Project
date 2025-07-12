package com.example.demo.service;
import com.example.demo.Employee;
import java.util.List;

public interface EmployeeService {
	List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    Employee createEmployee(Employee employee);
    void deleteEmployee(Long id);
	

}
