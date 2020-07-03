package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class FullTimeEmployeeTaxCalculator implements TaxCalculator {

    private Integer PROFESSIONAL_TAX_PERCENTAGE = 30;
    private Integer INCOME_TAX_PERCENTAGE = 2;
    private Integer EDUCATION_CESS = 1;

    @Override
    public double calculate(Employee employee) {
        return
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
                        (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 +
                        (employee.getMonthlyIncome() * EDUCATION_CESS) / 100;
    }
}
