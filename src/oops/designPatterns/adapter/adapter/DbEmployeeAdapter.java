package oops.designPatterns.adapter.adapter;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeDB;

public class DbEmployeeAdapter implements Employee {

    private final EmployeeDB employee;

    public DbEmployeeAdapter(final EmployeeDB employee){
        this.employee = employee;
    }

    @Override
    public String getId() {
        return String.valueOf(employee.getId());
    }

    @Override
    public String getFirstName() {
        return employee.getFirstName();
    }

    @Override
    public String getLastName() {
        return employee.getLastName();
    }

    @Override
    public String getEmail() {
        return employee.getEmail();
    }

    @Override
    public String toString() {
        return this.convertToString();
    }
}
