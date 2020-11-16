package oops.SOLID.openClosePrinciple.before.employees;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.PART_TIME_EMPLOYEE;
    }
}