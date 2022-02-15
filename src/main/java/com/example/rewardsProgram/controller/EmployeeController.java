package com.example.rewardsProgram.controller;

import com.example.rewardsProgram.requestObjects.Employee;
import com.example.rewardsProgram.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private DepartmentService departmentService;

    @Autowired
    public EmployeeController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping(path = "highestSalary")
    public String findHighestDepartmentSalary(@RequestBody List<Employee> list){

        return departmentService.findDepartment(list);
    }
}
