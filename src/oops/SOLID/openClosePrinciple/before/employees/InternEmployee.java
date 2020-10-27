package oops.SOLID.openClosePrinciple.before.employees;

public class InternEmployee extends Employee {
    public InternEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(15);
    }
}