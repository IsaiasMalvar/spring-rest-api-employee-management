package com.restapi.springboot.crud.rest;

import com.restapi.springboot.crud.dao.EmployeeDAO;
import com.restapi.springboot.crud.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll () {
        return employeeDAO.findAll();
    }
}
