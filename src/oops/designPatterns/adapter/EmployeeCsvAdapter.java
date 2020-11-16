package oops.designPatterns.adapter;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;

public class EmployeeCsvAdapter implements Employee {
    private EmployeeCSV employeeCSV;

    public EmployeeCsvAdapter(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }


    @Override
    public String getId() {
        return String.valueOf(employeeCSV.getId());
    }

    @Override
    public String getFirstName() {
        return  employeeCSV.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }
}
