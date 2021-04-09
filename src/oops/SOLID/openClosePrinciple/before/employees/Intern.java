package oops.SOLID.openClosePrinciple.before.employees;

import oops.SOLID.openClosePrinciple.before.taxes.InternTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

	@Override
	public double taxCalculate() {
		// TODO Auto-generated method stub
		TaxCalculator calculator = new InternTaxCalculator();
		return calculator.calculate(this);
	}
}
