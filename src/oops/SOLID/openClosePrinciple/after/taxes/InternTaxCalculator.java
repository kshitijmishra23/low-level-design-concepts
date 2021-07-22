package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public class InternTaxCalculator implements iTaxCalculator {
	private final static int INCOME_TAX_PERCENTAGE = 15;
	
	@Override
	public double calculateTax(Employee employee) {
				if(employee.getMonthlyIncome()*12 < 300000)
					return 0;
				else
					return ((employee.getMonthlyIncome() / 100)
							* (INCOME_TAX_PERCENTAGE));
	}

}
