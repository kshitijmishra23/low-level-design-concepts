package oops.SOLID.singleResponsibilityPrinciple.after;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public List<Employee> findAll(){

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }
    
    
	public void save(Employee employee) {
		try {

			Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");

			StringBuilder sb = EmployeeDataSerializeUtil.format(employee);

			Files.write(path, sb.toString().getBytes());

			System.out.println("Saved employee " + employee.toString());
		} catch (IOException e) {
			System.out.println("ERROR: Could not save employee. " + e);
		}
	}
}