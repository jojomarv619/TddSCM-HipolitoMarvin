package com.example.Week4_Day3_Exer_Hipolito;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository = new EmployeeRepositoryFromCSV();

    public List<Employee> getAllEmployesEarningMoreThan(Double amount){
        return employeeRepository.getAllEmployees().stream().filter(employee -> employee.getSalary() > amount)
                .collect(Collectors.toList());
    }

    public List<Employee> getAllEmployeesEarningLessThan(Double amount) {
        return employeeRepository.getAllEmployees().stream().filter(employee -> employee.getSalary() < amount)
                .collect(Collectors.toList());
    }

    public List<Employee> getAllEmployeeLessAge(int age){
        return employeeRepository.getAllEmployees().stream().filter(employee -> employee.getAge() < age)
                .collect(Collectors.toList());
    }

    public List<Employee> getAllEmployeeLowestSalary(Double amount){
        return employeeRepository.getAllEmployees().stream().filter(employee -> employee.getSalary() > amount)
                .collect(Collectors.toList());
    }


}
