package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class FullTimeEmpTaxCalculate implements TaxCalculator{
	
	private final static int INCOME_TAX_PERCENTAGE = 30;
	private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
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
