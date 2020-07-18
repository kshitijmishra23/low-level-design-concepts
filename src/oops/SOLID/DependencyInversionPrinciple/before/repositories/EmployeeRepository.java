package oops.SOLID.DependencyInversionPrinciple.before.repositories;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeRepository {
    public List<Employee> findAll();
    public void save(Employee employee) throws IOException;
}
