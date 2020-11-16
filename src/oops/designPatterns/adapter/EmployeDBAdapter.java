package oops.designPatterns.adapter;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeDB;

public class EmployeDBAdapter implements Employee {
    private EmployeeDB employeeDB;

    public EmployeDBAdapter(EmployeeDB employeeDB) {
        this.employeeDB = employeeDB;

    }

    @Override
    public String getId() {
        return employeeDB.getId();
    }

    @Override
    public String getFirstName() {
        return employeeDB.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeDB.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeDB.getEmail();
    }
}
