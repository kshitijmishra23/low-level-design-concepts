package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Intern;

public class InternTaxCalculator implements TaxCalculator<Intern>{

    @Override
    public double calculate(Intern employee) {
        Integer income = employee.getMonthlyIncome();
        if (income < 300000) {
            return 0;
        } else {
            return income * 15/100;
        }
    }
}
