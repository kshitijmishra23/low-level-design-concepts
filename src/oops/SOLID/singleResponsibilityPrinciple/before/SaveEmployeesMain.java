package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            // e.save(); 
            try {
                SaveUtility.employeeFileSaveUtil(e);
                System.out.println("Saved employee " + e.toString());
            } catch (IOException ex){
                System.out.println("ERROR: Could not save employee. " + ex);
            }
        }
    }
}
