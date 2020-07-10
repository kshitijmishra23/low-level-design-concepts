package oops.designPatterns.adapter;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;

public class EmployeeAdaptorCSV implements Employee {
  EmployeeCSV employeecsv;

  public EmployeeAdaptorCSV(EmployeeCSV employeecsv) {
    this.employeecsv = employeecsv;
  }

  @Override
  public String getId() {
    return String.valueOf(employeecsv.getId());
  }

  @Override
  public String getFirstName() {
    return employeecsv.getFirstname();
  }

  @Override
  public String getLastName() {
    return employeecsv.getLastname();
  }

  @Override
  public String getEmail() {
    return employeecsv.getEmailAddress();
  }
}
