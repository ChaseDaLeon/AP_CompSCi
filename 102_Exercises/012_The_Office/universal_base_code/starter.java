/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee Chanosh = new Employee(1234, "Chanosh", "Leeone", 34053);
		michael.raiseSalary(20);
		Dwight.raiseSalary(50);
		Jim.raiseSalary(30);
		Pam.raiseSalary(30);
		Chanosh.raiseSalary(88);
		michael.employeeToString();
		Dwight.employeeToString();
		Jim.employeeToString();
		Pam.employeeToString();
		Chanosh.employeeToString();
		Double michaelSalary = michael.getAnnualSalary();
		Double dwightSalary = Dwight.getAnnualSalary();
		Double jimSalary = Jim.getAnnualSalary();
		Double pamSalary = Pam.getAnnualSalary();
		Double chanoshSalary = Chanosh.getAnnualSalary();
		System.out.println(michaelSalary);
		System.out.println(dwightSalary);
		System.out.println(jimSalary);
		System.out.println(pamSalary);
		System.out.println(chanoshSalary);




	}
}
