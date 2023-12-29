package com.devsuperior.dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.depedencias.services.SalaryService;
import com.devsuperior.dependencias.entities.Employee;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DependenciasApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;
	
	public static void main(String[] args) {
		SpringApplication.run(DependenciasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria",1000.00);
		System.out.println(salaryService.netSalary(employee));
		
	}

}
