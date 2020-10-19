package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class PartTimeEmployeeTaxCalculator extends TaxCalculator{
    private final static int INCOME_TAX_PERCENTAGE = 20;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 3;
    private final static int EDUCATIONAL_CESS_PERCENTAGE = 1;

    private static PartTimeEmployeeTaxCalculator instance = null;

    private PartTimeEmployeeTaxCalculator() { }

    public static synchronized PartTimeEmployeeTaxCalculator getInstance() {
        if(instance == null)
            instance = new PartTimeEmployeeTaxCalculator();
        return instance;
    }

    @Override
    public double calculate(Employee employee) {
        return (employee.getMonthlyIncome() * EDUCATIONAL_CESS_PERCENTAGE) / 100.0 +
                        (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100.0 +
                        (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100.0;

    }
}