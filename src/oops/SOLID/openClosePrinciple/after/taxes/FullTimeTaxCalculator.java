package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public class FullTimeTaxCalculator implements iTaxCalculator{

	 	private final static int INCOME_TAX_PERCENTAGE = 30;
	    private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
	    private final static int EDUCATIONAL_TAX_PERCENTAGE = 1;

	@Override
	public double calculateTax(Employee employee) {
		
		
		return ((employee.getMonthlyIncome() /100)*
				(INCOME_TAX_PERCENTAGE + 
						PROFESSIONAL_TAX_PERCENTAGE +
						    EDUCATIONAL_TAX_PERCENTAGE));
	}

}
