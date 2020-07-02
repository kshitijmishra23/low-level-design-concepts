package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {

    public static final ApplicationLogger logger = new ApplicationLogger();

    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees) {
            try {
                repository.save(e);
                logger.info("Saved employee " + e.toString());
            } catch (IOException exception) {
                logger.error("ERROR: Could not save employee.", exception);
            }
        }
    }
}