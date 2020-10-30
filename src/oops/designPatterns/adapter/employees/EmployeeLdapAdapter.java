class EmployeeLdapAdapter implements Employee{
  EmployeeLdap e;

	EmployeeCSVAdapter(EmployeeCSV Emp) {
		e = Emp;
	}

	public String getId() {
		return e.getCn();
	}

	public String getFirstName() {
		return e.getGivenName();
	}

	public String getLastName() {
		return e.getSurname();
	}

	public String getEmail() {
		return e.getMail();
	}
}
