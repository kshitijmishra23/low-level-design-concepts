package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class FTETaxCalculator implements TaxCalculator {
	
	private final static int INCOME_TAX_PERCENTAGE = 30;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
    private final static int EDUCATIONAL_CESS = 1;
    
	@Override
	public double calculateTax(Employee emp) {
		return 
              (emp.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
              (emp.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 +
              (emp.getMonthlyIncome() * EDUCATIONAL_CESS)/100 ;
	}

}
