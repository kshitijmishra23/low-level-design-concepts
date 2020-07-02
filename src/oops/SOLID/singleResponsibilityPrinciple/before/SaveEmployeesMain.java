package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {

    private static Logger logger = new Logger(SaveEmployeesMain.class);

    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            try {
                EmployeeRepository.save(e);
            } catch (IOException ioException) {
                logger.error("ERROR: Could not save employee.", ioException);
            }
        }
    }
}