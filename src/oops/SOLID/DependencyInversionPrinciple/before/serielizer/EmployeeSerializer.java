package oops.SOLID.DependencyInversionPrinciple.before.serielizer;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

public interface EmployeeSerializer {
    String serialize(final Employee employee);
}
