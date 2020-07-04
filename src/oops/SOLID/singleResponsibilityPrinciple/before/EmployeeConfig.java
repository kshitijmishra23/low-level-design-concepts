package oops.SOLID.singleResponsibilityPrinciple.before;

import oops.SOLID.singleResponsibilityPrinciple.before.model.Employee;

public class EmployeeConfig {

    public String getRecordLocation(Employee employee) {
        return employee.getFullName()
                .replace(" ","_") + ".rec";
    }
}
