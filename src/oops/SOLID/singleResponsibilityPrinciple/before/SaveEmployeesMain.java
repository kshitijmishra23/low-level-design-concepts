package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class SaveEmployeesMain {

    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> employees = employeeRepository.findAll();

        // Save all
        for (Employee e : employees) {
            employeeRepository.save(e);
        }
    }
}