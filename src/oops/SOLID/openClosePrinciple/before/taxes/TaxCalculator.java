package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalculator {

    public static double calculate(Employee employee) {
    	return employee.calculate();
    }
    
}