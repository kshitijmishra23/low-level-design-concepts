package oops.SOLID.openClosePrinciple.after.employees;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

	@Override
	public EmployeeType getEmployeeType() {
		return EmployeeType.FULL_TIME;
	}
}
