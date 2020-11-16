package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator implements TaxPayable {

    private final int INCOME_TAX_PERCENTAGE = 15;
    private final int SALARY_LIMIT = 300000;

	@Override
	public double calcualteTax(Employee employee) {
		// TODO Auto-generated method stub
		if (employee.getMonthlyIncome() < SALARY_LIMIT) {
			return 0;
		} else {
			 return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
		}
	}

}
