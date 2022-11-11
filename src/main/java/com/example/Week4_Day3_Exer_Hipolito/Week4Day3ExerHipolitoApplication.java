package com.example.Week4_Day3_Exer_Hipolito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week4Day3ExerHipolitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week4Day3ExerHipolitoApplication.class, args);

		EmployeePrinter employeePrinter = new EmployeePrinter();
		employeePrinter.report();
	}


}
