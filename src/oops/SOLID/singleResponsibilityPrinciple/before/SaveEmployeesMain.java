package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class SaveEmployeesMain {

    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        try {
            for (Employee e : employees) {
                repository.save(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}