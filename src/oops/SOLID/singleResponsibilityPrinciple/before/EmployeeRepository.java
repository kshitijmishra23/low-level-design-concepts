package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public List<Employee> findAll(){
        return EmployeeList.getInstance().getEmployeeList();
        // Employees are kept in memory for simplicity
    }

    public void saveAll(List<Employee> empLi){
        for(Employee employee : empLi){
            try {
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

                Path path = Paths.get(employee.getFullName()
                        .replace(" ","_") + ".rec");

                Files.write(path, sb.toString().getBytes());

                EmployeeList.getInstance().getEmployeeList().add(employee);

                System.out.println("Saved employee " + employee.toString());


            } catch (IOException e){
                System.out.println("ERROR: Could not save employee. " + e);
            }
        }
    }
}