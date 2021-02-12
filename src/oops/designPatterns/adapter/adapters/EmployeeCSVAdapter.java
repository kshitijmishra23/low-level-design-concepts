package oops.designPatterns.adapter.adapters;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;

public class EmployeeCSVAdapter implements Employee {
	
	private EmployeeCSV instance;
	
	public EmployeeCSVAdapter(EmployeeCSV instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return String.valueOf(instance.getId());
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

	@Override
	public String toString() {
		return "EmployeeCSVAdapter [getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getEmail()=" + getEmail() + "]";
	}
	

}
