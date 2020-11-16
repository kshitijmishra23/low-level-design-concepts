package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class PTETaxCalculator implements TaxPayable {
    private final int INCOME_TAX_PERCENTAGE = 20;
    private final int PROFESSIONAL_TAX_PERCENTAGE = 3;
    private final int EDUCATIONAL_CESS = 1;

	@Override
	public double calcualteTax(Employee employee) {
		 return (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
	        	(employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 + 
	        	(employee.getMonthlyIncome() * EDUCATIONAL_CESS)/100;
	}

}
