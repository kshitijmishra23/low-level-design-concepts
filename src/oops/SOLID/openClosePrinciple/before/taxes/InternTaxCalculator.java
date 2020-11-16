package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator extends TaxCalculator {
    private static final int INCOME_TAX_PERCENTAGE = 15;
    private static final int THRESHOLD = 300000;

    @Override
    public double calculate(final Employee employee) {
        return employee.getMonthlyIncome() >= THRESHOLD ?
            ((double)employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 :
            0;
    }
}
