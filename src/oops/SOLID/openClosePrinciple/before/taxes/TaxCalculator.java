package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 20;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 3;


    public static double calculate(Employee employee) {
        List<Integer> taxDetails = employee.getTaxDetails();
        return 
                (employee.getMonthlyIncome() * taxDetails.get(0)) / 100 +
                (employee.getMonthlyIncome() * taxDetails.get(1)) / 100 +
                (employee.getMonthlyIncome() * taxDetails.get(2)) / 100;

    }
}