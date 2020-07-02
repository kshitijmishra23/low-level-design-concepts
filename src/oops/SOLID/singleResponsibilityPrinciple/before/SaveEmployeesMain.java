package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
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
            } catch (IOException exc) {
                System.out.println("ERROR: Could not save employee. " + exc);
            }
        }
    }
}