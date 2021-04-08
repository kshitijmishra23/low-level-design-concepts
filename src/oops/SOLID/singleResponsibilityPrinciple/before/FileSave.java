package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSave implements Save<Employee> {

	@Override
	public void saveRecord(Employee... record) {
		try {

			for (Employee employee : record) {

				Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
				Files.write(path, employee.employeeFormat().getBytes());

				System.out.println("Saved employee " + employee.toString());
			}

		} catch (IOException e) {
			System.out.println("ERROR: Could not save employee. " + e);
		}
	}

}
