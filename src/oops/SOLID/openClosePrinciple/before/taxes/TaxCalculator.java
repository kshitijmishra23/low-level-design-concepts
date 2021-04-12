package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public interface TaxCalculator<T extends Employee> {
    double calculate(T employee);
}