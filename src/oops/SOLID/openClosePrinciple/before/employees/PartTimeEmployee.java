package oops.SOLID.openClosePrinciple.before.employees;

import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculatorPartTime;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }

	public double calculateTax() {
		TaxCalculator calculator = new TaxCalculatorPartTime();
		return calculator.calculate(this);
	}
}