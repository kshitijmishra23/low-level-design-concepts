package oops.SOLID.openClosePrinciple.before.employees;

import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculatorIntern;

public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

	public double calculateTax() {
		TaxCalculator calculator = new TaxCalculatorIntern();
		return calculator.calculate(this);
	}
}
