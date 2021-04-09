package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator implements TaxCalculator{
	
	@Override
	public double calculate(Employee emp) {
		int income = emp.getMonthlyIncome();
		if(income * 12 < 300000)
			return 0;
		else
			return (income * 12 * 15)/100;
	}

}
