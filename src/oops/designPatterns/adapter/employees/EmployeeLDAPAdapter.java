package oops.designPatterns.adapter.employees;

public class EmployeeLDAPAdapter implements Employee {

	private final EmployeeLdap employee;

	public EmployeeLDAPAdapter(EmployeeLdap employee) {
		this.employee = employee;
	}

	@Override
	public String getId() {
		return employee.getCn();
	}

	@Override
	public String getFirstName() {
		return employee.getGivenName();
	}

	@Override
	public String getLastName() {
		return employee.getSurname();
	}

	@Override
	public String getEmail() {
		return employee.getMail();
	}

	@Override
	public String toString() {
		return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName()
				+ ", Email: " + getEmail();
	}
}
