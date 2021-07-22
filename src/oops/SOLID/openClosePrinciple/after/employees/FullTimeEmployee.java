package oops.SOLID.openClosePrinciple.after.employees;

import oops.SOLID.openClosePrinciple.after.taxes.FullTimeTaxCalculator;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

	@Override
	public double calculateTax(Employee employee) {
		FullTimeTaxCalculator fullTimeTaxCalculator = new FullTimeTaxCalculator();
		return fullTimeTaxCalculator.calculateTax(employee);
	}
}
