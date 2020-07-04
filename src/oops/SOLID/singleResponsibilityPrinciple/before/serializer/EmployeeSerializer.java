package oops.SOLID.singleResponsibilityPrinciple.before.serializer;

import oops.SOLID.singleResponsibilityPrinciple.before.model.Employee;

public class EmployeeSerializer {

    /**
     * Serializes an employee to a record structure
     * @param employee
     */
    public String toString(Employee employee) {

        StringBuilder sb = new StringBuilder();

        sb.append("### EMPLOYEE RECORD ####");
        sb.append(System.lineSeparator());
        sb.append("NAME: ");
        sb.append(employee.getFullName());
        sb.append(System.lineSeparator());
        sb.append("POSITION: ");
        sb.append(employee.getClass().getTypeName());
        sb.append(System.lineSeparator());
        sb.append("EMAIL: ");
        sb.append(employee.getEmail());
        sb.append(System.lineSeparator());
        sb.append("MONTHLY WAGE: ");
        sb.append(employee.getMonthlyIncome());
        sb.append(System.lineSeparator());

        return sb.toString();
    }
}