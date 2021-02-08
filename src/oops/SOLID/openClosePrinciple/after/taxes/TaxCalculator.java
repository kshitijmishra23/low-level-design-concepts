package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public abstract class TaxCalculator {

	public abstract double calculate(Employee employee);
}