package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator extends TaxScheme {
    private final int INCOME_TAX_PERCENTAGE = 15;
    @Override
    public  double calculateTax(Employee employee) {
        if(employee.getMonthlyIncome()*12<300000)
            return 0;
        else
            return (employee.getMonthlyIncome()*INCOME_TAX_PERCENTAGE)/100.0;
    }
}
