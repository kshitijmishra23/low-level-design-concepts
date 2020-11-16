package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeeWriter {
    private EmployeeWriter() { }

    private static String serializeEmployee(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("### EMPLOYEE RECORD ####");
        sb.append(System.lineSeparator());
        sb.append("NAME: ");
        sb.append(employee.getFirstName() + " " + employee.getLastName());
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

    private static Path getFilePath(Employee employee) {
        Path path = Paths.get(employee.getFullName()
                .replace(" ","_") + ".rec");
        return path;
    }

    public static void save(Employee employee) {
        try {
            String employeeData = serializeEmployee(employee);
            Files.write(getFilePath(employee), employeeData.getBytes());

            System.out.println("Saved employee " + employee.toString());
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}
