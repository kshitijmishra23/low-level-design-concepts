package oops.designPatterns.adapter.employeeAdapters;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeLdap;

public class EmployeeLdapAdapter implements Employee {
    private EmployeeLdap employeeLdap;

    public EmployeeLdapAdapter(EmployeeLdap employeeLdap){
        this.employeeLdap = employeeLdap;
    }

    @Override
    public String getId() {
        return this.employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return this.employeeLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return this.employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return this.employeeLdap.getMail();
    }
}
