package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EmployeeSerializer {
    public static String serialize(Employee employee) {
        String sb = "### EMPLOYEE RECORD ####" +
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
        return sb.toString();
    }
}