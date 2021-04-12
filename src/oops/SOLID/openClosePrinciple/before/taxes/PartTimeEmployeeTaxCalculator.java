package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class PartTimeEmployeeTaxCalculator implements TaxCalculator<PartTimeEmployee> {
    private static final Integer INCOME_TAX = 20;
    private static final Integer PROFESSIONAL_TAX = 3;
    private static final Integer EDUCATION_CESS = 1;

    @Override
    public double calculate(PartTimeEmployee employee) {
        Integer income = employee.getMonthlyIncome();
        return income * INCOME_TAX / 100 + income * PROFESSIONAL_TAX / 100
                + income * EDUCATION_CESS / 100;
    }
}
