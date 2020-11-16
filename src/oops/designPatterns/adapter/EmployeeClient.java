package oops.designPatterns.adapter;


import java.util.ArrayList;
import java.util.List;


import oops.designPatterns.adapter.employees.*;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();
		
		EmployeeDB employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");		
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
		
		//We have to add the data of all the employees to the employees list
		//But it only accepts objects of type Employee
		Employee employeeCsv = new EmployeeCsvAdapter(employeeFromCSV);
		Employee employeeLdap = new EmployeeLdapAdapter(employeeFromLdap);
		Employee employeeDb =  new EmployeDBAdapter(employeeFromDB);

		employees.add(employeeCsv);
		employees.add(employeeDb);
		employees.add(employeeLdap);


		return employees;
		
	}
	
}
