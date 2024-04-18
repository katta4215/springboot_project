package com.cyr.springboot.service;

import java.util.List;

import com.cyr.springboot.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployee(Integer employeeId);
	public Employee getEmployee(int employeeid);
	public Employee updateEmployee(Employee employee);

}
