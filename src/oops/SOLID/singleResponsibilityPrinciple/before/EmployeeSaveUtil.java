package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveEmployeeUtil {

	public static void saveData(Employee employee) {
		try {
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
