package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class PartTimeEmployeeTaxCalculator extends TaxCalculator {
    private static final int INCOME_TAX_PERCENTAGE = 20;
    private static final int PROFESSIONAL_TAX_PERCENTAGE = 3;
    private static final int EDUCATION_CESS = 1;

    @Override
    public double calculate(final Employee employee) {
        return ((double)employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
            ((double)employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 +
            ((double)employee.getMonthlyIncome() * EDUCATION_CESS) / 100;
    }
}
