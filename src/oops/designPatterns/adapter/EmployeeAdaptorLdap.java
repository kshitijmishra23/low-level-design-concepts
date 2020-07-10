package oops.designPatterns.adapter;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;
import oops.designPatterns.adapter.employees.EmployeeLdap;

public class EmployeeAdaptorLdap implements Employee {
  EmployeeLdap employeeLdap;

  public EmployeeAdaptorLdap(EmployeeLdap employeeLdap) {
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
