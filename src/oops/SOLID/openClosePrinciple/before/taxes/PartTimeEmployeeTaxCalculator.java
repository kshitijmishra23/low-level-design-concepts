package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class PartTimeEmployeeTaxCalculator implements TaxCalculator{

	private final static int INCOME_TAX_PERCENTAGE = 20;
	private final static int PROFESSIONAL_TAX_PERCENTAGE = 3;
	private final static int EDUCATION_CESS = 1;

	@Override
	public double calculate(Employee emp) {
		// TODO Auto-generated method stub
		return 
              (emp.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE * 12) / 100 +
              (emp.getMonthlyIncome() * INCOME_TAX_PERCENTAGE * 12) / 100 +
              (emp.getMonthlyIncome() * EDUCATION_CESS * 12) / 100;
	}

}
