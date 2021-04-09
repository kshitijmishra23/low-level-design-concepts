package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalculatorIntern implements TaxCalculator {

	public double calculate(Employee employee) {
		final int INCOME_TAX_PERCENTAGE = 15;

		if(employee.getMonthlyIncome() < 300000)
			return 0;
		else
			return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
	}

}
