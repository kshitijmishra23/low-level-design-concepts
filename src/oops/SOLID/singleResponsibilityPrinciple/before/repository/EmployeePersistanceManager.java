package oops.SOLID.singleResponsibilityPrinciple.before.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import oops.SOLID.singleResponsibilityPrinciple.before.model.Employee;
import oops.SOLID.singleResponsibilityPrinciple.before.util.EmployeeSerializer;

public class EmployeePersistanceManager {
	
	public void saveToFile(Employee employee) throws IOException {		
		String seralizedEmployee = EmployeeSerializer.serialize(employee);

		Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
		Files.write(path, seralizedEmployee.getBytes());	
	}

}
