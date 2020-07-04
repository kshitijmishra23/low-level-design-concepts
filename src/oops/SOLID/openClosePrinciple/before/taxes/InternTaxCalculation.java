package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculation implements TaxCalculator{
	
	private final int INCOME_TAX_PERCENTAGE = 15;

	@Override
	public double calculate(Employee employee) {
		// TODO Auto-generated method stub
		if (employee.getMonthlyIncome()<30000)
		{
			return 0;
		}
		else
		{
			return 
	                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 ;
		}
	}
}