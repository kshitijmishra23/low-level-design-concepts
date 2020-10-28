package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator implements TaxCalculator {
	
	private final static int INCOME_TAX_PERCENTAGE = 20;
	
	@Override
	public double calculateTax(Employee emp) {
		if(emp.getMonthlyIncome()*12 < 300000){
			return 0;
		}
		return (emp.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
	}

}
