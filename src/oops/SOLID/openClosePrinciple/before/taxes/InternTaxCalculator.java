package oops.SOLID.openClosePrinciple.before.taxes;

public class InternTaxCalculator implements TaxCalculator{
    private static final double INCOME_THRESHOLD = 300000.0;
    private static final double INCOME_TAX_PERCENTAGE = 15.0;
    public double calculate(Employee e) {
        float income = e.getMonthlyIncome();
        if (income > INCOME_THRESHOLD) {
            return income * INCOME_TAX_PERCENTAGE / 100 ;
        };
    } 
}
