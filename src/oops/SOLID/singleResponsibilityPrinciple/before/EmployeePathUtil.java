package oops.SOLID.singleResponsibilityPrinciple.before;

import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeePathUtil {
	
	public static Path getPath(Employee employee)
	{
		Path path = Paths.get(employee.getFullName()
                .replace(" ","_") + ".rec");
		
		return path;
	}

}
