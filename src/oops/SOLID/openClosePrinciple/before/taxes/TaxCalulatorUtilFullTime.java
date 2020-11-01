package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalulatorUtilFullTime implements TaxCalculatorUtil {
    private final static int INCOME_TAX_PERCENTAGE = 30;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
    private final static int EDUCATIONAL_TAX_PERCENTAGE = 1;
    
	@Override
	public double calculate(Employee employee) {
      return 
      (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
      (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100+
      (employee.getMonthlyIncome() * EDUCATIONAL_TAX_PERCENTAGE)/100;

	}
}





