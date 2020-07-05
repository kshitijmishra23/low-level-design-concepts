package oops.SOLID.DependencyInversionPrinciple.before.serielizer;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

public class EmployeeFileSerializer implements EmployeeSerializer {

    public String serialize(final Employee employee) {
        return "### EMPLOYEE RECORD ####" +
            System.lineSeparator() +
            "NAME: " +
            employee.getFullName() +
            System.lineSeparator() +
            "POSITION: " +
            employee.getClass().getTypeName() +
            System.lineSeparator() +
            "EMAIL: " +
            employee.getEmail() +
            System.lineSeparator() +
            "MONTHLY WAGE: " +
            employee.getMonthlyIncome() +
            System.lineSeparator();
    }
}
