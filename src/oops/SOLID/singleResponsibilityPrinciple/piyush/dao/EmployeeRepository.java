package oops.SOLID.singleResponsibilityPrinciple.piyush.dao;

import oops.SOLID.singleResponsibilityPrinciple.piyush.model.*;
import oops.SOLID.singleResponsibilityPrinciple.piyush.serializer.FileSerializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

  public List<Employee> findAll() {

    // Employees are kept in memory for simplicity
    Employee anna = new FullTimeEmployee("Anna Smith", 2000);
    Employee billy = new FullTimeEmployee("Billy Leech", 920);

    Employee steve = new PartTimeEmployee("Steve Jones", 800);
    Employee magda = new PartTimeEmployee("Magda Iovan", 920);

    return Arrays.asList(anna, billy, steve, magda);
  }

  public void save(Employee employee) throws IOException {

    FileSerializer employeeFileSerializer = new FileSerializer();
    String employeeSerialized = employeeFileSerializer.serialize(employee);

    Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
    Files.write(path, employeeSerialized.getBytes());
  }
}
