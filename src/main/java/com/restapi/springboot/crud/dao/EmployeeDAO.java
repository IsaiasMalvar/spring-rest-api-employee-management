package com.restapi.springboot.crud.dao;


import com.restapi.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save (Employee theEmployee);

    void deleteById(int theId);

}
