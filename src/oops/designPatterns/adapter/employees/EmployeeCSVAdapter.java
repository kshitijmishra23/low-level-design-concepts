class EmployeeCSVAdapter implements Employee{
  EmployeeCSV e;

	EmployeeCSVAdapter(EmployeeCSV Emp) {
		e = Emp;
	}

	public String getId() {
		return e.getId() + "";
	}

	public String getFirstName() {
		return e.getId();
	}

	public String getLastName() {
		return e.getLastname();
	}

	public String getEmail() {
		return e.getEmailAddress();
	}
}
