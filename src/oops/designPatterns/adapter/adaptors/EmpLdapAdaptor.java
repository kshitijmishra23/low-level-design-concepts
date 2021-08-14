package oops.designPatterns.adapter.adaptors;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeLdap;

public class EmpLdapAdaptor implements Employee {
    EmployeeLdap ldap;
    public EmpLdapAdaptor(EmployeeLdap ldap){
        this.ldap=ldap;
    }

    @Override
    public String getId() {
        return ldap.getCn();
    }

    @Override
    public String getFirstName() {
        return ldap.getGivenName();
    }

    @Override
    public String getLastName() {
        return ldap.getSurname();
    }

    @Override
    public String getEmail() {
        return ldap.getMail();
    }
}
