package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalculatorIntern implements ITaxCalculator {
//    - If annual income < 300000 => no tax
//- Else => only 15% income tax

    private int INCOME_TAX_PERCENTAGE = 2;
    @Override
    public double calculate(Employee employee) {
        if(employee.getMonthlyIncome()<300000)
            return 0;
        else
            return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
    }
}
