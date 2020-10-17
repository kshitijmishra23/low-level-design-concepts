package oops.SOLID.singleResponsibilityPrinciple.before;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import oops.SOLID.singleResponsibilityPrinciple.before.serializer.EmployeeFileSerializer;
import oops.SOLID.singleResponsibilityPrinciple.before.logger.Logger;


public class EmployeeRepository {

    public List<Employee> findAll(){

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }
    
    public static void save(Employee employee) throws Exception {
    	String employeeFileSerialized = EmployeeFileSerializer.serializeEmployee(employee);
        Path path = Paths.get(employee.getFullName().replace(" ","_") + ".rec");
        Files.write(path, employeeFileSerialized.getBytes());
        Logger.log("Saved employee " + employee.toString());
    }
}