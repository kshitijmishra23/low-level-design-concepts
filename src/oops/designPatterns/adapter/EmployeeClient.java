package oops.designPatterns.adapter;


import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;
import oops.designPatterns.adapter.employees.EmployeeDB;
import oops.designPatterns.adapter.employees.EmployeeLdap;
import oops.designPatterns.adapter.factory.EmployeeAdapterFactory;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	private final EmployeeAdapterFactory factory;

	public EmployeeClient(final EmployeeAdapterFactory factory){
		this.factory = factory;
	}

	public List<Employee> getEmployeeList() {

		final List<Employee> employees = new ArrayList<>();

		employees.add(
			factory.getAdapter(new EmployeeDB("1234", "John", "Wick", "john@wick.com")));
		employees.add(
			factory.getAdapter(new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com")));
		employees.add(
			factory.getAdapter(new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com")));

		return employees;
	}
	
}
