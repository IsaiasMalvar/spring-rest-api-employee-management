package com.restapi.springboot.crud.dao;


import com.restapi.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

}
