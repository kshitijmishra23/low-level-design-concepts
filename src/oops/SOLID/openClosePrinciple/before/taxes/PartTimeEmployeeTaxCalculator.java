package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class PartTimeEmployeeTaxCalculator  implements TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 20;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 3;
    private final static int EDUCATION_TAX_PERCENTAGE = 1;

    public double calculate(Employee employee) {
        return calculateIncomeTax(employee) + calculateProfessionalTax(employee) +calculateEducationTax(employee);
    }

    @Override
    public double calculateIncomeTax(Employee employee) {
        return employee.getMonthlyIncomePercentage(INCOME_TAX_PERCENTAGE);
    }

    @Override
    public double calculateProfessionalTax(Employee employee) {
        return employee.getMonthlyIncomePercentage(PROFESSIONAL_TAX_PERCENTAGE);
    }

    @Override
    public double calculateEducationTax(Employee employee) {
        return employee.getMonthlyIncomePercentage(EDUCATION_TAX_PERCENTAGE);
    }
}