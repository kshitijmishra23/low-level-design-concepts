package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        final Writer<Employee> employeeWriter = new EmployeeFileWriter(new CustomStringSerializer());
        final EmployeeRepository repository = new EmployeeRepository(employeeWriter);

        repository.findAll().stream().forEach(employee -> saveEmployee(repository, employee));
    }

    private static void saveEmployee(final EmployeeRepository repository, final Employee employee){
        try {
            repository.save(employee);
        }
        catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}