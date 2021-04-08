package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {
	
     List<Employee> employees = new ArrayList<Employee>();
     
     
	public EmployeeRepository(){
		
		  // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);
        addEmployee(anna, billy, steve, magda);
	}
	
	public  void addEmployee(Employee... employees) {
			this.employees.addAll(Arrays.asList(employees));
	}

    public List<Employee> findAll(){
        return employees;
    }
    
    public  void save(Employee... employees){
        try {
        	
        	for (Employee employee : employees) {
               

                Path path = Paths.get(employee.getFullName()
                        .replace(" ","_") + ".rec");
                Files.write(path, employee.employeeFormat().getBytes());

                System.out.println("Saved employee " + employee.toString());
        	}
        	
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}