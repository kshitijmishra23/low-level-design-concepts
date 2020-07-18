package oops.SOLID.DependencyInversionPrinciple.before.serielizer;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

public interface EmployeeSerializer {
    public String serialize(Employee employee);
}
