package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public interface  ITaxCalculator {
    double calculate(Employee employee);
}