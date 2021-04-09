package oops.SOLID.openClosePrinciple.before.employees;

import oops.SOLID.openClosePrinciple.before.taxes.PartTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }

	@Override
	public double taxCalculate() {
		// TODO Auto-generated method stub
		TaxCalculator calculator = new PartTimeEmployeeTaxCalculator();
		return calculator.calculate(this);
	}
}