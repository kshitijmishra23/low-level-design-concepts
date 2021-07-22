package oops.SOLID.openClosePrinciple.after.employees;

import oops.SOLID.openClosePrinciple.after.taxes.InternTaxCalculator;

public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

	@Override
	public double calculateTax(Employee employee) {
		InternTaxCalculator internTaxCalculator = new InternTaxCalculator();
		return internTaxCalculator.calculateTax(employee);
	}
}
