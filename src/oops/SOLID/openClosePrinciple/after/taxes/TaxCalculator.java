package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}