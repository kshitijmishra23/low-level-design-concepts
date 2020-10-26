package oops.designPatterns.adapter.employeeAdapters;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;

public class EmployeeCSVAdapter implements Employee {
    private EmployeeCSV employeeCSV;

    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId(){
        return String.valueOf(this.employeeCSV.getId());
    }

    @Override
    public String getFirstName(){
        return this.employeeCSV.getFirstname();
    }

    @Override
    public String getLastName(){
        return this.employeeCSV.getLastname();
    }

    @Override
    public String getEmail(){
        return this.employeeCSV.getEmailAddress();
    }
}
