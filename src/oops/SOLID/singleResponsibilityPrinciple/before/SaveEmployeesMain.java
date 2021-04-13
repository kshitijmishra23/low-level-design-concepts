package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            repository.save(e);
        }
    }

     public static void save(Employee employee){
        try {
        	Employee employee =this;
            StringBuilder sb = new StringBuilder();
            sb.append("### EMPLOYEE RECORD ####");
            sb.append(System.lineSeparator());
            sb.append("NAME: ");
            sb.append(employee.firstName + " " + employee.lastName);
            sb.append(System.lineSeparator());
            sb.append("POSITION: ");
            sb.append(employee.getClass().getTypeName());
            sb.append(System.lineSeparator());
            sb.append("EMAIL: ");
            sb.append(employee.getEmail());
            sb.append(System.lineSeparator());
            sb.append("MONTHLY WAGE: ");
            sb.append(employee.monthlyIncome);
            sb.append(System.lineSeparator());

            Path path = Paths.get(employee.getFullName()
                    .replace(" ","_") + ".rec");
            Files.write(path, sb.toString().getBytes());

            System.out.println("Saved employee " + employee.toString());
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}