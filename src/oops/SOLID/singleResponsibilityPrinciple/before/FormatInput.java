package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FormatInput {

	public FormatInput(Employee employee) throws IOException {
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

		new FileSaveDAO(employee, sb);
		System.out.println("Saved employee " + employee.toString());
	}

}
