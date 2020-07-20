package oops.SOLID.singleResponsibilityPrinciple.before.repository;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import oops.SOLID.singleResponsibilityPrinciple.before.model.Employee;
import oops.SOLID.singleResponsibilityPrinciple.before.model.FullTimeEmployee;
import oops.SOLID.singleResponsibilityPrinciple.before.model.PartTimeEmployee;
import oops.SOLID.singleResponsibilityPrinciple.before.util.ConsoleLogger;

public class EmployeeRepository {
	
	EmployeePersistanceManager employeePersistanceManager;
	
	public EmployeeRepository() {
		employeePersistanceManager = new EmployeePersistanceManager();
	}

    public List<Employee> findAll(){

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }
    
    public void save(Employee employee) throws IOException{
    	
    	employeePersistanceManager.saveToFile(employee);

		ConsoleLogger.info("Saved employee " + employee.toString());
	}
}