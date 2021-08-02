package oops.SOLID.singleResponsibilityPrinciple.after;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        SaveToDisk util = new SaveToDisk();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            util.saveEmployee(e);
        }
    }
}