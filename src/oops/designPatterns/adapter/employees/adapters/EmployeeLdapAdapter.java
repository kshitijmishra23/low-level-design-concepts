package oops.designPatterns.adapter.employees.adapters;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeLdap;

public class EmployeeLdapAdapter implements Employee {
    private final EmployeeLdap employeeLdap;

    @Override
    public String toString() {
        return employeeLdap.toString();
    }

    public EmployeeLdapAdapter(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getMail();
    }
}
