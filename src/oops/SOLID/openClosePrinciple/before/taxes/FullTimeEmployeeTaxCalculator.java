package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class FullTimeEmployeeTaxCalculator extends TaxCalculator{
    private final static int INCOME_TAX_PERCENTAGE = 30;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
    private final static int EDUCATIONAL_CESS_PERCENTAGE = 1;

    private static FullTimeEmployeeTaxCalculator instance = null;

    private FullTimeEmployeeTaxCalculator() { }

    public static synchronized FullTimeEmployeeTaxCalculator getInstance() {
        if(instance == null)
            instance = new FullTimeEmployeeTaxCalculator();
        return instance;
    }

    @Override
    public double calculate(Employee employee) {
        return (employee.getMonthlyIncome() * EDUCATIONAL_CESS_PERCENTAGE) / 100.0 +
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100.0 +
                        (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100.0;

    }
}