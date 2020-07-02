package oops.SOLID.openClosePrinciple.before.taxes;


import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class FullTimeEmployeeTaxCalculator extends TaxScheme {
    private final int INCOME_TAX_PERCENTAGE = 20;
    private final int PROFESSIONAL_TAX_PERCENTAGE = 3;
    private final int EDUCATION_CESS = 1;

    @Override
     public double calculateTax(Employee employee) {
        double totalTax = (INCOME_TAX_PERCENTAGE + PROFESSIONAL_TAX_PERCENTAGE + EDUCATION_CESS)/100.0;
        return employee.getMonthlyIncome()*totalTax;
    }
}
