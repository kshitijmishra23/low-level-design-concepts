package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternEmployeeTaxCalculator implements Taxable {
    private final int INCOME_TAX_PERCENTAGE = 15;
    private final int ANNUAL_INCOME_THRESHOLD = 300000;

    @Override
    public double calculate(Employee employee) {
        if (employee.getMonthlyIncome() < ANNUAL_INCOME_THRESHOLD) return 0;
        return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100.0;
    }
}