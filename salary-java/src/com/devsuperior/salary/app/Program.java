package com.devsuperior.salary.app;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.salary.entities.Employee;
import com.devsuperior.salary.services.BrazilTaxService;
import com.devsuperior.salary.services.PensionService;
import com.devsuperior.salary.services.SalaryService;
import com.devsuperior.salary.services.TaxService;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salário bruto: ");
		double grossSalary = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary);
		
		TaxService taxService = new BrazilTaxService();
		PensionService pensionService = new PensionService();
		SalaryService salaryService = new SalaryService(taxService, pensionService);
		
		
		double netSalary = salaryService.netSalary(employee);
		System.out.printf("Salário líquido = %.2f%n", netSalary);
		
		sc.close();

	}

}
