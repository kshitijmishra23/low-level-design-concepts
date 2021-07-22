package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public interface iTaxCalculator {
	public double calculateTax(Employee employee);
}
