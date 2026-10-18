package oops.designPatterns.adapter.employees;

public class EmployeeCSVAdapter implements Employee {

	private final EmployeeCSV employee;

	public EmployeeCSVAdapter(EmployeeCSV employee) {
		this.employee = employee;
	}

	@Override
	public String getId() {
		return String.valueOf(employee.getId());
	}

	@Override
	public String getFirstName() {
		return employee.getFirstname();
	}

	@Override
	public String getLastName() {
		return employee.getLastname();
	}

	@Override
	public String getEmail() {
		return employee.getEmailAddress();
	}

	@Override
	public String toString() {
		return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName()
				+ ", Email: " + getEmail();
	}
}
