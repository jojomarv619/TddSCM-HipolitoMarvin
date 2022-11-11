package com.example.Week4_Day3_Exer_Hipolito;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EmployeeRepositoryFromCSVTest {


    @Test
    @DisplayName("" +
            "Given a csv in datastore.csv" +
            "when employeeRepositoryFROMCSV is executed" +
            "THEN it should return valid Employee objects")
    public void positiveCase() {
        //arrange
        EmployeeRepository employeeRepository = new EmployeeRepositoryFromCSV();


        //act

        List<Employee> employeesFromCSV = employeeRepository.getAllEmployees();

        //assert

        List<Employee> expectedEmployees = List.of(
                new Employee("jojo", 27, 20000d, "semimaster"),
                new Employee("ali", 23, 200000d, "master"),
                new Employee("dondon", 26, 2000000d, "seniormaster")
        );
        assertEquals(expectedEmployees, employeesFromCSV);
    }
}