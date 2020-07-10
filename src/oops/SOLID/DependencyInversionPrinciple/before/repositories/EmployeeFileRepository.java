package oops.SOLID.DependencyInversionPrinciple.before.repositories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.DependencyInversionPrinciple.before.employees.Intern;
import oops.SOLID.DependencyInversionPrinciple.before.employees.PartTimeEmployee;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeFileSerializer;

/*
Helper method to perform CRUD operations on employees. In a production
application we could use the database for persistence. In this demo,
we are storing employees in the file system.
 */

public class EmployeeFileRepository {
  private EmployeeFileSerializer serializer;

  public EmployeeFileRepository(EmployeeFileSerializer serializer) {
    this.serializer = serializer;
  }

  public List<Employee> findAll() {
    // Employees are kept in memory for simplicity
    Employee anna = new FullTimeEmployee("Anna Smith", 2000);
    Employee billy = new FullTimeEmployee("Billy Leech", 920);

    Employee steve = new PartTimeEmployee("Steve Jones", 800);
    Employee magda = new PartTimeEmployee("Magda Iovan", 920);

    return Arrays.asList(anna, billy, steve, magda);
  }

  public void save(Employee employee) throws IOException {
    String serializedString = this.serializer.serialize(employee);

    Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
    Files.write(path, serializedString.getBytes());
  }

  private Employee createEmployeeFromCsvRecord(String line) {
    String[] employeeRecord = line.split(",");
    String name = employeeRecord[0];
    int income = Integer.parseInt(employeeRecord[1]);
    int nbHours = Integer.parseInt(employeeRecord[2]);

    Employee employee;
    if (nbHours == 40) {
      employee = new FullTimeEmployee(name, income);
    } else if (nbHours == 20) {
      employee = new PartTimeEmployee(name, income);
    } else {
      employee = new Intern(name, income, nbHours);
    }
    return employee;
  }
}
