package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator implements TaxCalculator {

    private Integer TAX_PERCENTAGE = 15;
    private Integer MIN_TAX = 3;

    @Override
    public double calculate(Employee employee) {
        return
                employee.getMonthlyIncome() < MIN_TAX ? 0 :
                        (employee.getMonthlyIncome() * TAX_PERCENTAGE) / 100;
    }
}
