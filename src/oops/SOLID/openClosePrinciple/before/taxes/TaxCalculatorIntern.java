package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalculatorIntern extends TaxCalculator {

    private final int INCOME_TAX_PERCENTAGE = 15;


    public double calculate(Employee employee) {
        return employee.getMonthlyIncome() * 12 < 300000 ? 0 : (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;

    }
}