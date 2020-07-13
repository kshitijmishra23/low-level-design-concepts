package oops.designPatterns.adapter.employeeAdapters;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;

public class EmployeeAdapterCSV implements Employee {

	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}
	
	@Override
	public String getId() {
		return instance.getId() + "";
	}

	@Override
	public String getFirstName() {
		return instance.getFirstname();
	}

	@Override
	public String getLastName() {
		return instance.getLastname();
	}

	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}

}
