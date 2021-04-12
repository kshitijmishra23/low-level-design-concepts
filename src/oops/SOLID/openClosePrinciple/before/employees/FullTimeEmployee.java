package oops.SOLID.openClosePrinciple.before.employees;

import oops.SOLID.openClosePrinciple.before.taxes.FullTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

    @Override
    public double calculateTax() {
        TaxCalculator<FullTimeEmployee> taxCalculator = new FullTimeEmployeeTaxCalculator();
        return taxCalculator.calculate(this);
    }
}
