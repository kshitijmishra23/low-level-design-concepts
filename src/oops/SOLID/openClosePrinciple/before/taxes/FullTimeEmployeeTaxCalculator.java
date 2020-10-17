package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class FullTimeEmployeeTaxCalculator implements ITaxCalculator{
    private final static int INCOME_TAX_PERCENTAGE = 30;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
    private final static int EDUCATIONAL_CESS = 1;

    @Override
    public double calculate(Employee employee) {
        double monthlyIncome = employee.getMonthlyIncome();
        return (monthlyIncome * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
                (monthlyIncome * INCOME_TAX_PERCENTAGE) / 100+
                (monthlyIncome * EDUCATIONAL_CESS) / 100;
    }
}
