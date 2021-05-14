package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator extends TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 15;
    private final static int TAX_FREE_LIMIT = 300000;


    public static double calculate(Employee employee) {
        if(employee.getMonthlyIncome() * 12 <= TAX_FREE_LIMIT){
            return 0;
        }

        return
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100;

    }
}