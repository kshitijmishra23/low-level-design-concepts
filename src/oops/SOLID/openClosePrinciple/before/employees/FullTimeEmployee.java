package oops.SOLID.openClosePrinciple.before.employees;

import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculatorFulltime;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

	public double calculateTax() {
		TaxCalculator calculator = new TaxCalculatorFulltime();
		return calculator.calculate(this);
	}
}
