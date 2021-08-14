package oops.designPatterns.adapter.adaptors;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;

public class EmpCSVAdaptor implements Employee {
    EmployeeCSV csv;
    public EmpCSVAdaptor(EmployeeCSV csv){
        this.csv=csv;
    }

    @Override
    public String getId() {
        return csv.getId()+"";
    }

    @Override
    public String getEmail() {
        return csv.getEmailAddress();
    }

    @Override
    public String getFirstName() {
        return csv.getLastname();
    }

    @Override
    public String getLastName() {
        return csv.getLastname();
    }
}
