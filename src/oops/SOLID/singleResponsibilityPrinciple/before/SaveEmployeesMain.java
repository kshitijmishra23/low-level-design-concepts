package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.util.List;

import oops.SOLID.singleResponsibilityPrinciple.before.exception.EmployeePersistException;
import oops.SOLID.singleResponsibilityPrinciple.before.model.Employee;
import oops.SOLID.singleResponsibilityPrinciple.before.repository.EmployeeRepository;
import oops.SOLID.singleResponsibilityPrinciple.before.util.ConsoleLogger;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            try {
				repository.save(e);
			} catch (IOException e1) {
				ConsoleLogger.error("Exception caught while saving employee data");
				throw new EmployeePersistException(e1);
			}
        }
    }
}