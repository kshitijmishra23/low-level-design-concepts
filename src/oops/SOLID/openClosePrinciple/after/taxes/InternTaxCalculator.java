package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public class InternTaxCalculator extends TaxCalculator {
	private final static int INCOME_TAX_PERCENTAGE = 15;

	private final static int NO_TAX_SLAB = 300000;

	public double calculate(Employee employee) {

		if (employee.getMonthlyIncome() * 12 < NO_TAX_SLAB) {
			return 0D;
		} else {
			return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
		}

	}
}
