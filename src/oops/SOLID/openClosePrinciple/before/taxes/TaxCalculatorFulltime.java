package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalculatorFulltime implements TaxCalculator {

	public double calculate(Employee employee) {
	    final int INCOME_TAX_PERCENTAGE = 30;
	    final int PROFESSIONAL_TAX_PERCENTAGE = 2;
	    final int EDUCATIONAL_TAX_PERCENTAGE = 1;

        return 
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * EDUCATIONAL_TAX_PERCENTAGE) / 100;
	}
}
