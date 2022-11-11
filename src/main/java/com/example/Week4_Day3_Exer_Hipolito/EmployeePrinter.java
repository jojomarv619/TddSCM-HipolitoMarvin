package com.example.Week4_Day3_Exer_Hipolito;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLOutput;
import java.util.List;

public class EmployeePrinter implements EmployeeReporter  {

    @Autowired
    EmployeeService employeeService = new EmployeeService();


    @Override
    public void report(){

        List<Employee> employeesEarningMoreThan100K = employeeService.getAllEmployesEarningMoreThan(100000d);

        System.out.println("Here are the employees earning more than 100K");
        employeesEarningMoreThan100K.forEach(e -> System.out.println(
                "Name: " + e.getName() + "\n" +
                "Age:" + e.getAge() + "\n" +
                "Position: " + e.getPosition()
        ));
    }
}
