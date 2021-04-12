package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;

public class FullTimeEmployeeTaxCalculator implements TaxCalculator<FullTimeEmployee> {
    private static final Integer INCOME_TAX = 30;
    private static final Integer PROFESSIONAL_TAX = 2;
    private static final Integer EDUCATION_CESS = 1;

    @Override
    public double calculate(FullTimeEmployee employee) {
        Integer income = employee.getMonthlyIncome();
        return income * INCOME_TAX / 100 + income * PROFESSIONAL_TAX / 100
                + income * EDUCATION_CESS / 100;
    }
}
