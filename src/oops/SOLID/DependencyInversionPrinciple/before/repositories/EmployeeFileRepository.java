package oops.SOLID.DependencyInversionPrinciple.before.repositories;


import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.DependencyInversionPrinciple.before.employees.PartTimeEmployee;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeSerializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.util.Arrays.asList;

/*
Helper method to perform CRUD operations on employees. In a production
application we could use the database for persistence. In this demo,
we are storing employees in the file system.
 */

public class EmployeeFileRepository implements EmployeeRepository {

    private final EmployeeSerializer serializer;

    public EmployeeFileRepository(final EmployeeSerializer serializer) {
        this.serializer = serializer;
    }

    public List<Employee> findAll() {
        final Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        final Employee billy = new FullTimeEmployee("Billy Leech", 920);

        final Employee steve = new PartTimeEmployee("Steve Jones", 800);
        final Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return asList(anna, billy, steve, magda);
    }

    public void save(final Employee employee) throws IOException {
        final Path path = Paths.get( getFileName( employee.getFullName()));
        Files.write(path, serializer.serialize(employee).getBytes());
    }

    private String getFileName(final String employeeName){
        return employeeName.replace(" ", "_") + ".rec";
    }
}
