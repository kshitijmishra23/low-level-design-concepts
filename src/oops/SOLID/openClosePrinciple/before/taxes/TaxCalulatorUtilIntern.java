package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalulatorUtilIntern implements TaxCalculatorUtil{
    private final static int INCOME_TAX_PERCENTAGE = 15;
    
	@Override
	public double calculate(Employee employee) {
		if(employee.getMonthlyIncome()*12<300000)
			return 0;
      return 
      (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;

	}

}
