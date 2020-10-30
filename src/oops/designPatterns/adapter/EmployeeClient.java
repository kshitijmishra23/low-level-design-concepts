package oops.designPatterns.adapter;


import java.util.ArrayList;
import java.util.List;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;
import oops.designPatterns.adapter.employees.EmployeeDB;
import oops.designPatterns.adapter.employees.EmployeeLdap;
import oops.designPatterns.adapter.employees.EmployeeCSVAdapter;
import oops.designPatterns.adapter.employees.EmployeeLdapAdapter;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		
		//EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");		
		Employee employeeFromLdap = new EmployeeLdapAdapter(new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com"));
		
		//EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
		Employee employeeFromCSV = new EmployeeCSVAdapter(new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com"));
		//We have to add the data of all the employees to the employees list
		//But it only accepts objects of type Employee
		
		employees.add(employeeFromDB);
		employees.add(employeeFromLdap);
		employees.add(employeeFromCSV);
		
		return employees;
		
	}
	
}
