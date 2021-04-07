package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public class TaxCalculatorPartTimeEmp implements TaxCalculator{
    private final static int INCOME_TAX_PERCENTAGE = 20;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 3;
    private final static int EDUCATION_CESS_PERCENTAGE = 1;

    @Override
    public double calculate(Employee employee) {
        return
                (employee.getMonthlyIncome()* 12 * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
                        (employee.getMonthlyIncome()* 12 * INCOME_TAX_PERCENTAGE) / 100 +
                        (employee.getMonthlyIncome()* 12 * EDUCATION_CESS_PERCENTAGE)/100;
    }
}
