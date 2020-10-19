package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}