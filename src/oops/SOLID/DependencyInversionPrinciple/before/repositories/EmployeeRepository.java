package oops.SOLID.DependencyInversionPrinciple.before.repositories;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    void save(final Employee employee) throws IOException;
}
