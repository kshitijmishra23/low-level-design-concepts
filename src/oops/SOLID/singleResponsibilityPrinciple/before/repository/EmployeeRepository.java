package oops.SOLID.singleResponsibilityPrinciple.before.repository;

import oops.SOLID.singleResponsibilityPrinciple.before.config.EmployeeConfig;
import oops.SOLID.singleResponsibilityPrinciple.before.model.Employee;
import oops.SOLID.singleResponsibilityPrinciple.before.model.FullTimeEmployee;
import oops.SOLID.singleResponsibilityPrinciple.before.model.PartTimeEmployee;
import oops.SOLID.singleResponsibilityPrinciple.before.serializer.EmployeeSerializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    private EmployeeSerializer employeeSerializer;
    private EmployeeConfig config;

    public EmployeeRepository() {
        // Initializing these here for simplicity, but ideally they should be passed as dependencies
        this.config = new EmployeeConfig();
        this.employeeSerializer = new EmployeeSerializer();
    }

    public List<Employee> findAll() {

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }

    /**
     * Saves the details of Employee to a file
     * @param employee
     */
    public void save(Employee employee) {

        String serializedEmployee = employeeSerializer.toString(employee);

        try {
            Path path = Paths.get(config.getRecordLocation(employee));
            Files.write(path, serializedEmployee.getBytes());

            System.out.println("Saved employee " + employee.toString());

        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}