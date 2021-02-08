package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public class PartTimeEmployeeTaxCalculator extends TaxCalculator {
	private final static int INCOME_TAX_PERCENTAGE = 20;
	private final static int PROFESSIONAL_TAX_PERCENTAGE = 3;
	private final static int EDUCATION_CESS = 1;

	public double calculate(Employee employee) {
		return (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100
				+ (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100
				+ (employee.getMonthlyIncome() * EDUCATION_CESS) / 100;

	}
}
