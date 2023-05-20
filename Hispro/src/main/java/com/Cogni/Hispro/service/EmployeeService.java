package com.Cogni.Hispro.service;

import java.util.List;


import com.Cogni.Hispro.model.Employee;

public interface EmployeeService {
List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
Employee getEmployeeById(long id);
void deleteEmployeeById(long id);
}
