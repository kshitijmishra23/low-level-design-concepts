package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public class TaxCalculatorIntern implements TaxCalculator{
    private final static int TAX_FREE = 300000;
    private final static int TAX_PERCENTAGE = 15;

    @Override
    public double calculate(Employee employee) {
        if(employee.getMonthlyIncome() * 12 <= TAX_FREE)
            return 0D;

        return (employee.getMonthlyIncome()*12*TAX_PERCENTAGE)/100;
    }
}
