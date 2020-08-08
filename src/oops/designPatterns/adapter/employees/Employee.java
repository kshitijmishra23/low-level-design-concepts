package oops.designPatterns.adapter.employees;


public interface Employee {

	public String getId();
	public String getFirstName();
	public String getLastName();
	public String getEmail();

	default String convertToString() {
		return this.getClass().getTypeName() +
			"{" +
			"id=" + getId() +
			", firstName='" + getFirstName() + '\'' +
			", lastName='" + getLastName() + '\'' +
			", emailAddress='" + getEmail() + '\'' +
			'}';
	}

}
