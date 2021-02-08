package oops.SOLID.openClosePrinciple.after.employees;

public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

	@Override
	public EmployeeType getEmployeeType() {
		return EmployeeType.INTERN;
	}
}
