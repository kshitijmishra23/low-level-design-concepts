package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator implements TaxCalculator {

	private final int INCOME_TAX_PERCENTAGE = 15;
	private final int MIN_SALARY_FOR_TAX = 300000;

	@Override
	public double calculate(Employee employee) {
		if (employee.getAnnualIncome() > MIN_SALARY_FOR_TAX) {
			return (employee.getAnnualIncome() * INCOME_TAX_PERCENTAGE) / 100;
		}
		return 0;
	}

}
