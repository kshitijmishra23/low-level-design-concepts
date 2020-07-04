package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;


public class InternTaxCalculator extends TaxCalculator{

    private final int INCOME_TAX_PERCENTAGE = 15;
    private final int MIN_INCOME_LIMIT = 300000;

    @Override
    public double calculate(final Employee employee) {
        if (employee.getMonthlyIncome() < MIN_INCOME_LIMIT){
            return 0;
        }
        return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
    }


}
