package oops.SOLID.openClosePrinciple.before.taxes;

public class PartTimeEmployeeTaxCalculator implements TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 30;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
    public double calculate(Employee e) {
        return (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
        (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
    }
}
