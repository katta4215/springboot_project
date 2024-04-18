package com.cyr.springboot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyr.springboot.EmployeeDao.EmployeeDao;
import com.cyr.springboot.model.Employee;

@Transactional
@Service
public class EmployeeServicelmpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public Employee saveEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}
	@Transactional
	  public List<Employee> getAllEmployees() {
		  return employeeDao.findAll();
	  }
	@Transactional
	  public void deleteEmployee(Integer employeeId) {
	      employeeDao.deleteById(employeeId);
	  }
	public Employee getEmployee(int empid) {
	      return employeeDao.getById(empid);
	  }
	public void setEmployeeDao(EmployeeDao employeeDao) {
	      this.employeeDao = employeeDao;
	  }
	public Employee updateEmployee(Employee e) {
		return employeeDao.save(e);
	}
}
