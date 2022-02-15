package com.example.rewardsProgram.services;

import com.example.rewardsProgram.requestObjects.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Override
    public String findDepartment(List<Employee> employees) {
        HashMap<String, Long> departmentList = new HashMap<>();
        String largestDepartmentSalary = "";
        for (Employee e: employees) {
            if(departmentList.containsKey(e.getDepartmentName())){
                String temp = e.getDepartmentName();
                long salary = e.getSalary();
                departmentList.put(temp, (departmentList.get(temp) + salary));
            }else
            departmentList.put(e.getDepartmentName(), e.getSalary());
        }
        long max = Collections.max(departmentList.values());
        for (String department: departmentList.keySet()) {
            if(departmentList.get(department) == max) {
                largestDepartmentSalary = department + ": " + departmentList.get(department);
                break;
            }
        }
        return largestDepartmentSalary;
    }
}

