package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class PTETaxCalculator implements TaxCalculator {
	
	private final static int INCOME_TAX_PERCENTAGE = 20;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 3;
    private final static int EDUCATIONAL_CESS = 1;
    
	@Override
	public double calculateTax(Employee emp) {
		return 
	              (emp.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
	              (emp.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 +
	              (emp.getMonthlyIncome() * EDUCATIONAL_CESS)/100 ;
	}

}
