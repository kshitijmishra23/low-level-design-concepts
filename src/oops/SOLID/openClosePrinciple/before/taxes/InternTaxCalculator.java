package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator implements Taxable{
    private final int INCOME_TAX_PERCENTAGE = 15;
    private final int NO_TAX_INCOME_THRESHOLD = 30000;

    @Override
    public double calculate(Employee employee) {
        if (employee.getAnnualIncome() < NO_TAX_INCOME_THRESHOLD) {
            return 0.0;
        }

        return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100.0;
    }
}
