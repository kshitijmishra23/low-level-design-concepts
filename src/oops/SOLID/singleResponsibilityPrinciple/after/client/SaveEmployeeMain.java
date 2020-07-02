package oops.SOLID.singleResponsibilityPrinciple.after.client;

import java.io.IOException;
import java.util.List;

import oops.SOLID.singleResponsibilityPrinciple.after.employees.Employee;
import oops.SOLID.singleResponsibilityPrinciple.after.loggers.ConsoleLogger;
import oops.SOLID.singleResponsibilityPrinciple.after.repositories.EmployeeRepository;



public class SaveEmployeeMain {

	public static void main(String[] args) {
		// Grab employees
		EmployeeRepository repository = new EmployeeRepository();
		List<Employee> employees = repository.findAll();

		ConsoleLogger consoleLogger = new ConsoleLogger();

		// Save all
		for (Employee e : employees){
			try {
				repository.save(e);
				consoleLogger.writeInfo("Saved employee " + e.toString());
			} catch (IOException exception) {
				exception.printStackTrace();
				consoleLogger.writeError("Error saving employee", exception);
			}
		}
	}
}
