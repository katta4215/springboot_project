package com.cyr.springboot.EmployeeDao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyr.springboot.model.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{

}
