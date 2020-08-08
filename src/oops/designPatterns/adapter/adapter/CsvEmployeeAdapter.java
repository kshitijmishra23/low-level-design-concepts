package oops.designPatterns.adapter.adapter;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;

public class CsvEmployeeAdapter implements Employee {

    private final EmployeeCSV employee;

    public CsvEmployeeAdapter(final EmployeeCSV employee){
        this.employee = employee;
    }

    @Override
    public String getId() {
        return String.valueOf(employee.getId());
    }

    @Override
    public String getFirstName() {
        return employee.getFirstname();
    }

    @Override
    public String getLastName() {
        return employee.getLastname();
    }

    @Override
    public String getEmail() {
        return employee.getEmailAddress();
    }

    @Override
    public String toString() {
        return this.convertToString();
    }
}
