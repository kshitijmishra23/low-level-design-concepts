package oops.SOLID.openClosePrinciple.after.persistence;

import java.util.Arrays;
import java.util.List;

import oops.SOLID.openClosePrinciple.after.employees.Employee;
import oops.SOLID.openClosePrinciple.after.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.after.employees.PartTimeEmployee;
import oops.SOLID.openClosePrinciple.after.employees.Intern;

public class EmployeeRepository {

	public List<Employee> findAll() {

		// Employees are kept in memory for simplicity
		Employee anna = new FullTimeEmployee("Anna Smith", 2000);
		Employee billy = new FullTimeEmployee("Billy Leech", 920);

		Employee steve = new PartTimeEmployee("Steve Jones", 800);
		Employee magda = new PartTimeEmployee("Magda Iovan", 920);
		
		Employee sagar = new Intern("Sagar Iovan", 200, 20);

		return Arrays.asList(anna, billy, steve, magda,sagar);
	}
}