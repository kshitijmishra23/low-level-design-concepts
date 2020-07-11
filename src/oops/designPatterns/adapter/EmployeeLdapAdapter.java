package oops.designPatterns.adapter;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeLdap;

public class EmployeeLdapAdapter implements Employee {

    private EmployeeLdap employeeLdap;

    public EmployeeLdapAdapter(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getId();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getEmail();
    }
}
