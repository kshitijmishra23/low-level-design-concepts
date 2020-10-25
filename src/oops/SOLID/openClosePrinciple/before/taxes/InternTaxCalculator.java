package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class
InternTaxCalculator implements ITaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 10;
    private final static int INCOME_THRESHOLD = 300000;

    @Override
    public double calculate(Employee employee) {
        double monthlyIncome = employee.getMonthlyIncome();
        if (monthlyIncome * 12 > INCOME_THRESHOLD) {
            return (monthlyIncome * INCOME_TAX_PERCENTAGE) / 100;
        }
        return 0;
    }
}
