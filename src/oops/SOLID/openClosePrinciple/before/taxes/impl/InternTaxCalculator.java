package oops.SOLID.openClosePrinciple.before.taxes.impl;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class InternTaxCalculator implements TaxCalculator {

    private final int TAX_PERCENTAGE = 15;
    private final int ANNUAL_INCOME_LIMIT = 300000;

    @Override
    public double calculate(Employee employee) {
        if(employee.getMonthlyIncome()*12 < ANNUAL_INCOME_LIMIT)
            return 0;

        return (employee.getMonthlyIncome() * TAX_PERCENTAGE) / 100;
    }
}
