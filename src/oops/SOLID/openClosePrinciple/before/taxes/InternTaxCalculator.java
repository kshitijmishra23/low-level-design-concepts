package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator extends TaxCalculator{
    private final static int INCOME_TAX_PERCENTAGE = 15;
    private final static long ANNUAL_INCOME_THRESHOLD_FOR_TAX_EXEMPTION = 300000;

    private static InternTaxCalculator instance = null;

    private InternTaxCalculator() { }

    public static synchronized InternTaxCalculator getInstance() {
        if(instance == null)
            instance = new InternTaxCalculator();
        return instance;
    }

    @Override
    public double calculate(Employee employee) {
        if(employee.getMonthlyIncome() < ANNUAL_INCOME_THRESHOLD_FOR_TAX_EXEMPTION)
            return 0;
        return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100.0;

    }
}