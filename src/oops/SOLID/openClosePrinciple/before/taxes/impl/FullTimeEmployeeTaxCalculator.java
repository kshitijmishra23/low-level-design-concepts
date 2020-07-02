package oops.SOLID.openClosePrinciple.before.taxes.impl;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class FullTimeEmployeeTaxCalculator implements TaxCalculator {

    private final int INCOME_TAX_PERCENTAGE = 30;
    private final int PROFESSIONAL_TAX_PERCENTAGE = 2;
    private final int EDUCATION_CESS_PERCENTAGE = 1;

    @Override
    public double calculate(Employee employee) {
        return
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
                        (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 +
                        (employee.getMonthlyIncome() * EDUCATION_CESS_PERCENTAGE) / 100;
    }
}
