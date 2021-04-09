package oops.SOLID.openClosePrinciple.before.employees;

import oops.SOLID.openClosePrinciple.before.taxes.FullTimeEmpTaxCalculate;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

	@Override
	public double taxCalculate() {
		// TODO Auto-generated method stub
		TaxCalculator calculator = new FullTimeEmpTaxCalculate();
		return calculator.calculate(this); // Employee emp = new FullTimeEmployee()
	}
}
