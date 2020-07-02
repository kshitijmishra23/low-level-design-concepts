package oops.SOLID.openClosePrinciple.before.taxes;


import oops.SOLID.openClosePrinciple.before.employees.Employee;

public abstract class TaxScheme {
    public abstract double calculateTax(Employee employee);
}
