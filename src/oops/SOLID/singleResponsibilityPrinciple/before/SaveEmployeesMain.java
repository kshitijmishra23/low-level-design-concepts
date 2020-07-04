package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
        	try{
        		EmployeeRepository.save(e);
        	} 
        	catch (IOException exception) {
        		System.out.println("Failed to save employee: "+e.getFullName());
        		System.out.println("Error message: " +exception.getStackTrace().toString());
			}
        }
    }
}