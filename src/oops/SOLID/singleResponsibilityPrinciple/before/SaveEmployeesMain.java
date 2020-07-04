package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SaveEmployeesMain {
	
	private static String className = SaveEmployeesMain.class.getName();
	
	public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        Logger logger = new Logger();
        // Save all
		for (Employee e : employees) {
			try {
				repository.save(e);
				logger.logInfo(className, e.toString());
			} catch (Exception exc) {
				logger.logError(className, exc);
			}
		}
    }
}