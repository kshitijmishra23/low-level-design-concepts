package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
		for (Employee e : employees) {
			try {
				repository.save(e);
			} catch (Exception exc) {
				// TODO Auto-generated catch block
				exc.printStackTrace();
			}
		}
    }
}