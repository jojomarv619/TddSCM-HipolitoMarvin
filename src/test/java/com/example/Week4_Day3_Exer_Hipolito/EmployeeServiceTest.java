package com.example.Week4_Day3_Exer_Hipolito;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)

public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService = new EmployeeService();

    @Test
    @DisplayName("Given: Employees Earning More than " +
            "When getAllEmployesEarningMoreThan is executed with input of 100000" +
            "Then result should return Jhon and Alejandro")

    public void getAllEmployeesEarningMoreThan() {
        //arrange
        Employee jojo = new Employee("jojo", 27, 90000d, "Jr Dev");
        Employee jhon = new Employee("Jhon", 23, 150000d, "Jr Dev");
        Employee alejandro = new Employee("Alejandro", 23, 250000d, "Jr Dev");
        List<Employee> employees = List.of(jojo, jhon, alejandro);

        Mockito.when(employeeRepository.getAllEmployees())
                .thenReturn(employees);

        List<Employee> filteredEmployees = employeeService.getAllEmployesEarningMoreThan(100000d);

        assertThat(filteredEmployees).contains(jhon, alejandro);
    }

    @Test
    @DisplayName("Given: Employees Earning less than " +
            "When getAllEmployesEarningLessThan is executed with input of 100000" +
            "Then result should return jojo")

    public void getAllEmployeesEarningLessThan() {
        //arrange
        Employee jojo = new Employee("jojo", 27, 90000d, "Jr Dev");
        Employee jhon = new Employee("Jhon", 23, 150000d, "Jr Dev");
        Employee alejandro = new Employee("Alejandro", 23, 250000d, "Jr Dev");
        List<Employee> employees = List.of(jojo, jhon, alejandro);

        Mockito.when(employeeRepository.getAllEmployees())
                .thenReturn(employees);

        //act
        List<Employee> filteredEmployees = employeeService.getAllEmployeesEarningLessThan(100000d);

        //assert
        assertThat(filteredEmployees).contains(jojo);
    }

    @Test
    @DisplayName("Given: Employees age less than " +
            "When getAllEmployeeLessAge is executed with input of 24" +
            "Then result should return jhon, alejandro")

    public void getAllEmployeeLessAge() {
        //arrange
        Employee jojo = new Employee("jojo", 27, 90000d, "Jr Dev");
        Employee jhon = new Employee("Jhon", 23, 150000d, "Jr Dev");
        Employee alejandro = new Employee("Alejandro", 23, 250000d, "Jr Dev");
        List<Employee> employees = List.of(jojo, jhon, alejandro);

        Mockito.when(employeeRepository.getAllEmployees())
                .thenReturn(employees);

        //act
        List<Employee> filteredEmployees = employeeService.getAllEmployeeLessAge(24);

        //assert
        assertThat(filteredEmployees).contains(jhon, alejandro);
    }
}
