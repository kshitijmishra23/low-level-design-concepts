package oops.designPatterns.adapter.adapter;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeLdap;

public class LdapEmployeeAdapter implements Employee {

    private final EmployeeLdap employee;

    public LdapEmployeeAdapter(final EmployeeLdap employee){
        this.employee = employee;
    }

    @Override
    public String getId() {
        return employee.getCn();
    }

    @Override
    public String getFirstName() {
        return employee.getGivenName();
    }

    @Override
    public String getLastName() {
        return employee.getSurname();
    }

    @Override
    public String getEmail() {
        return employee.getMail();
    }

    @Override
    public String toString() {
        return this.convertToString();
    }
}
