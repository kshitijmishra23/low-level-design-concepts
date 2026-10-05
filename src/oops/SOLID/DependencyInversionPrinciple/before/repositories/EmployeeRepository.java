package oops.SOLID.DependencyInversionPrinciple.before.repositories;

import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

public interface EmployeeRepository {
    List<Employee> findAll();
}
