package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersistEmployeeData implements PersistData {

	Employee employee;

	public PersistEmployeeData(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void save() {
		try {

			Path path = Paths.get(this.employee.getFullName().replace(" ", "_") + ".rec");
			String employeeData = extractEmployeeDataToSave();
			Files.write(path, employeeData.getBytes());
			System.out.println("Saved employee " + this.employee.toString());

		} catch (IOException e) {
			System.out.println("ERROR: Could not save employee. " + e);
		}
	}

	public String extractEmployeeDataToSave() {
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