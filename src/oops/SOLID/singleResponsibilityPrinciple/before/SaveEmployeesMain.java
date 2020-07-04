package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee emp : employees){
            try {
                repository.save(emp);
            } catch(Exception exc) {
                System.out.println("Error occurred while persisting the employee: " + exc);
            }
        }
    }
}