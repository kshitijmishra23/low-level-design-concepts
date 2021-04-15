package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository implements Serializable {

    private final List<Employee> employees;

    public EmployeeRepository() {
        this.employees = new ArrayList<>();
    }

    public void save(Employee employee) {
        try {
            String serializedEmployeeObjectString = employee.serialize();
            Path path = Paths.get(employee.getFullName()
                    .replace(" ","_") + ".rec");
            Files.write(path, serializedEmployeeObjectString.getBytes());
            System.out.println("Saved employee " + employee.toString());
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> findAll() {
        return employees;
    }
}